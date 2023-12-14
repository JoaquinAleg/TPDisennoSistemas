package pantalla;


import java.awt.EventQueue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;

import CustomRenderers.ListadoDTORenderer;
import DTOS.ClienteDTO;
import DTOS.DatosPolizaDTO;
import DTOS.ListadoDTO;
import DTOS.NombresDTO;
import DTOS.InfoVehicularDTO;
import Gestores.GestorAPI;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;
import POJOS.Empleado;
import POJOS.Provincia;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;


public class CrearPoliza_1 extends JFrame {
	
	private GestorPoliza gestorPoliza;
	private GestorCliente gestorCliente;
	private GestorAPI gestorAPI;
	private NombresDTO nombresDTO;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_Asegurado;
	private JTextField text_Motor;
	private JTextField text_Patente;
	private JTextField text_Chasis;
	private JTextField text_Kilometros;
	private Float valorSumaAsegurada;
	private JComboBox<ListadoDTO> text_Siniestros;
	private ListadoDTO ProvinciaSeleccionada;
	private Long[] idProvincia;
	private ListadoDTO[] localidades;
	private JComboBox<ListadoDTO> LocalidadRiesgo = new JComboBox<>();
	private List<ListadoDTO> localidadDTO;
	private String ModeloSeleccionado;
	private Long[] idMarcaVehiculo;
	private ListadoDTO[] modelos;
	private List<ListadoDTO> modelosDTO;
	private JComboBox<ListadoDTO> modeloVehiculo = new JComboBox<>();
	private ListadoDTO[] anios;
	private Long[] idModeloVehiculo;
	private List<ListadoDTO> anioDTO;
	private JComboBox<ListadoDTO> MarcaVehiculo_1 = new JComboBox<>();
	private Long numeroCliente;
	private ListadoDTO marcaParaPantalla;
	private ListadoDTO modeloParaPantalla;
	private ClienteDTO clienteDTO;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {/*
					GestorPoliza gestorPoliza = GestorPoliza.getInstance();
					GestorCliente gestorCliente = GestorCliente.getInstance();
					CrearPoliza_1 frame = new CrearPoliza_1(gestorPoliza, gestorCliente, null);
					frame.setVisible(true);
				*/} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrearPoliza_1(GestorPoliza gestorP, GestorCliente gestorC, JFrame anterior, ClienteDTO clienteDTO) {
		this.gestorPoliza = gestorP;
		this.gestorCliente = gestorC;
		this.clienteDTO = clienteDTO;
		this.gestorAPI = GestorAPI.getInstance();
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("El Asegurado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1256, 821);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{10, 0, 10, 0};
		gbl_contentPane.rowHeights = new int[]{10, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		String numeroClienteS = clienteDTO.getNumeroCliente().toString();
		this.numeroCliente = clienteDTO.getIdCliente();
		//CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE////CLIENTE//
		//List<ClienteDTO> clientesDTO = this.gestorCliente.getClientes();
		//System.out.println(String.valueOf(clientesDTO.get(0).getNumeroCliente()));
		//System.out.println(clientesDTO.get(0).getNombre());
		//Long[] idCliente = clientesDTO.stream().filter(a -> a.getNumeroCliente().equals(numeroCliente)).map(b -> b.getNumeroCliente()).toArray(Long[]::new);
		
		//ClienteDTO clienteDTO = gestorCliente.getClienteDTO(idCliente[0]);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("Crear Póliza");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_5_1.setBorder(null);
		panel_3.add(lblNewLabel_5_1);
		JLabel lblDatosDeLa_1 = new JLabel("Datos de la póliza - Cliente nro: " + numeroClienteS);
		lblDatosDeLa_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDatosDeLa_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDatosDeLa_1 = new GridBagConstraints();
		gbc_lblDatosDeLa_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDatosDeLa_1.gridx = 0;
		gbc_lblDatosDeLa_1.gridy = 1;
		panel.add(lblDatosDeLa_1, gbc_lblDatosDeLa_1);
		lblDatosDeLa_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Provincia del Riesgo (*):");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(50, 70, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		//PROVINCIA--RIESGO/////////////////////////////////////////////////////////////////
		List<ListadoDTO> provinciaDTO = this.gestorPoliza.getProvincias();
		//ANTERIOR
		//String[] provincias = provinciaDTO.stream().map(p -> p.getNombre()).toArray(String[]::new);	
		//JComboBox<String> ProvinciaRiesgo = new JComboBox<>(provincias);
		//NUEVO
		ListadoDTO[] provincias = this.gestorPoliza.getProvincias().toArray(new ListadoDTO[provinciaDTO.size()]);
		JComboBox<ListadoDTO> ProvinciaRiesgo = new JComboBox<>(provincias);
		ProvinciaRiesgo.setRenderer(new ListadoDTORenderer());
		ProvinciaRiesgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ProvinciaSeleccionada = (String)ProvinciaRiesgo.getSelectedItem();
				ProvinciaSeleccionada = (ListadoDTO)ProvinciaRiesgo.getSelectedItem();
				//idProvincia = provinciaDTO.stream().filter(a -> a.getNombre().equals(ProvinciaSeleccionada)).map(b -> b.getId()).toArray(Long[]::new);
				//localidadDTO = gestorPoliza.getLocalidades(idProvincia[0]);
				localidadDTO = gestorPoliza.getLocalidades(ProvinciaSeleccionada.getId());
				localidades = localidadDTO.toArray(new ListadoDTO[localidadDTO.size()]);
				//localidades = localidadDTO.stream().map(p -> p.getNombre()).toArray(String[]::new);
				DefaultComboBoxModel<ListadoDTO> nuevoModelo = new DefaultComboBoxModel<>(localidades);
				LocalidadRiesgo.setModel(nuevoModelo);
			}
		});
		ProvinciaRiesgo.setBackground(SystemColor.inactiveCaptionBorder);
		ProvinciaRiesgo.setToolTipText("");
		ProvinciaRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_ProvinciaRiesgo = new GridBagConstraints();
		gbc_ProvinciaRiesgo.insets = new Insets(50, 0, 5, 30);
		gbc_ProvinciaRiesgo.fill = GridBagConstraints.HORIZONTAL;
		gbc_ProvinciaRiesgo.gridx = 1;
		gbc_ProvinciaRiesgo.gridy = 0;
		panel_1.add(ProvinciaRiesgo, gbc_ProvinciaRiesgo);
		
