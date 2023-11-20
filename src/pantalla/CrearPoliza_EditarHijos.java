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
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollBar;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Point;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
;



public class CrearPoliza_EditarHijos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 
	public CrearPoliza_EditarHijos() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("El Asegurado");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1000, 320);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{202, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		String numeroCliente = new String("numeroCliente");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("Editar Hijo");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_5_1.setBorder(null);
		panel_3.add(lblNewLabel_5_1);
		
		JPanel prueba = new JPanel();
		prueba.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		prueba.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_prueba = new GridBagConstraints();
		gbc_prueba.fill = GridBagConstraints.BOTH;
		gbc_prueba.gridx = 0;
		gbc_prueba.gridy = 1;
		panel.add(prueba, gbc_prueba);
		GridBagLayout gbl_prueba = new GridBagLayout();
		gbl_prueba.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_prueba.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_prueba.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_prueba.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		prueba.setLayout(gbl_prueba);
		
		JLabel lblFechaDeNacimiento_1_1 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento_1_1 = new GridBagConstraints();
		gbc_lblFechaDeNacimiento_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento_1_1.insets = new Insets(30, 50, 5, 5);
		gbc_lblFechaDeNacimiento_1_1.gridx = 0;
		gbc_lblFechaDeNacimiento_1_1.gridy = 0;
		prueba.add(lblFechaDeNacimiento_1_1, gbc_lblFechaDeNacimiento_1_1);
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		dateChooser_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_dateChooser_1_1 = new GridBagConstraints();
		gbc_dateChooser_1_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1_1.insets = new Insets(30, 5, 5, 30);
		gbc_dateChooser_1_1.gridx = 1;
		gbc_dateChooser_1_1.gridy = 0;
		prueba.add(dateChooser_1_1, gbc_dateChooser_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2_1_1.insets = new Insets(30, 0, 5, 10);
		gbc_lblNewLabel_1_2_1_1.gridx = 3;
		gbc_lblNewLabel_1_2_1_1.gridy = 0;
		prueba.add(lblNewLabel_1_2_1_1, gbc_lblNewLabel_1_2_1_1);
		
		JComboBox LocalidadRiesgo_1_1_1 = new JComboBox();
		LocalidadRiesgo_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		LocalidadRiesgo_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_LocalidadRiesgo_1_1_1 = new GridBagConstraints();
		gbc_LocalidadRiesgo_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_LocalidadRiesgo_1_1_1.insets = new Insets(30, 0, 5, 40);
		gbc_LocalidadRiesgo_1_1_1.gridx = 4;
		gbc_LocalidadRiesgo_1_1_1.gridy = 0;
		prueba.add(LocalidadRiesgo_1_1_1, gbc_LocalidadRiesgo_1_1_1);
		
		JLabel lblEstadoCivil_1_1 = new JLabel("Estado Civil:");
		lblEstadoCivil_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_1_1 = new GridBagConstraints();
		gbc_lblEstadoCivil_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_1_1.insets = new Insets(20, 50, 40, 5);
		gbc_lblEstadoCivil_1_1.gridx = 0;
		gbc_lblEstadoCivil_1_1.gridy = 2;
		prueba.add(lblEstadoCivil_1_1, gbc_lblEstadoCivil_1_1);
		
		JComboBox MarcaVehiculo_1_1_1 = new JComboBox();
		MarcaVehiculo_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		MarcaVehiculo_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_MarcaVehiculo_1_1_1 = new GridBagConstraints();
		gbc_MarcaVehiculo_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_MarcaVehiculo_1_1_1.insets = new Insets(20, 0, 40, 30);
		gbc_MarcaVehiculo_1_1_1.gridx = 1;
		gbc_MarcaVehiculo_1_1_1.gridy = 2;
		prueba.add(MarcaVehiculo_1_1_1, gbc_MarcaVehiculo_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Confirmar");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearPoliza_EditarHijos.this.setVisible(false);
				CrearPoliza_EditarHijos.this.dispose();
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_1_2.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_2.insets = new Insets(20, 0, 40, 40);
		gbc_btnNewButton_1_2.gridx = 4;
		gbc_btnNewButton_1_2.gridy = 2;
		prueba.add(btnNewButton_1_2, gbc_btnNewButton_1_2);


	}
}