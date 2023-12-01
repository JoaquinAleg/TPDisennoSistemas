package pantalla;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;


import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import DTOS.ClienteDTO;
import DTOS.ListadoDTO;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;
import POJOS.TipoDocumento;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
;



public class BuscarCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String[] modelos;
	private JTable table;
	private GestorCliente gestorCliente;
	private GestorPoliza gestorPoliza;
	private JTextField textField;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorCliente gestorCliente = GestorCliente.getInstance();
					GestorPoliza gestorPoliza = GestorPoliza.getInstance();
					BuscarCliente frame = new BuscarCliente(gestorCliente, gestorPoliza);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuscarCliente(GestorCliente gestorC, GestorPoliza gestorP) {
		this.gestorCliente = gestorC;
		this.gestorPoliza = gestorP;
		//PARTE VISUAL DE LA PANTALLA
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
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{10, 202, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
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
		
		JLabel lblDatosDeLa_1 = new JLabel("Buscar Cliente");
		lblDatosDeLa_1.setBackground(SystemColor.inactiveCaptionBorder);
		lblDatosDeLa_1.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		lblDatosDeLa_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDatosDeLa_1 = new GridBagConstraints();
		gbc_lblDatosDeLa_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblDatosDeLa_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDatosDeLa_1.gridx = 0;
		gbc_lblDatosDeLa_1.gridy = 1;
		panel.add(lblDatosDeLa_1, gbc_lblDatosDeLa_1);
		lblDatosDeLa_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JPanel panelIngresos = new JPanel();
		panelIngresos.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_panelIngresos = new GridBagConstraints();
		gbc_panelIngresos.insets = new Insets(0, 0, 5, 0);
		gbc_panelIngresos.fill = GridBagConstraints.BOTH;
		gbc_panelIngresos.gridx = 0;
		gbc_panelIngresos.gridy = 2;
		panel.add(panelIngresos, gbc_panelIngresos);
		GridBagLayout gbl_panelIngresos = new GridBagLayout();
		gbl_panelIngresos.columnWidths = new int[]{363, 216, 0, 7, 0};
		gbl_panelIngresos.rowHeights = new int[]{0, 0};
		gbl_panelIngresos.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelIngresos.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelIngresos.setLayout(gbl_panelIngresos);
		
		JLabel lblNmeroCliente = new JLabel("Número Cliente:");
		lblNmeroCliente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNmeroCliente = new GridBagConstraints();
		gbc_lblNmeroCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNmeroCliente.insets = new Insets(50, 0, 0, 5);
		gbc_lblNmeroCliente.gridx = 1;
		gbc_lblNmeroCliente.gridy = 0;
		panelIngresos.add(lblNmeroCliente, gbc_lblNmeroCliente);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(50, 0, 0, 70);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panelIngresos.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBorder(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0,};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.5, 0.0, 0.5};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0,};

		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(20, 70, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextField  apellido = new JTextField();
		apellido.setBackground(SystemColor.inactiveCaptionBorder);
		apellido.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_apellido = new GridBagConstraints();
		gbc_apellido.insets = new Insets(20, 0, 5, 15);
		gbc_apellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellido.gridx = 1;
		gbc_apellido.gridy = 1;
		panel_1.add(apellido, gbc_apellido);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(20, 15, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 1;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
 
		JTextField nombre = new JTextField();
		nombre.setBackground(SystemColor.inactiveCaptionBorder);
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombre.insets = new Insets(20, 0, 5, 70);
		gbc_nombre.gridx = 3;
		gbc_nombre.gridy = 1;
		panel_1.add(nombre, gbc_nombre);
		
		JLabel lblMarcaDelVehculo = new JLabel("Tipo Documento:");
		lblMarcaDelVehculo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarcaDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_lblMarcaDelVehculo = new GridBagConstraints();
		gbc_lblMarcaDelVehculo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMarcaDelVehculo.insets = new Insets(20, 70, 20, 5);
		gbc_lblMarcaDelVehculo.gridx = 0;
		gbc_lblMarcaDelVehculo.gridy = 2;
		panel_1.add(lblMarcaDelVehculo, gbc_lblMarcaDelVehculo);
		
		List<ListadoDTO> tipoDocumentoDTO = this.gestorPoliza.getTipoDocumento();
		String[] tipoDocumentos = tipoDocumentoDTO.stream().map(p -> p.getNombre()).toArray(String[]::new);
		JComboBox <String> TipoDocumento = new JComboBox<>(tipoDocumentos);
		TipoDocumento.setBackground(SystemColor.inactiveCaptionBorder);
		TipoDocumento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_TipoDocumento = new GridBagConstraints();
		gbc_TipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		gbc_TipoDocumento.insets = new Insets(20, 0, 20, 15);
		gbc_TipoDocumento.gridx = 1;
		gbc_TipoDocumento.gridy = 2;
		panel_1.add(TipoDocumento, gbc_TipoDocumento);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número de documento: ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1_1.insets = new Insets(20, 15, 20, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 2;
		panel_1.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		

		JTextField NDocumento = new JTextField();
		NDocumento.setBackground(SystemColor.inactiveCaptionBorder);
		NDocumento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Documento = new GridBagConstraints();
		gbc_Documento.fill = GridBagConstraints.HORIZONTAL;
		gbc_Documento.insets = new Insets(20, 0, 20, 70);
		gbc_Documento.gridx = 3;
		gbc_Documento.gridy = 2;
		panel_1.add(NDocumento, gbc_Documento);
	

		
		
		JPanel contenedorDeScrollpane = new JPanel();
		contenedorDeScrollpane.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_panel_1_1 = new GridBagConstraints();
		gbc_panel_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1.insets = new Insets(0, 20, 20, 20);
		gbc_panel_1_1.gridx = 0;
		gbc_panel_1_1.gridy = 4;
		panel.add(contenedorDeScrollpane, gbc_panel_1_1);
		

		//DEFINO SCROLLPANE 

		String[] columnas = {"Cliente", "Apellido", "Nombre", "Tipo Documento", "Numero Documento"};
		DefaultTableModel model = new DefaultTableModel(null, columnas);
		List<ClienteDTO> clienteDTO = this.gestorCliente.getClientes();
		cargarClientes(model,clienteDTO,gestorC);
		table = new JTable();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportView(table);
        contenedorDeScrollpane.add(scrollPane, BorderLayout.CENTER);
        scrollPane.getViewport().setPreferredSize(new Dimension(800, 200));
		table.setModel(model);
		table.setEnabled(false);

		table.setBackground(SystemColor.inactiveCaptionBorder);
		table.setFillsViewportHeight(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));

        
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.anchor = GridBagConstraints.SOUTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 5;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{89, 0, 0, 89, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 23, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton Boton_Cancelar = new JButton("Cancelar");
		Boton_Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaInicio_ProductorDeSeguro FuturaPantalla = new PantallaInicio_ProductorDeSeguro();
				
				try {
					FuturaPantalla.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				BuscarCliente.this.setVisible(false);
				BuscarCliente.this.dispose();
			}
		});
		
		JButton Boton_Continuar_1 = new JButton("Continuar\r\n");
		Boton_Continuar_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Boton_Continuar_1.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_Boton_Continuar_1 = new GridBagConstraints();
		gbc_Boton_Continuar_1.insets = new Insets(10, 0, 10, 40);
		gbc_Boton_Continuar_1.gridx = 4;
		gbc_Boton_Continuar_1.gridy = 1;
		panel_2.add(Boton_Continuar_1, gbc_Boton_Continuar_1);
		
		JButton crearCliente = new JButton("Crear Cliente");
		crearCliente.setFont(new Font("Tahoma", Font.PLAIN, 40));
		crearCliente.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_crearCliente = new GridBagConstraints();
		gbc_crearCliente.anchor = GridBagConstraints.EAST;
		gbc_crearCliente.insets = new Insets(10, 0, 10, 10);
		gbc_crearCliente.gridx = 1;
		gbc_crearCliente.gridy = 1;
		panel_2.add(crearCliente, gbc_crearCliente);
		Boton_Cancelar.setBackground(SystemColor.controlHighlight);
		Boton_Cancelar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Cancelar = new GridBagConstraints();
		gbc_Boton_Cancelar.anchor = GridBagConstraints.WEST;
		gbc_Boton_Cancelar.insets = new Insets(10, 40, 10, 5);
		gbc_Boton_Cancelar.gridx = 0;
		gbc_Boton_Cancelar.gridy = 1;
		panel_2.add(Boton_Cancelar, gbc_Boton_Cancelar);
		
		JButton Boton_Continuar = new JButton("Buscar");
		Boton_Continuar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {	
				
				String filtroApellido = apellido.getText();
				String filtroNombre = nombre.getText();
				String filtroNDoc = NDocumento.getText();
			//	String filtroTipoDoc = TipoDocumento.getSelectedItem().getDescripcion();
				List<ClienteDTO> clienteEditadoDTO = clienteDTO;

				
				
				
				cargarClientes(model, clienteEditadoDTO, gestorCliente);
				
			}
		});
		Boton_Continuar.setBackground(SystemColor.controlHighlight);
		Boton_Continuar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Continuar = new GridBagConstraints();
		gbc_Boton_Continuar.insets = new Insets(10, 0, 10, 10);
		gbc_Boton_Continuar.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar.gridx = 3;
		gbc_Boton_Continuar.gridy = 1;
		panel_2.add(Boton_Continuar, gbc_Boton_Continuar);

		


	}
	private void cargarClientes(DefaultTableModel model, List<ClienteDTO> clienteDTO, GestorCliente gestorC) {
		for(ClienteDTO c : clienteDTO) {
			Object[] auxiliar = { c.getNumeroCliente().toString(),
					c.getApellido(),
					c.getNombre(),
					c.getIdTipoDocumento(),
					c.getNumeroDocumento().toString()
			};
			model.addRow(auxiliar);
	}
	}
    

}