package pantalla;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;

import Gestores.GestorCliente;
import Gestores.GestorPoliza;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;


public class PantallaInicio_ProductorDeSeguro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestorPoliza gestorPoliza;
	private GestorCliente gestorCliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio_ProductorDeSeguro frame = new PantallaInicio_ProductorDeSeguro();
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
	public PantallaInicio_ProductorDeSeguro() {
		
		this.gestorPoliza = GestorPoliza.getInstance();
		this.gestorCliente = GestorCliente.getInstance();
		
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("El Asegurado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{10, 0, 10, 0};
		gbl_contentPane.rowHeights = new int[]{10, 0, 10, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{10, 0, 0, 10, 0, 0};
		gbl_panel.rowHeights = new int[]{20, 350, 0, 20, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JTextPane txtpnElAsegurado = new JTextPane();
		txtpnElAsegurado.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnElAsegurado.setFont(new Font("Tahoma", Font.PLAIN, 70));
		txtpnElAsegurado.setText("Menú Principal");
		GridBagConstraints gbc_txtpnElAsegurado = new GridBagConstraints();
		gbc_txtpnElAsegurado.gridwidth = 2;
		gbc_txtpnElAsegurado.insets = new Insets(15, 15, 5, 5);
		gbc_txtpnElAsegurado.fill = GridBagConstraints.BOTH;
		gbc_txtpnElAsegurado.gridx = 1;
		gbc_txtpnElAsegurado.gridy = 1;
		panel.add(txtpnElAsegurado, gbc_txtpnElAsegurado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{15, 0, 0, 0, 15, 0};
		gbl_panel_1.rowHeights = new int[]{10, 0, 140, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/ProductorSeguro.png")));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.weightx = 0.3;
		gbc_lblNewLabel_6.gridwidth = 3;
		gbc_lblNewLabel_6.insets = new Insets(10, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 0;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("Productor de Seguros\r\n");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.gridwidth = 3;
		gbc_lblNewLabel_5_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_1.gridx = 1;
		gbc_lblNewLabel_5_1.gridy = 1;
		panel_1.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
		
		JButton btnNewButton = new JButton("\r\nUsuario");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/personita.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weightx = 0.33;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(15, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Ajustes");
		btnNewButton_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/engranajesChicos.png")));
		btnNewButton_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.weightx = 0.33;
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(15, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 2;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/salir.png")));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.weightx = 0.33;
		gbc_btnNewButton_1.insets = new Insets(15, 0, 0, 5);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 2;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 2;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{15, 0, 0, 15, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/Documento.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.weighty = 0.25;
		gbc_lblNewLabel_1.weightx = 0.3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Gestión de Pólizas");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3_1.weighty = 0.25;
		gbc_lblNewLabel_3_1.weightx = 0.7;
		gbc_lblNewLabel_3_1.insets = new Insets(10, 5, 5, 5);
		gbc_lblNewLabel_3_1.gridx = 2;
		gbc_lblNewLabel_3_1.gridy = 0;
		panel_2.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		JButton btnDarDeAlta_2 = new JButton("Dar de alta Póliza\r\n");
		btnDarDeAlta_2.setBackground(SystemColor.controlHighlight);
		btnDarDeAlta_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDarDeAlta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarCliente FuturaPantalla = new BuscarCliente(gestorCliente, gestorPoliza,true);
				try {
					FuturaPantalla.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				PantallaInicio_ProductorDeSeguro.this.setVisible(false);
				PantallaInicio_ProductorDeSeguro.this.dispose();
			}
		});
		GridBagConstraints gbc_btnDarDeAlta_2 = new GridBagConstraints();
		gbc_btnDarDeAlta_2.ipady = 25;
		gbc_btnDarDeAlta_2.gridwidth = 2;
		gbc_btnDarDeAlta_2.weighty = 0.25;
		gbc_btnDarDeAlta_2.weightx = 0.25;
		gbc_btnDarDeAlta_2.fill = GridBagConstraints.BOTH;
		gbc_btnDarDeAlta_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta_2.gridx = 1;
		gbc_btnDarDeAlta_2.gridy = 1;
		panel_2.add(btnDarDeAlta_2, gbc_btnDarDeAlta_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Consultar Póliza");
		btnNewButton_1_1_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.gridwidth = 2;
		gbc_btnNewButton_1_1_1.weighty = 0.25;
		gbc_btnNewButton_1_1_1.weightx = 0.25;
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1_1.gridx = 1;
		gbc_btnNewButton_1_1_1.gridy = 2;
		panel_2.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Generar propuestas de Renovación");
		btnNewButton_1_1_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_1_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_1_2.gridwidth = 2;
		gbc_btnNewButton_1_1_2.weighty = 0.25;
		gbc_btnNewButton_1_1_2.insets = new Insets(0, 0, 10, 5);
		gbc_btnNewButton_1_1_2.weightx = 0.25;
		gbc_btnNewButton_1_1_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_2.gridx = 1;
		gbc_btnNewButton_1_1_2.gridy = 3;
		panel_2.add(btnNewButton_1_1_2, gbc_btnNewButton_1_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 2;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{15, 0, 0, 15, 0};
		gbl_panel_3.rowHeights = new int[]{0, 15, 15, 0, 15, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/id.png")));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.weighty = 0.25;
		gbc_lblNewLabel_2.weightx = 0.3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gestión de Clientes");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.weightx = 0.7;
		gbc_lblNewLabel_3.weighty = 0.33;
		gbc_lblNewLabel_3.insets = new Insets(10, 5, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 0;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnDarDeAlta = new JButton("Dar de alta Cliente\r\n");
		btnDarDeAlta.setBackground(SystemColor.controlHighlight);
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDarDeAlta.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.ipady = 25;
		gbc_btnDarDeAlta.gridwidth = 2;
		gbc_btnDarDeAlta.weighty = 0.33;
		gbc_btnDarDeAlta.fill = GridBagConstraints.BOTH;
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta.gridx = 1;
		gbc_btnDarDeAlta.gridy = 1;
		panel_3.add(btnDarDeAlta, gbc_btnDarDeAlta);
		
		JButton ConsultarCliente = new JButton("Consultar Cliente");
		ConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarCliente PantallaSiguiente = new BuscarCliente(gestorCliente,gestorPoliza, false);
				try {
					PantallaSiguiente.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				PantallaInicio_ProductorDeSeguro.this.setVisible(false);
				PantallaInicio_ProductorDeSeguro.this.dispose();
			}
		});
		ConsultarCliente.setBackground(SystemColor.controlHighlight);
		ConsultarCliente.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_ConsultarCliente = new GridBagConstraints();
		gbc_ConsultarCliente.ipady = 25;
		gbc_ConsultarCliente.gridwidth = 2;
		gbc_ConsultarCliente.weighty = 0.25;
		gbc_ConsultarCliente.fill = GridBagConstraints.BOTH;
		gbc_ConsultarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_ConsultarCliente.gridx = 1;
		gbc_ConsultarCliente.gridy = 2;
		panel_3.add(ConsultarCliente, gbc_ConsultarCliente);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 3;
		gbc_panel_4.gridy = 2;
		panel.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{15, 15, 0, 15, 0};
		gbl_panel_4.rowHeights = new int[] {0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PantallaInicio_ProductorDeSeguro.class.getResource("/imagenes/engranajeGrande.png")));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.weighty = 0.25;
		gbc_lblNewLabel_4.weightx = 0.3;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		panel_4.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gestión de Parámetros");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.weightx = 0.07;
		gbc_lblNewLabel_5.weighty = 0.25;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 1;
		panel_4.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JButton btnActualizarFactoresDe = new JButton("Actualizar factores de características");
		btnActualizarFactoresDe.setBackground(SystemColor.controlHighlight);
		btnActualizarFactoresDe.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_btnActualizarFactoresDe = new GridBagConstraints();
		gbc_btnActualizarFactoresDe.gridwidth = 2;
		gbc_btnActualizarFactoresDe.weighty = 0.25;
		gbc_btnActualizarFactoresDe.fill = GridBagConstraints.BOTH;
		gbc_btnActualizarFactoresDe.insets = new Insets(0, 0, 5, 5);
		gbc_btnActualizarFactoresDe.gridx = 1;
		gbc_btnActualizarFactoresDe.gridy = 2;
		panel_4.add(btnActualizarFactoresDe, gbc_btnActualizarFactoresDe);
	}

}
