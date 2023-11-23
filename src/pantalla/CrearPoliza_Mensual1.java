package pantalla;


import java.awt.EventQueue;

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
import javax.swing.JButton;
import javax.swing.SwingConstants;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JDateChooser;

import DTOS.DatosPolizaDTO;
import DTOS.NombresDTO;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;


public class CrearPoliza_Mensual1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private GestorPoliza gestorPoliza;
	private GestorCliente gestorCliente;
	private DatosPolizaDTO datosPolizaDTO;
	private NombresDTO nombresDTO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//CrearPoliza_Mensual1 frame = new CrearPoliza_Mensual1();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrearPoliza_Mensual1(DatosPolizaDTO datosPolizaDTO, NombresDTO nombresDTO, GestorPoliza gestorPoliza, GestorCliente gestorCliente) {
		this.datosPolizaDTO = datosPolizaDTO;
		this.gestorCliente = gestorCliente;
		this.gestorPoliza = gestorPoliza;
		this.nombresDTO = nombresDTO;
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
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		String numeroCliente = String.valueOf(datosPolizaDTO.getNumeroCliente());
		JLabel lblDatosDeLa_1 = new JLabel("Datos de la póliza - Titular del seguro: " + numeroCliente);
		lblDatosDeLa_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDatosDeLa_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDatosDeLa_1 = new GridBagConstraints();
		gbc_lblDatosDeLa_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDatosDeLa_1.gridx = 0;
		gbc_lblDatosDeLa_1.gridy = 0;
		panel.add(lblDatosDeLa_1, gbc_lblDatosDeLa_1);
		lblDatosDeLa_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JPanel PanelMedioInferior = new JPanel();
		PanelMedioInferior.setBackground(SystemColor.inactiveCaptionBorder);
		PanelMedioInferior.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_PanelMedioInferior = new GridBagConstraints();
		gbc_PanelMedioInferior.fill = GridBagConstraints.HORIZONTAL;
		gbc_PanelMedioInferior.gridx = 0;
		gbc_PanelMedioInferior.gridy = 1;
		panel.add(PanelMedioInferior, gbc_PanelMedioInferior);
		GridBagLayout gbl_PanelMedioInferior = new GridBagLayout();
		gbl_PanelMedioInferior.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_PanelMedioInferior.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_PanelMedioInferior.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_PanelMedioInferior.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PanelMedioInferior.setLayout(gbl_PanelMedioInferior);
		
		JLabel titulo = new JLabel("Datos sobre el vehiculo");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		titulo.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.insets = new Insets(20, 20, 0, 20);
		gbc_titulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_titulo.gridwidth = 4;
		gbc_titulo.gridx = 0;
		gbc_titulo.gridy = 0;
		PanelMedioInferior.add(titulo, gbc_titulo);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_panel_1_1 = new GridBagConstraints();
		gbc_panel_1_1.gridwidth = 4;
		gbc_panel_1_1.insets = new Insets(0, 20, 0, 20);
		gbc_panel_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1.gridx = 0;
		gbc_panel_1_1.gridy = 1;
		PanelMedioInferior.add(panel_1_1, gbc_panel_1_1);
		GridBagLayout gbl_panel_1_1 = new GridBagLayout();
		gbl_panel_1_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1_1.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1_1.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1_1.setLayout(gbl_panel_1_1);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.anchor = GridBagConstraints.WEST;
		gbc_lblMarca.insets = new Insets(30, 50, 5, 5);
		gbc_lblMarca.gridx = 0;
		gbc_lblMarca.gridy = 0;
		panel_1_1.add(lblMarca, gbc_lblMarca);
		
		textField_11 = new JTextField();
		textField_11.setText(nombresDTO.getMarca());
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(30, 5, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 0;
		panel_1_1.add(textField_11, gbc_textField_11);
		
		JLabel lblFechaDeNacimiento = new JLabel("Motor:");
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento = new GridBagConstraints();
		gbc_lblFechaDeNacimiento.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento.insets = new Insets(20, 50, 5, 5);
		gbc_lblFechaDeNacimiento.gridx = 0;
		gbc_lblFechaDeNacimiento.gridy = 1;
		panel_1_1.add(lblFechaDeNacimiento, gbc_lblFechaDeNacimiento);
		
		textField_8 = new JTextField();
		textField_8.setText(datosPolizaDTO.getMotor());
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(20, 5, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 1;
		panel_1_1.add(textField_8, gbc_textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText(nombresDTO.getModelo());
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(20, 0, 5, 50);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 1;
		panel_1_1.add(textField_9, gbc_textField_9);
		
		JLabel lblNewLabel_1_2 = new JLabel("Modelo:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2.insets = new Insets(20, 0, 5, 10);
		gbc_lblNewLabel_1_2.gridx = 3;
		gbc_lblNewLabel_1_2.gridy = 1;
		panel_1_1.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		JLabel lblEstadoCivil = new JLabel("Patente:");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
		gbc_lblEstadoCivil.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil.insets = new Insets(20, 50, 40, 5);
		gbc_lblEstadoCivil.gridx = 0;
		gbc_lblEstadoCivil.gridy = 3;
		panel_1_1.add(lblEstadoCivil, gbc_lblEstadoCivil);
		
		textField_7 = new JTextField();
		textField_7.setText(datosPolizaDTO.getPatente());
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(20, 5, 40, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 3;
		panel_1_1.add(textField_7, gbc_textField_7);
		
		textField_10 = new JTextField();
		textField_10.setText(datosPolizaDTO.getChasis());
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(20, 0, 40, 50);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 4;
		gbc_textField_10.gridy = 3;
		panel_1_1.add(textField_10, gbc_textField_10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Chasis:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2_1.insets = new Insets(20, 0, 40, 5);
		gbc_lblNewLabel_1_2_1.gridx = 3;
		gbc_lblNewLabel_1_2_1.gridy = 3;
		panel_1_1.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		
		JLabel lblNewLabel = new JLabel("Comienzo de vigencia:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(30, 70, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		PanelMedioInferior.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setText(datosPolizaDTO.getComienzoVigencia().toString());
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(50, 10, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 2;
		PanelMedioInferior.add(textField_4, gbc_textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Final de vigencia:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(30, 20, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		PanelMedioInferior.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setText(datosPolizaDTO.getComienzoVigencia().plusDays(30).toString());
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(50, 10, 5, 70);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 2;
		PanelMedioInferior.add(textField_3, gbc_textField_3);
		
		JLabel lblMarcaDelVehculo = new JLabel("Importes por descuento:");
		lblMarcaDelVehculo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarcaDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblMarcaDelVehculo = new GridBagConstraints();
		gbc_lblMarcaDelVehculo.anchor = GridBagConstraints.WEST;
		gbc_lblMarcaDelVehculo.insets = new Insets(20, 70, 5, 5);
		gbc_lblMarcaDelVehculo.gridx = 0;
		gbc_lblMarcaDelVehculo.gridy = 3;
		PanelMedioInferior.add(lblMarcaDelVehculo, gbc_lblMarcaDelVehculo);
		
		textField_5 = new JTextField();
		textField_5.setText(datosPolizaDTO.getDescuento().toString());
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(20, 10, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 3;
		PanelMedioInferior.add(textField_5, gbc_textField_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Último día de pago:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(20, 20, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 3;
		PanelMedioInferior.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText(datosPolizaDTO.getUltimoDiaPago().toString());
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(20, 10, 5, 70);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		PanelMedioInferior.add(textField_2, gbc_textField_2);
		
		JLabel AñoVehiculo = new JLabel("Suma asegurada:");
		AñoVehiculo.setHorizontalAlignment(SwingConstants.LEFT);
		AñoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_AñoVehiculo = new GridBagConstraints();
		gbc_AñoVehiculo.anchor = GridBagConstraints.WEST;
		gbc_AñoVehiculo.insets = new Insets(20, 70, 5, 5);
		gbc_AñoVehiculo.gridx = 0;
		gbc_AñoVehiculo.gridy = 4;
		PanelMedioInferior.add(AñoVehiculo, gbc_AñoVehiculo);
		
		textField_6 = new JTextField();
		textField_6.setText(datosPolizaDTO.getSumaAsegurada().toString());
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(20, 10, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 4;
		PanelMedioInferior.add(textField_6, gbc_textField_6);
		
		JLabel SumaAs = new JLabel("Premio:");
		SumaAs.setHorizontalAlignment(SwingConstants.LEFT);
		SumaAs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_SumaAs = new GridBagConstraints();
		gbc_SumaAs.anchor = GridBagConstraints.WEST;
		gbc_SumaAs.fill = GridBagConstraints.VERTICAL;
		gbc_SumaAs.insets = new Insets(20, 20, 5, 5);
		gbc_SumaAs.gridx = 2;
		gbc_SumaAs.gridy = 4;
		PanelMedioInferior.add(SumaAs, gbc_SumaAs);
		
		textField = new JTextField();
		textField.setText(datosPolizaDTO.getPremio().toString());
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(20, 10, 5, 70);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 4;
		PanelMedioInferior.add(textField, gbc_textField);
		
		JLabel Chasis = new JLabel("Monto total a abonar:");
		Chasis.setHorizontalAlignment(SwingConstants.LEFT);
		Chasis.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_Chasis = new GridBagConstraints();
		gbc_Chasis.insets = new Insets(20, 20, 30, 5);
		gbc_Chasis.anchor = GridBagConstraints.WEST;
		gbc_Chasis.gridx = 2;
		gbc_Chasis.gridy = 5;
		PanelMedioInferior.add(Chasis, gbc_Chasis);
		
		textField_1 = new JTextField();
		textField_1.setText(String.valueOf(datosPolizaDTO.getPremio()-datosPolizaDTO.getDescuento()));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(20, 10, 30, 70);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 5;
		PanelMedioInferior.add(textField_1, gbc_textField_1);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(SystemColor.inactiveCaptionBorder);
		panelInferior.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panelInferior = new GridBagConstraints();
		gbc_panelInferior.anchor = GridBagConstraints.SOUTH;
		gbc_panelInferior.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelInferior.gridx = 0;
		gbc_panelInferior.gridy = 2;
		panel.add(panelInferior, gbc_panelInferior);
		GridBagLayout gbl_panelInferior = new GridBagLayout();
		gbl_panelInferior.columnWidths = new int[]{89, 0, 89, 0};
		gbl_panelInferior.rowHeights = new int[]{23, 0};
		gbl_panelInferior.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelInferior.rowWeights = new double[]{0.0, Double.MIN_VALUE};
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
				CrearPoliza_Mensual1.this.setVisible(false);
				CrearPoliza_Mensual1.this.dispose();
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
						
						CrearPoliza_Mensual2 CPoliza = new CrearPoliza_Mensual2(datosPolizaDTO, gestorPoliza, gestorCliente, nombresDTO);
						
						try {
							CPoliza.setVisible(true);
						} catch(Exception er) {
							er.printStackTrace();
						}
						CrearPoliza_Mensual1.this.setVisible(false);
						CrearPoliza_Mensual1.this.dispose();
				
			}
		});
		Boton_Continuar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Continuar = new GridBagConstraints();
		gbc_Boton_Continuar.insets = new Insets(10, 0, 10, 70);
		gbc_Boton_Continuar.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar.gridx = 2;
		gbc_Boton_Continuar.gridy = 0;
		panelInferior.add(Boton_Continuar, gbc_Boton_Continuar);




	}

}