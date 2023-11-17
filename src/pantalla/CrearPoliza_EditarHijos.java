package pantalla;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CrearPoliza_EditarHijos extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CrearPoliza_EditarHijos() {
		setBackground(SystemColor.inactiveCaptionBorder);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEditarHijos = new JLabel("Editar Hijos");
		lblEditarHijos.setHorizontalAlignment(SwingConstants.LEFT);
		lblEditarHijos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblEditarHijos.setBorder(null);
		GridBagConstraints gbc_lblEditarHijos = new GridBagConstraints();
		gbc_lblEditarHijos.gridx = 0;
		gbc_lblEditarHijos.gridy = 0;
		add(lblEditarHijos, gbc_lblEditarHijos);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_panel_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1.gridx = 0;
		gbc_panel_1_1_1.gridy = 1;
		add(panel_1_1_1, gbc_panel_1_1_1);
		GridBagLayout gbl_panel_1_1_1 = new GridBagLayout();
		gbl_panel_1_1_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1_1_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1_1_1.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1_1_1.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1_1_1.setLayout(gbl_panel_1_1_1);
		
		JLabel lblFechaDeNacimiento_1 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento_1 = new GridBagConstraints();
		gbc_lblFechaDeNacimiento_1.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento_1.insets = new Insets(30, 50, 5, 5);
		gbc_lblFechaDeNacimiento_1.gridx = 0;
		gbc_lblFechaDeNacimiento_1.gridy = 0;
		panel_1_1_1.add(lblFechaDeNacimiento_1, gbc_lblFechaDeNacimiento_1);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.insets = new Insets(30, 5, 5, 30);
		gbc_dateChooser_1.gridx = 1;
		gbc_dateChooser_1.gridy = 0;
		panel_1_1_1.add(dateChooser_1, gbc_dateChooser_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Sexo:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2_1.insets = new Insets(30, 0, 5, 10);
		gbc_lblNewLabel_1_2_1.gridx = 3;
		gbc_lblNewLabel_1_2_1.gridy = 0;
		panel_1_1_1.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		
		JComboBox LocalidadRiesgo_1_1 = new JComboBox();
		LocalidadRiesgo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		LocalidadRiesgo_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_LocalidadRiesgo_1_1 = new GridBagConstraints();
		gbc_LocalidadRiesgo_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_LocalidadRiesgo_1_1.insets = new Insets(30, 0, 5, 40);
		gbc_LocalidadRiesgo_1_1.gridx = 4;
		gbc_LocalidadRiesgo_1_1.gridy = 0;
		panel_1_1_1.add(LocalidadRiesgo_1_1, gbc_LocalidadRiesgo_1_1);
		
		JLabel lblEstadoCivil_1 = new JLabel("Estado Civil:");
		lblEstadoCivil_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_1 = new GridBagConstraints();
		gbc_lblEstadoCivil_1.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_1.insets = new Insets(20, 50, 40, 5);
		gbc_lblEstadoCivil_1.gridx = 0;
		gbc_lblEstadoCivil_1.gridy = 2;
		panel_1_1_1.add(lblEstadoCivil_1, gbc_lblEstadoCivil_1);
		
		JComboBox MarcaVehiculo_1_1 = new JComboBox();
		MarcaVehiculo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		MarcaVehiculo_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_MarcaVehiculo_1_1 = new GridBagConstraints();
		gbc_MarcaVehiculo_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_MarcaVehiculo_1_1.insets = new Insets(20, 0, 40, 30);
		gbc_MarcaVehiculo_1_1.gridx = 1;
		gbc_MarcaVehiculo_1_1.gridy = 2;
		panel_1_1_1.add(MarcaVehiculo_1_1, gbc_MarcaVehiculo_1_1);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(20, 0, 40, 40);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 2;
		panel_1_1_1.add(btnNewButton_1, gbc_btnNewButton_1);

	}

}
