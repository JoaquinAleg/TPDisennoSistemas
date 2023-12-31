package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;

import CustomRenderers.ListadoDTORenderer;
import DTOS.DatosPolizaDTO;
import DTOS.HijosDTO;
import DTOS.ListadoDTO;
import DTOS.NombresDTO;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;

import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.awt.event.ActionEvent;



public class CrearPoliza_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<HijosDTO> hijos;
	private GestorPoliza gestorPoliza;
	private List<ListadoDTO> sexoDTO;
	private List<ListadoDTO> estadoCivilDTO;
	private ListadoDTO[] sexos;
	private ListadoDTO[] estadosCivil;
	private JComboBox<String> alarma;
	private JComboBox<String> garage;
	private JComboBox<String> tuercas;
	private JComboBox<String> rastreoVehicular;

	public CrearPoliza_2(DatosPolizaDTO datosPolizaDTO,GestorPoliza gestorPoliza, GestorCliente gestorCliente,  NombresDTO nombresDTO, JFrame anterior) {
		this.gestorPoliza = gestorPoliza;
		this.hijos = new ArrayList<>();
		
		List<ListadoDTO> medidaSeguridadDTO = this.gestorPoliza.getMedidasSeguridad();
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
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
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
		String numeroCliente = datosPolizaDTO.getNumeroCliente();
		JLabel lblDatosDeLa_1 = new JLabel("Datos de la póliza - Cliente nro: " + numeroCliente);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBorder(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Guardado en garage:\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(50, 70, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		garage = new JComboBox<String>();
		garage.addItem("No");
		garage.addItem("Si");
		garage.setBackground(SystemColor.inactiveCaptionBorder);
		garage.setToolTipText("");
		garage.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_garage = new GridBagConstraints();
		gbc_garage.insets = new Insets(50, 0, 5, 30);
		gbc_garage.fill = GridBagConstraints.HORIZONTAL;
		gbc_garage.gridx = 1;
		gbc_garage.gridy = 0;
		panel_1.add(garage, gbc_garage);
		
		JLabel lblNewLabel_1 = new JLabel("Alarma:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(50, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		alarma = new JComboBox<String>();
		alarma.addItem("No");
		alarma.addItem("Si");
		alarma.setBackground(SystemColor.inactiveCaptionBorder);
		alarma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_alarma = new GridBagConstraints();
		gbc_alarma.insets = new Insets(50, 0, 5, 70);
		gbc_alarma.fill = GridBagConstraints.HORIZONTAL;
		gbc_alarma.gridx = 3;
		gbc_alarma.gridy = 0;
		panel_1.add(alarma, gbc_alarma);
		
		JLabel lblMarcaDelVehculo = new JLabel("Dispositivo de rastreo vehícular:");
		lblMarcaDelVehculo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarcaDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_lblMarcaDelVehculo = new GridBagConstraints();
		gbc_lblMarcaDelVehculo.anchor = GridBagConstraints.WEST;
		gbc_lblMarcaDelVehculo.insets = new Insets(20, 70, 5, 5);
		gbc_lblMarcaDelVehculo.gridx = 0;
		gbc_lblMarcaDelVehculo.gridy = 1;
		panel_1.add(lblMarcaDelVehculo, gbc_lblMarcaDelVehculo);
		
		rastreoVehicular = new JComboBox<String>();
		rastreoVehicular.addItem("No");
		rastreoVehicular.addItem("Si");
		rastreoVehicular.setBackground(SystemColor.inactiveCaptionBorder);
		rastreoVehicular.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_rastreoVehicular = new GridBagConstraints();
		gbc_rastreoVehicular.fill = GridBagConstraints.HORIZONTAL;
		gbc_rastreoVehicular.insets = new Insets(20, 0, 5, 30);
		gbc_rastreoVehicular.gridx = 1;
		gbc_rastreoVehicular.gridy = 1;
		panel_1.add(rastreoVehicular, gbc_rastreoVehicular);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tuercas antirrobos en 4 ruedas:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 1;
		panel_1.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		tuercas = new JComboBox<String>();
		tuercas.addItem("No");
		tuercas.addItem("Si");
		tuercas.setBackground(SystemColor.inactiveCaptionBorder);
		tuercas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_tuercas = new GridBagConstraints();
		gbc_tuercas.insets = new Insets(20, 0, 5, 70);
		gbc_tuercas.fill = GridBagConstraints.HORIZONTAL;
		gbc_tuercas.gridx = 3;
		gbc_tuercas.gridy = 1;
		panel_1.add(tuercas, gbc_tuercas);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 20, 0, 20);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 4;
		panel.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel titulo = new JLabel("Declaración de Hijos");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		titulo.setBorder(null);
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.insets = new Insets(0, 30, 5, 5);
		gbc_titulo.gridx = 0;
		gbc_titulo.gridy = 0;
		panel_4.add(titulo, gbc_titulo);
		
		JButton Boton_Continuar_1 = new JButton("Ver Hijos");
		Boton_Continuar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPoliza_ListadoHijos FuturaPantalla = new CrearPoliza_ListadoHijos(hijos,gestorPoliza,gestorCliente, nombresDTO,datosPolizaDTO, sexoDTO, estadoCivilDTO, CrearPoliza_2.this,anterior);
				
				try {
					FuturaPantalla.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				CrearPoliza_2.this.setVisible(false);
				CrearPoliza_2.this.dispose();
			}
		});
		Boton_Continuar_1.setHorizontalAlignment(SwingConstants.RIGHT);
		Boton_Continuar_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Boton_Continuar_1.setBackground(SystemColor.controlHighlight);
		Boton_Continuar_1.setEnabled(false);
		GridBagConstraints gbc_Boton_Continuar_1 = new GridBagConstraints();
		gbc_Boton_Continuar_1.insets = new Insets(5, 0, 5, 30);
		gbc_Boton_Continuar_1.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar_1.gridx = 2;
		gbc_Boton_Continuar_1.gridy = 0;
		panel_4.add(Boton_Continuar_1, gbc_Boton_Continuar_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_panel_1_1 = new GridBagConstraints();
		gbc_panel_1_1.insets = new Insets(0, 20, 20, 20);
		gbc_panel_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1.gridx = 0;
		gbc_panel_1_1.gridy = 5;
		panel.add(panel_1_1, gbc_panel_1_1);
		GridBagLayout gbl_panel_1_1 = new GridBagLayout();
		gbl_panel_1_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1_1.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1_1.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1_1.setLayout(gbl_panel_1_1);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento = new GridBagConstraints();
		gbc_lblFechaDeNacimiento.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento.insets = new Insets(30, 50, 5, 5);
		gbc_lblFechaDeNacimiento.gridx = 0;
		gbc_lblFechaDeNacimiento.gridy = 0;
		panel_1_1.add(lblFechaDeNacimiento, gbc_lblFechaDeNacimiento);
		
		JDateChooser nacimiento = new JDateChooser();
		nacimiento.setDate(Calendar.getInstance().getTime());
		nacimiento.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_nacimiento = new GridBagConstraints();
		gbc_nacimiento.insets = new Insets(30, 5, 5, 30);
		gbc_nacimiento.fill = GridBagConstraints.BOTH;
		gbc_nacimiento.gridx = 1;
		gbc_nacimiento.gridy = 0;
		panel_1_1.add(nacimiento, gbc_nacimiento);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sexo:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2.insets = new Insets(30, 0, 5, 10);
		gbc_lblNewLabel_1_2.gridx = 3;
		gbc_lblNewLabel_1_2.gridy = 0;
		panel_1_1.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		sexoDTO = this.gestorPoliza.getSexos();
		sexos = sexoDTO.toArray(new ListadoDTO[sexoDTO.size()]);
		JComboBox <ListadoDTO> sexo = new JComboBox<>(sexos);
		sexo.setRenderer(new ListadoDTORenderer());
//		JComboBox sexo = new JComboBox();
//		sexo.addItem("Masculino");
//		sexo.addItem("Femenino");
		sexo.setBackground(SystemColor.inactiveCaptionBorder);
		sexo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_sexo = new GridBagConstraints();
		gbc_sexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_sexo.insets = new Insets(30, 0, 5, 50);
		gbc_sexo.gridx = 4;
		gbc_sexo.gridy = 0;
		panel_1_1.add(sexo, gbc_sexo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
		gbc_lblEstadoCivil.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil.insets = new Insets(20, 50, 40, 5);
		gbc_lblEstadoCivil.gridx = 0;
		gbc_lblEstadoCivil.gridy = 2;
		panel_1_1.add(lblEstadoCivil, gbc_lblEstadoCivil);
		
		estadoCivilDTO = this.gestorPoliza.getEstadoCiviles();
		estadosCivil = estadoCivilDTO.toArray(new ListadoDTO[estadoCivilDTO.size()]);
		JComboBox<ListadoDTO> estadoCivil = new JComboBox<>(estadosCivil);
		estadoCivil.setRenderer(new ListadoDTORenderer());

		estadoCivil.setBackground(SystemColor.inactiveCaptionBorder);
		estadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_estadoCivil = new GridBagConstraints();
		gbc_estadoCivil.fill = GridBagConstraints.HORIZONTAL;
		gbc_estadoCivil.insets = new Insets(20, 0, 40, 30);
		gbc_estadoCivil.gridx = 1;
		gbc_estadoCivil.gridy = 2;
		panel_1_1.add(estadoCivil, gbc_estadoCivil);
		
		JButton añadirHijo = new JButton("Añadir hijo");
		añadirHijo.setBackground(SystemColor.controlHighlight);
		añadirHijo.setFont(new Font("Tahoma", Font.PLAIN, 35));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 10, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		panel_1_1.add(añadirHijo, gbc_btnNewButton);

		añadirHijo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(((ListadoDTO)sexo.getSelectedItem()).getNombre().equals(" ")) {
					JOptionPane.showMessageDialog(null, "Por favor seleccione el sexo del Hijo","Error",JOptionPane.WARNING_MESSAGE);
				}
				else if(((ListadoDTO)estadoCivil.getSelectedItem()).getNombre().equals(" ")) {
					JOptionPane.showMessageDialog(null, "Por favor seleccione el estado civil del Hijo","Error",JOptionPane.WARNING_MESSAGE);
				}
				else {
					if(ChronoUnit.DAYS.between(nacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),LocalDate.now()) < 6570 | 
							ChronoUnit.DAYS.between(nacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),LocalDate.now()) > 10950) {
						JOptionPane.showMessageDialog(null, "La edad del hijo no se encuentra entre 18 y 30 años","Error",JOptionPane.WARNING_MESSAGE);
					}else {
					HijosDTO hijo = new HijosDTO(nacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), ((ListadoDTO)estadoCivil.getSelectedItem()).getId(), ((ListadoDTO)sexo.getSelectedItem()).getId());
					JOptionPane.showMessageDialog(null, "Hijo añadido con éxito","Información",JOptionPane.INFORMATION_MESSAGE);
					hijos.add(hijo);
					Boton_Continuar_1.setEnabled(true);
					CrearPoliza_2.this.contentPane.repaint();
					CrearPoliza_2.this.contentPane.revalidate();
					}
				}
			}
			
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.anchor = GridBagConstraints.SOUTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 6;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{89, 0, 0, 89, 0};
		gbl_panel_2.rowHeights = new int[]{23, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
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
				CrearPoliza_2.this.setVisible(false);
				CrearPoliza_2.this.dispose();
			}
		});
		Boton_Cancelar.setBackground(SystemColor.controlHighlight);
		Boton_Cancelar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Cancelar = new GridBagConstraints();
		gbc_Boton_Cancelar.anchor = GridBagConstraints.WEST;
		gbc_Boton_Cancelar.insets = new Insets(10, 40, 10, 5);
		gbc_Boton_Cancelar.gridx = 0;
		gbc_Boton_Cancelar.gridy = 0;
		panel_2.add(Boton_Cancelar, gbc_Boton_Cancelar);
		
		JButton Boton_Continuar = new JButton("Continuar\r\n");
		Boton_Continuar.setBackground(SystemColor.controlHighlight);
		Boton_Continuar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Continuar = new GridBagConstraints();
		gbc_Boton_Continuar.insets = new Insets(10, 0, 10, 40);
		gbc_Boton_Continuar.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar.gridx = 3;
		gbc_Boton_Continuar.gridy = 0;
		panel_2.add(Boton_Continuar, gbc_Boton_Continuar);
		Boton_Continuar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					datosPolizaDTO.setHijos(hijos);
					List<Long> medidas = new ArrayList<>();
					if(garage.getSelectedItem().equals("Si")){
						Long[] idGarage = medidaSeguridadDTO.stream().filter(a -> a.getNombre().equals("Garage")).map(b -> b.getId()).toArray(Long[]::new);
						medidas.add(idGarage[0]);
					}
					if(alarma.getSelectedItem().equals("Si")){
						Long[] idAlarma = medidaSeguridadDTO.stream().filter(a -> a.getNombre().equals("Alarma")).map(b -> b.getId()).toArray(Long[]::new);
						medidas.add(idAlarma[0]);
					}
					if(tuercas.getSelectedItem().equals("Si")){
						Long[] idTuercas = medidaSeguridadDTO.stream().filter(a -> a.getNombre().equals("Tuercas")).map(b -> b.getId()).toArray(Long[]::new);
						medidas.add(idTuercas[0]);
					}
					if(rastreoVehicular.getSelectedItem().equals("Si")){
						Long[] idRastreoVehicular = medidaSeguridadDTO.stream().filter(a -> a.getNombre().equals("Rastreo Vehicular")).map(b -> b.getId()).toArray(Long[]::new);
						medidas.add(idRastreoVehicular[0]);
					}
					datosPolizaDTO.setListaMedidaSeguridad(medidas);
					CrearPoliza_Cobertura CPoliza = new CrearPoliza_Cobertura(hijos, gestorPoliza,gestorCliente,  nombresDTO,datosPolizaDTO, sexoDTO, estadoCivilDTO, CrearPoliza_2.this);
					
					try {
						CPoliza.setVisible(true);
					} catch(Exception er) {
						er.printStackTrace();
					}
					CrearPoliza_2.this.setVisible(false);
					CrearPoliza_2.this.dispose();
			}
		});
		
		JButton Boton_Continuar_2 = new JButton("Volver");
		Boton_Continuar_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Boton_Continuar_2.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_Boton_Continuar_2 = new GridBagConstraints();
		gbc_Boton_Continuar_2.insets = new Insets(0, 0, 0, 5);
		gbc_Boton_Continuar_2.gridx = 2;
		gbc_Boton_Continuar_2.gridy = 0;
		panel_2.add(Boton_Continuar_2, gbc_Boton_Continuar_2);
		Boton_Continuar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {							
							
								try {
									anterior.setVisible(true);
								} catch(Exception er) {
									er.printStackTrace();
								}
								CrearPoliza_2.this.setVisible(false);
								CrearPoliza_2.this.dispose();
			}
		});



	}

}