		JLabel lblNewLabel_1 = new JLabel("Localidad del Riesgo (*):");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		//LOCALIDAD--RIESGO/////////////////////////////////////////////////////////////////
		LocalidadRiesgo.setRenderer(new ListadoDTORenderer());
		LocalidadRiesgo.setBackground(SystemColor.inactiveCaptionBorder);
		LocalidadRiesgo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_LocalidadRiesgo = new GridBagConstraints();
		gbc_LocalidadRiesgo.insets = new Insets(50, 0, 5, 70);
		gbc_LocalidadRiesgo.fill = GridBagConstraints.HORIZONTAL;
		gbc_LocalidadRiesgo.gridx = 3;
		gbc_LocalidadRiesgo.gridy = 0;
		panel_1.add(LocalidadRiesgo, gbc_LocalidadRiesgo);
		
		JLabel lblMarcaDelVehculo = new JLabel("Marca del vehículo(*):");
		lblMarcaDelVehculo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarcaDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblMarcaDelVehculo = new GridBagConstraints();
		gbc_lblMarcaDelVehculo.anchor = GridBagConstraints.WEST;
		gbc_lblMarcaDelVehculo.insets = new Insets(20, 70, 5, 5);
		gbc_lblMarcaDelVehculo.gridx = 0;
		gbc_lblMarcaDelVehculo.gridy = 1;
		panel_1.add(lblMarcaDelVehculo, gbc_lblMarcaDelVehculo);
		
