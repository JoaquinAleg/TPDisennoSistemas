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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JDateChooser;

import DAOS.HibernateUtil;
import DTOS.DatosPolizaDTO;
import DTOS.NombresDTO;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;


public class CrearPoliza_Mensual2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private GestorPoliza gestorPoliza;
	private GestorCliente gestorCliente;
	private DatosPolizaDTO datosPolizaDTO;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		HibernateUtil.createEMF();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//CrearPoliza_Mensual2 frame = new CrearPoliza_Mensual2();
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
	public CrearPoliza_Mensual2(DatosPolizaDTO datosPolizaDTO, GestorPoliza gestorPoliza, GestorCliente gestorCliente,NombresDTO nombresDTO, String numeroClienteS) {
		this.datosPolizaDTO = datosPolizaDTO;
		this.gestorCliente = gestorCliente;
		this.gestorPoliza = gestorPoliza;
		
		Float pago = datosPolizaDTO.getPremio()-datosPolizaDTO.getDescuento();
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
		JLabel lblDatosDeLa_1 = new JLabel("Datos de la póliza - Titular del seguro: " + numeroClienteS);
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
		
		JLabel titulo = new JLabel("Información sobre cuotas mensuales\r\n");
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
		gbl_panel_1_1.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1_1.setLayout(gbl_panel_1_1);
		
		JLabel lblFechaDeNacimiento = new JLabel("Primer fecha:");
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento = new GridBagConstraints();
		gbc_lblFechaDeNacimiento.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento.insets = new Insets(30, 50, 5, 5);
		gbc_lblFechaDeNacimiento.gridx = 0;
		gbc_lblFechaDeNacimiento.gridy = 0;
		panel_1_1.add(lblFechaDeNacimiento, gbc_lblFechaDeNacimiento);
		
		textField_8 = new JTextField();
		textField_8.setText(datosPolizaDTO.getComienzoVigencia().plusDays(30).toString());
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(30, 5, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 0;
		panel_1_1.add(textField_8, gbc_textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText(String.valueOf(pago/6));
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(30, 0, 5, 50);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 0;
		panel_1_1.add(textField_9, gbc_textField_9);
		
		JLabel lblNewLabel_1_2 = new JLabel("Importe:             $");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2.insets = new Insets(30, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 3;
		gbc_lblNewLabel_1_2.gridy = 0;
		panel_1_1.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		JLabel lblEstadoCivil = new JLabel("Segunda fecha:");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
		gbc_lblEstadoCivil.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil.insets = new Insets(20, 50, 5, 5);
		gbc_lblEstadoCivil.gridx = 0;
		gbc_lblEstadoCivil.gridy = 2;
		panel_1_1.add(lblEstadoCivil, gbc_lblEstadoCivil);
		
		textField_7 = new JTextField();
		textField_7.setText(datosPolizaDTO.getComienzoVigencia().plusDays(60).toString());
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(20, 5, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 2;
		panel_1_1.add(textField_7, gbc_textField_7);
		
		textField_10 = new JTextField();
		textField_10.setText(String.valueOf(pago/6));
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(20, 0, 5, 50);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 4;
		gbc_textField_10.gridy = 2;
		panel_1_1.add(textField_10, gbc_textField_10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Importe:             $");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2_1.insets = new Insets(20, 0, 5, 5);
		gbc_lblNewLabel_1_2_1.gridx = 3;
		gbc_lblNewLabel_1_2_1.gridy = 2;
		panel_1_1.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		
	
		
		JLabel lblEstadoCivil_1_1 = new JLabel("Tercer fecha:");
		lblEstadoCivil_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_1_1 = new GridBagConstraints();
		gbc_lblEstadoCivil_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_1_1.insets = new Insets(20, 50, 5, 5);
		gbc_lblEstadoCivil_1_1.gridx = 0;
		gbc_lblEstadoCivil_1_1.gridy = 3;
		panel_1_1.add(lblEstadoCivil_1_1, gbc_lblEstadoCivil_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText(datosPolizaDTO.getComienzoVigencia().plusDays(90).toString());
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(20, 5, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		panel_1_1.add(textField_1, gbc_textField_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Importe:             $");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2_1_1.insets = new Insets(20, 0, 5, 5);
		gbc_lblNewLabel_1_2_1_1.gridx = 3;
		gbc_lblNewLabel_1_2_1_1.gridy = 3;
		panel_1_1.add(lblNewLabel_1_2_1_1, gbc_lblNewLabel_1_2_1_1);
		
		textField_6 = new JTextField();
		textField_6.setText(String.valueOf(pago/6));
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(20, 0, 5, 50);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 3;
		panel_1_1.add(textField_6, gbc_textField_6);
		
		JLabel lblEstadoCivil_1 = new JLabel("Cuarta fecha:");
		lblEstadoCivil_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_1 = new GridBagConstraints();
		gbc_lblEstadoCivil_1.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_1.insets = new Insets(20, 50, 5, 5);
		gbc_lblEstadoCivil_1.gridx = 0;
		gbc_lblEstadoCivil_1.gridy = 4;
		panel_1_1.add(lblEstadoCivil_1, gbc_lblEstadoCivil_1);
		
		textField = new JTextField();
		textField.setText(datosPolizaDTO.getComienzoVigencia().plusDays(120).toString());
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(20, 5, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		panel_1_1.add(textField, gbc_textField);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Importe:             $");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2_1_2.insets = new Insets(20, 0, 5, 5);
		gbc_lblNewLabel_1_2_1_2.gridx = 3;
		gbc_lblNewLabel_1_2_1_2.gridy = 4;
		panel_1_1.add(lblNewLabel_1_2_1_2, gbc_lblNewLabel_1_2_1_2);
		
		textField_11 = new JTextField();
		textField_11.setText(String.valueOf(pago/6));
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(20, 0, 5, 50);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 4;
		gbc_textField_11.gridy = 4;
		panel_1_1.add(textField_11, gbc_textField_11);
		
		JLabel lblEstadoCivil_2 = new JLabel("Quinta fecha:");
		lblEstadoCivil_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_2 = new GridBagConstraints();
		gbc_lblEstadoCivil_2.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_2.insets = new Insets(20, 50, 5, 5);
		gbc_lblEstadoCivil_2.gridx = 0;
		gbc_lblEstadoCivil_2.gridy = 5;
		panel_1_1.add(lblEstadoCivil_2, gbc_lblEstadoCivil_2);
		
		textField_4 = new JTextField();
		textField_4.setText(datosPolizaDTO.getComienzoVigencia().plusDays(150).toString());
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(20, 5, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		panel_1_1.add(textField_4, gbc_textField_4);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Importe:             $");
		lblNewLabel_1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2_1_3.insets = new Insets(20, 0, 5, 5);
		gbc_lblNewLabel_1_2_1_3.gridx = 3;
		gbc_lblNewLabel_1_2_1_3.gridy = 5;
		panel_1_1.add(lblNewLabel_1_2_1_3, gbc_lblNewLabel_1_2_1_3);
		
		textField_12 = new JTextField();
		textField_12.setText(String.valueOf(pago/6));
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(20, 0, 5, 50);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 4;
		gbc_textField_12.gridy = 5;
		panel_1_1.add(textField_12, gbc_textField_12);
		
		JLabel lblEstadoCivil_3 = new JLabel("Sexta fecha:\r\n");
		lblEstadoCivil_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_3 = new GridBagConstraints();
		gbc_lblEstadoCivil_3.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_3.insets = new Insets(20, 50, 40, 5);
		gbc_lblEstadoCivil_3.gridx = 0;
		gbc_lblEstadoCivil_3.gridy = 6;
		panel_1_1.add(lblEstadoCivil_3, gbc_lblEstadoCivil_3);
		
		textField_3 = new JTextField();
		textField_3.setText(datosPolizaDTO.getComienzoVigencia().plusDays(180).toString());
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(20, 5, 40, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 6;
		panel_1_1.add(textField_3, gbc_textField_3);
		
		JLabel lblNewLabel_1_2_1_4 = new JLabel("Importe:             $");
		lblNewLabel_1_2_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1_4 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2_1_4.insets = new Insets(20, 0, 50, 5);
		gbc_lblNewLabel_1_2_1_4.gridx = 3;
		gbc_lblNewLabel_1_2_1_4.gridy = 6;
		panel_1_1.add(lblNewLabel_1_2_1_4, gbc_lblNewLabel_1_2_1_4);
		
		textField_13 = new JTextField();
		textField_13.setText(String.valueOf(pago/6));
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(20, 0, 40, 50);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 4;
		gbc_textField_13.gridy = 6;
		panel_1_1.add(textField_13, gbc_textField_13);
		
		JLabel lblMarcaDelVehculo = new JLabel("Último día de pago:");
		lblMarcaDelVehculo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarcaDelVehculo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblMarcaDelVehculo = new GridBagConstraints();
		gbc_lblMarcaDelVehculo.anchor = GridBagConstraints.WEST;
		gbc_lblMarcaDelVehculo.insets = new Insets(20, 70, 40, 5);
		gbc_lblMarcaDelVehculo.gridx = 0;
		gbc_lblMarcaDelVehculo.gridy = 3;
		PanelMedioInferior.add(lblMarcaDelVehculo, gbc_lblMarcaDelVehculo);
		
		textField_5 = new JTextField();
		textField_5.setText(datosPolizaDTO.getUltimoDiaPago().toString());
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(20, 10, 40, 10);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 3;
		PanelMedioInferior.add(textField_5, gbc_textField_5);
		
		textField_2 = new JTextField();
		textField_2.setText(String.valueOf(pago));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(20, 10, 40, 70);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		PanelMedioInferior.add(textField_2, gbc_textField_2);
		
		JLabel SumaAs = new JLabel("Monto total a abonar:");
		SumaAs.setHorizontalAlignment(SwingConstants.LEFT);
		SumaAs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_SumaAs = new GridBagConstraints();
		gbc_SumaAs.anchor = GridBagConstraints.WEST;
		gbc_SumaAs.fill = GridBagConstraints.VERTICAL;
		gbc_SumaAs.insets = new Insets(20, 20, 40, 5);
		gbc_SumaAs.gridx = 2;
		gbc_SumaAs.gridy = 3;
		PanelMedioInferior.add(SumaAs, gbc_SumaAs);
		
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

		             int result = JOptionPane.showConfirmDialog(null,"¿Desea cancelar la creación póliza?", "Cancelar",
		                JOptionPane.YES_NO_OPTION,
		                JOptionPane.WARNING_MESSAGE);
		             if(result == JOptionPane.YES_OPTION){
		 				PantallaInicio_ProductorDeSeguro FuturaPantalla = new PantallaInicio_ProductorDeSeguro();
						
						try {
							FuturaPantalla.setVisible(true);
						} catch(Exception er) {
							er.printStackTrace();
						}
						CrearPoliza_Mensual2.this.setVisible(false);
						CrearPoliza_Mensual2.this.dispose();
					}
		}});
		Boton_Cancelar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Cancelar = new GridBagConstraints();
		gbc_Boton_Cancelar.anchor = GridBagConstraints.WEST;
		gbc_Boton_Cancelar.insets = new Insets(10, 70, 10, 5);
		gbc_Boton_Cancelar.gridx = 0;
		gbc_Boton_Cancelar.gridy = 0;
		panelInferior.add(Boton_Cancelar, gbc_Boton_Cancelar);
		
		JButton Boton_Continuar = new JButton("Confirmar");
		Boton_Continuar.setBackground(SystemColor.controlHighlight);
		Boton_Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestorPoliza.darAltaPoliza(datosPolizaDTO);
				JOptionPane.showMessageDialog(null,"La póliza fue generada correctamente","Generación Exitosa", JOptionPane.INFORMATION_MESSAGE);
				PantallaInicio_ProductorDeSeguro FuturaPantalla = new PantallaInicio_ProductorDeSeguro();
				
				try {
					FuturaPantalla.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				CrearPoliza_Mensual2.this.setVisible(false);
				CrearPoliza_Mensual2.this.dispose();
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