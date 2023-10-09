package pantalla;

import java.awt.BorderLayout;
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
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaInicio_ProductorDeSeguro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("El Asegurado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{10, 0, 10, 0};
		gbl_contentPane.rowHeights = new int[]{10, 0, 10, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{10, 0, 0, 10, 0, 0};
		gbl_panel.rowHeights = new int[]{20, 0, 0, 20, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JTextPane txtpnElAsegurado = new JTextPane();
		txtpnElAsegurado.setBackground(new Color(240, 240, 240));
		txtpnElAsegurado.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtpnElAsegurado.setText("Menú Principal");
		GridBagConstraints gbc_txtpnElAsegurado = new GridBagConstraints();
		gbc_txtpnElAsegurado.gridwidth = 2;
		gbc_txtpnElAsegurado.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnElAsegurado.fill = GridBagConstraints.BOTH;
		gbc_txtpnElAsegurado.gridx = 1;
		gbc_txtpnElAsegurado.gridy = 1;
		panel.add(txtpnElAsegurado, gbc_txtpnElAsegurado);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{15, 0, 15, 0};
		gbl_panel_1.rowHeights = new int[]{10, 0, 0, 10, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Gestión de Parámetros");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_1.gridx = 1;
		gbc_lblNewLabel_5_1.gridy = 1;
		panel_1.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 2;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{15, 0, 15, 0};
		gbl_panel_2.rowHeights = new int[]{10, 0, 5, 0, 0, 0, 10, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Gestión de Pólizas");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1.gridx = 1;
		gbc_lblNewLabel_3_1.gridy = 1;
		panel_2.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		JButton btnDarDeAlta_2 = new JButton("Dar de alta Póliza\r\n");
		btnDarDeAlta_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDarDeAlta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnDarDeAlta_2 = new GridBagConstraints();
		gbc_btnDarDeAlta_2.fill = GridBagConstraints.BOTH;
		gbc_btnDarDeAlta_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta_2.gridx = 1;
		gbc_btnDarDeAlta_2.gridy = 3;
		panel_2.add(btnDarDeAlta_2, gbc_btnDarDeAlta_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Consultar Póliza");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1_1.gridx = 1;
		gbc_btnNewButton_1_1_1.gridy = 4;
		panel_2.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Generar propuestas de Renovación");
		GridBagConstraints gbc_btnNewButton_1_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_2.gridx = 1;
		gbc_btnNewButton_1_1_2.gridy = 5;
		panel_2.add(btnNewButton_1_1_2, gbc_btnNewButton_1_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 2;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{15, 0, 15, 0};
		gbl_panel_3.rowHeights = new int[]{10, 0, 5, 15, 15, 15, 10, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Gestión de Clientes");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnDarDeAlta = new JButton("Dar de alta Cliente\r\n");
		btnDarDeAlta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.fill = GridBagConstraints.BOTH;
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarDeAlta.gridx = 1;
		gbc_btnDarDeAlta.gridy = 3;
		panel_3.add(btnDarDeAlta, gbc_btnDarDeAlta);
		
		JButton btnNewButton_1_1 = new JButton("Consultar Cliente");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1.gridx = 1;
		gbc_btnNewButton_1_1.gridy = 4;
		panel_3.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 3;
		gbc_panel_4.gridy = 2;
		panel.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{15, 0, 15, 0};
		gbl_panel_4.rowHeights = new int[]{10, 0, 5, 0, 0, 0, 10, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gestión de Parámetros");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 1;
		panel_4.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JButton btnActualizarFactoresDe = new JButton("Actualizar factores de características");
		btnActualizarFactoresDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnActualizarFactoresDe = new GridBagConstraints();
		gbc_btnActualizarFactoresDe.fill = GridBagConstraints.BOTH;
		gbc_btnActualizarFactoresDe.insets = new Insets(0, 0, 5, 5);
		gbc_btnActualizarFactoresDe.gridx = 1;
		gbc_btnActualizarFactoresDe.gridy = 3;
		panel_4.add(btnActualizarFactoresDe, gbc_btnActualizarFactoresDe);
	}

}