		//MARCA///////////////////////////////////////////////////////////////////////////
		List<ListadoDTO> marcaDTO = this.gestorPoliza.getMarcas();
		ListadoDTO[] marcas = marcaDTO.toArray(new ListadoDTO[marcaDTO.size()]);	
		JComboBox<ListadoDTO> MarcaVehiculo = new JComboBox<>(marcas);
		MarcaVehiculo.setRenderer(new ListadoDTORenderer());
		MarcaVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marcaParaPantalla = (ListadoDTO)MarcaVehiculo.getSelectedItem();
				modelosDTO = gestorPoliza.getModelos(marcaParaPantalla.getId());
				modelos = modelosDTO.toArray(new ListadoDTO[modelosDTO.size()]);
				DefaultComboBoxModel<ListadoDTO> nuevoModelo = new DefaultComboBoxModel<>(modelos);
				modeloVehiculo.setModel(nuevoModelo);
			}
		});
		MarcaVehiculo.setBackground(SystemColor.inactiveCaptionBorder);
		MarcaVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_MarcaVehiculo = new GridBagConstraints();
		gbc_MarcaVehiculo.fill = GridBagConstraints.HORIZONTAL;
		gbc_MarcaVehiculo.insets = new Insets(20, 0, 5, 30);
		gbc_MarcaVehiculo.gridx = 1;
		gbc_MarcaVehiculo.gridy = 1;
		panel_1.add(MarcaVehiculo, gbc_MarcaVehiculo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Modelo del vehículo (*):");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 1;
		panel_1.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		modeloVehiculo.setRenderer(new ListadoDTORenderer());
		modeloVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modeloParaPantalla = (ListadoDTO)modeloVehiculo.getSelectedItem();
				anioDTO = gestorPoliza.getAniosFabricacion(modeloParaPantalla.getId());
				anios = anioDTO.toArray(new ListadoDTO[anioDTO.size()]);
				DefaultComboBoxModel<ListadoDTO> nuevoModelo = new DefaultComboBoxModel<>(anios);
				MarcaVehiculo_1.setModel(nuevoModelo);
			}
		});
		
		//MODELO///////////////////////////////////////////////////////////////////////////
		modeloVehiculo.setBackground(SystemColor.inactiveCaptionBorder);
		modeloVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_modeloVehiculo = new GridBagConstraints();
		gbc_modeloVehiculo.insets = new Insets(20, 0, 5, 70);
		gbc_modeloVehiculo.fill = GridBagConstraints.HORIZONTAL;
		gbc_modeloVehiculo.gridx = 3;
		gbc_modeloVehiculo.gridy = 1;
		panel_1.add(modeloVehiculo, gbc_modeloVehiculo);
		
		JLabel AñoVehiculo = new JLabel("Año del vehículo(*):");
		AñoVehiculo.setHorizontalAlignment(SwingConstants.LEFT);
		AñoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_AñoVehiculo = new GridBagConstraints();
		gbc_AñoVehiculo.anchor = GridBagConstraints.WEST;
		gbc_AñoVehiculo.insets = new Insets(20, 70, 5, 5);
		gbc_AñoVehiculo.gridx = 0;
		gbc_AñoVehiculo.gridy = 2;
		panel_1.add(AñoVehiculo, gbc_AñoVehiculo);
		
		//ANIO--FABRICACION///////////////////////////////////////////////////////////////////////////
		MarcaVehiculo_1.setRenderer(new ListadoDTORenderer());
		MarcaVehiculo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valorSumaAsegurada = gestorAPI.getValorUnidadAsegurada(new InfoVehicularDTO(marcaParaPantalla.getNombre(), modeloParaPantalla.getNombre(),
						((ListadoDTO)MarcaVehiculo_1.getSelectedItem()).getNombre()));
				text_Asegurado.setText(valorSumaAsegurada.toString());
				
			}
		});
		MarcaVehiculo_1.setBackground(SystemColor.inactiveCaptionBorder);
		MarcaVehiculo_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_MarcaVehiculo_1 = new GridBagConstraints();
		gbc_MarcaVehiculo_1.insets = new Insets(20, 0, 5, 30);
		gbc_MarcaVehiculo_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_MarcaVehiculo_1.gridx = 1;
		gbc_MarcaVehiculo_1.gridy = 2;
		panel_1.add(MarcaVehiculo_1, gbc_MarcaVehiculo_1);
		
		JLabel SumaAsegurada = new JLabel("Suma asegurada :        $");
		SumaAsegurada.setHorizontalAlignment(SwingConstants.LEFT);
		SumaAsegurada.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_SumaAs = new GridBagConstraints();
		gbc_SumaAs.fill = GridBagConstraints.BOTH;
		gbc_SumaAs.insets = new Insets(20, 20, 5, 5);
		gbc_SumaAs.gridx = 2;
		gbc_SumaAs.gridy = 2;
		panel_1.add(SumaAsegurada, gbc_SumaAs);
		
		text_Asegurado = new JTextField();
		text_Asegurado.setBackground(SystemColor.inactiveCaptionBorder);
		text_Asegurado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text_Asegurado.setEditable(false);
		GridBagConstraints gbc_text_Asegurado = new GridBagConstraints();
		gbc_text_Asegurado.insets = new Insets(20, 0, 5, 70);
		gbc_text_Asegurado.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Asegurado.gridx = 3;
		gbc_text_Asegurado.gridy = 2;
		panel_1.add(text_Asegurado, gbc_text_Asegurado);
		text_Asegurado.setColumns(10);
		
		JLabel Motor = new JLabel("Motor(*) :");
		Motor.setHorizontalAlignment(SwingConstants.LEFT);
		Motor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Motor = new GridBagConstraints();
		gbc_Motor.anchor = GridBagConstraints.WEST;
		gbc_Motor.insets = new Insets(20, 70, 5, 5);
		gbc_Motor.gridx = 0;
		gbc_Motor.gridy = 3;
		panel_1.add(Motor, gbc_Motor);
		
		text_Motor = new JTextField();
		text_Motor.setBackground(SystemColor.inactiveCaptionBorder);
		text_Motor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text_Motor.setColumns(10);
		GridBagConstraints gbc_text_Motor = new GridBagConstraints();
		gbc_text_Motor.insets = new Insets(20, 0, 5, 30);
		gbc_text_Motor.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Motor.gridx = 1;
		gbc_text_Motor.gridy = 3;
		panel_1.add(text_Motor, gbc_text_Motor);
		
		JLabel Chasis = new JLabel("Chasis(*):");
		Chasis.setHorizontalAlignment(SwingConstants.LEFT);
		Chasis.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Chasis = new GridBagConstraints();
		gbc_Chasis.insets = new Insets(20, 20, 5, 5);
		gbc_Chasis.anchor = GridBagConstraints.WEST;
		gbc_Chasis.gridx = 2;
		gbc_Chasis.gridy = 3;
		panel_1.add(Chasis, gbc_Chasis);
		
		text_Chasis = new JTextField();
		text_Chasis.setBackground(SystemColor.inactiveCaptionBorder);
		text_Chasis.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text_Chasis.setColumns(10);
		GridBagConstraints gbc_text_Chasis = new GridBagConstraints();
		gbc_text_Chasis.insets = new Insets(20, 0, 5, 70);
		gbc_text_Chasis.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Chasis.gridx = 3;
		gbc_text_Chasis.gridy = 3;
		panel_1.add(text_Chasis, gbc_text_Chasis);
		
		JLabel Patente = new JLabel("Patente del vehículo:");
		Patente.setHorizontalAlignment(SwingConstants.LEFT);
		Patente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Patente = new GridBagConstraints();
		gbc_Patente.anchor = GridBagConstraints.WEST;
		gbc_Patente.insets = new Insets(20, 70, 5, 5);
		gbc_Patente.gridx = 0;
		gbc_Patente.gridy = 4;
		panel_1.add(Patente, gbc_Patente);
		
		text_Patente = new JTextField();
		text_Patente.setBackground(SystemColor.inactiveCaptionBorder);
		text_Patente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text_Patente.setColumns(10);
		GridBagConstraints gbc_text_Patente = new GridBagConstraints();
		gbc_text_Patente.insets = new Insets(20, 0, 5, 30);
		gbc_text_Patente.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Patente.gridx = 1;
		gbc_text_Patente.gridy = 4;
		panel_1.add(text_Patente, gbc_text_Patente);
		
		JLabel Kilometros = new JLabel("Kilómetros por año(*):");
		Kilometros.setHorizontalAlignment(SwingConstants.LEFT);
		Kilometros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Kilometros = new GridBagConstraints();
		gbc_Kilometros.insets = new Insets(2, 20, 5, 5);
		gbc_Kilometros.anchor = GridBagConstraints.WEST;
		gbc_Kilometros.gridx = 2;
		gbc_Kilometros.gridy = 4;
		panel_1.add(Kilometros, gbc_Kilometros);
		
		text_Kilometros = new JTextField();
		text_Kilometros.setBackground(SystemColor.inactiveCaptionBorder);
		text_Kilometros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text_Kilometros.setColumns(10);
		GridBagConstraints gbc_text_Kilometros = new GridBagConstraints();
		gbc_text_Kilometros.insets = new Insets(20, 0, 5, 70);
		gbc_text_Kilometros.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_Kilometros.gridx = 3;
		gbc_text_Kilometros.gridy = 4;
		panel_1.add(text_Kilometros, gbc_text_Kilometros);
		
		JLabel Siniestros = new JLabel("Siniestros en último año(*):");
		Siniestros.setHorizontalAlignment(SwingConstants.LEFT);
		Siniestros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Siniestros = new GridBagConstraints();
		gbc_Siniestros.anchor = GridBagConstraints.WEST;
		gbc_Siniestros.insets = new Insets(20, 70, 5, 5);
		gbc_Siniestros.gridx = 0;
		gbc_Siniestros.gridy = 5;
		panel_1.add(Siniestros, gbc_Siniestros);
		
		List<ListadoDTO> siniestrosDTO = gestorPoliza.getSiniestros();
		ListadoDTO[] siniestros = siniestrosDTO.toArray(new ListadoDTO[siniestrosDTO.size()]);
		text_Siniestros = new JComboBox<ListadoDTO>(siniestros);
		text_Siniestros.setRenderer(new ListadoDTORenderer());
		text_Siniestros.setBackground(SystemColor.inactiveCaptionBorder);
		text_Siniestros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Box_Siniestros = new GridBagConstraints();
		gbc_Box_Siniestros.insets = new Insets(20, 0, 5, 30);
		gbc_Box_Siniestros.fill = GridBagConstraints.HORIZONTAL;
		gbc_Box_Siniestros.gridx = 1;
		gbc_Box_Siniestros.gridy = 5;
		panel_1.add(text_Siniestros, gbc_Box_Siniestros);
		
		JLabel lblNewLabel_2 = new JLabel("Campo obligatorio (*)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 6;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(SystemColor.inactiveCaptionBorder);
		panelInferior.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panelInferior = new GridBagConstraints();
		gbc_panelInferior.anchor = GridBagConstraints.SOUTH;
		gbc_panelInferior.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelInferior.gridx = 0;
		gbc_panelInferior.gridy = 3;
		panel.add(panelInferior, gbc_panelInferior);
		GridBagLayout gbl_panelInferior = new GridBagLayout();
		gbl_panelInferior.columnWidths = new int[]{89, 0, 89, 0};
		gbl_panelInferior.rowHeights = new int[]{23, 0, 0};
		gbl_panelInferior.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelInferior.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelInferior.setLayout(gbl_panelInferior);
		
		JButton Boton_Cancelar = new JButton("Cancelar");
		Boton_Cancelar.setBackground(SystemColor.controlHighlight);
		Boton_Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaInicio_ProductorDeSeguro FuturaPantalla = new PantallaInicio_ProductorDeSeguro();
				
				try {
					FuturaPantalla.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				CrearPoliza_1.this.setVisible(false);
				CrearPoliza_1.this.dispose();
			}
		});
		Boton_Cancelar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Cancelar = new GridBagConstraints();
		gbc_Boton_Cancelar.anchor = GridBagConstraints.WEST;
		gbc_Boton_Cancelar.insets = new Insets(10, 70, 10, 5);
		gbc_Boton_Cancelar.gridx = 0;
		gbc_Boton_Cancelar.gridy = 0;
		panelInferior.add(Boton_Cancelar, gbc_Boton_Cancelar);
		
		JButton Boton_Continuar = new JButton("Continuar\r\n");
		Boton_Continuar.setBackground(SystemColor.controlHighlight);
		Boton_Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// acá tendrían que poner un if(cantidadhijos) a ver si se tira CrearPoliza_2 [caso sin hijos] o CrearPoliza_HijosExistentes.
						
						Boolean A = !((ListadoDTO)ProvinciaRiesgo.getSelectedItem()).getNombre().equals(" ");
						Boolean B = false;
						if(A) {
							B = !((ListadoDTO)LocalidadRiesgo.getSelectedItem()).getNombre().equals(" ");
						}
						Boolean C = !((ListadoDTO)MarcaVehiculo.getSelectedItem()).getNombre().equals(" ");
						Boolean D = false;
						Boolean E = false;
						if(C) {
							D = !((ListadoDTO)modeloVehiculo.getSelectedItem()).getNombre().equals(" ");
							if(D) {
								E = !((ListadoDTO)MarcaVehiculo_1.getSelectedItem()).getNombre().equals(" ");
							}
						}
						Boolean F = !(text_Asegurado.getText().equals("") || contieneCaracter(text_Asegurado.getText()));
						Boolean G = !(text_Motor.getText().equals(""));
						Boolean H = !(text_Chasis.getText().equals(""));
						Boolean I = !(text_Kilometros.getText().equals("") || contieneCaracter(text_Kilometros.getText()));
						Boolean J = !((ListadoDTO)text_Siniestros.getSelectedItem()).getNombre().equals(" ");
						Boolean K = !(text_Patente.getText().equals(""));
						Boolean L = !(gestorPoliza.checkPatente(text_Patente.getText()));
						
						
						
						
						if(A &&  B && C && D && E && F && G && H && I && J && K && L) {
							DatosPolizaDTO datosPolizaDTO = new DatosPolizaDTO();
							nombresDTO = new NombresDTO(marcaParaPantalla.getNombre(), modeloParaPantalla.getNombre());
							datosPolizaDTO.setIdLocalidadRiesgo(((ListadoDTO)LocalidadRiesgo.getSelectedItem()).getId());
							datosPolizaDTO.setIdModeloVehiculo(((ListadoDTO)modeloVehiculo.getSelectedItem()).getId());
							datosPolizaDTO.setIdAnioVehiculo(((ListadoDTO)MarcaVehiculo_1.getSelectedItem()).getId());
							datosPolizaDTO.setSumaAsegurada(valorSumaAsegurada);
							datosPolizaDTO.setMotor(text_Motor.getText());
							datosPolizaDTO.setChasis(text_Chasis.getText());
							datosPolizaDTO.setPatente(text_Patente.getText());
							datosPolizaDTO.setKilometrosPorAnio(Integer.parseInt(text_Kilometros.getText()));
							datosPolizaDTO.setSiniestrosUltimoA(((ListadoDTO)text_Siniestros.getSelectedItem()).getId());
							
							datosPolizaDTO.setIdCliente(clienteDTO.getIdCliente());
							datosPolizaDTO.setNombre(clienteDTO.getNombre());
							datosPolizaDTO.setApellido(clienteDTO.getApellido());
							datosPolizaDTO.setNumeroCliente(clienteDTO.getNumeroCliente());
							datosPolizaDTO.setDni(clienteDTO.getNumeroDocumento());
							datosPolizaDTO.setTipoDNI(clienteDTO.getIdTipoDocumento());
							datosPolizaDTO.setDescuento((float)0.05);
							datosPolizaDTO.setPrima((float)0.03);
							datosPolizaDTO.setPremio(datosPolizaDTO.getSumaAsegurada()*datosPolizaDTO.getPrima());
							
							/*
							System.out.println(datosPolizaDTO.getApellido());
							System.out.println(datosPolizaDTO.getNombre());
							System.out.println(datosPolizaDTO.getChasis());
							System.out.println(datosPolizaDTO.getMotor());
							System.out.println(datosPolizaDTO.getPatente());
							System.out.println(datosPolizaDTO.getIdAnioVehiculo());
							System.out.println(datosPolizaDTO.getIdLocalidadRiesgo());
							System.out.println(datosPolizaDTO.getSumaAsegurada());
							System.out.println(datosPolizaDTO.getKilometrosPorAnio());
							System.out.println(datosPolizaDTO.getIdModeloVehiculo());
							*/
							
							CrearPoliza_2 CPoliza = new CrearPoliza_2(datosPolizaDTO, gestorPoliza, gestorCliente, nombresDTO, CrearPoliza_1.this, numeroClienteS);
						System.out.println("Se creó una instancia");
							try {
								CPoliza.setVisible(true);
							} catch(Exception er) {
								er.printStackTrace();
							}
							CrearPoliza_1.this.setVisible(false);
							CrearPoliza_1.this.dispose();
							
						}
						else{
							if(L)JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos","Error",JOptionPane.WARNING_MESSAGE);
							else JOptionPane.showMessageDialog(null, "El auto ya tiene una póliza vigente","Error",JOptionPane.WARNING_MESSAGE);
						}
			}
		});
		Boton_Continuar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Continuar = new GridBagConstraints();
		gbc_Boton_Continuar.insets = new Insets(10, 0, 10, 70);
		gbc_Boton_Continuar.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar.gridx = 2;
		gbc_Boton_Continuar.gridy = 0;
		panelInferior.add(Boton_Continuar, gbc_Boton_Continuar);
		
		JButton Boton_Cancelar_1 = new JButton("Volver");
		Boton_Cancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					anterior.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				CrearPoliza_1.this.setVisible(false);
				CrearPoliza_1.this.dispose();
			}
		});
		Boton_Cancelar_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Boton_Cancelar_1.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_Boton_Cancelar_1 = new GridBagConstraints();
		gbc_Boton_Cancelar_1.anchor = GridBagConstraints.EAST;
		gbc_Boton_Cancelar_1.insets = new Insets(10, 10, 10, 5);
		gbc_Boton_Cancelar_1.gridx = 1;
		gbc_Boton_Cancelar_1.gridy = 0;
		panelInferior.add(Boton_Cancelar_1, gbc_Boton_Cancelar_1);




	}
	
	public static boolean contieneCaracter(String cadena) {
		String patron = ".*[a-zA-Z].*";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.matches();
    }
	

}
