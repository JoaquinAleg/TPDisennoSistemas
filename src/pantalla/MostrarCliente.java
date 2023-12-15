package pantalla;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import DTOS.ClienteDTO;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;
import java.awt.event.ActionEvent;

public class MostrarCliente extends JFrame{
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 * @param buscarCliente 
	 * @param gestorCliente 
	 */
	public MostrarCliente(ClienteDTO cliDTO, GestorPoliza gestorPoliza, GestorCliente gestorCliente, BuscarCliente buscarCliente, Boolean panelAnterior) {
		setBounds(100, 100, 1256, 500);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("El Asegurado");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setForeground(SystemColor.inactiveCaptionBorder);

		setContentPane(contentPane);

		
		String tipoDocumentoCliente = gestorPoliza.getTipoDocumento().stream().filter(a -> a.getId() == cliDTO.getIdTipoDocumento()).map(a -> a.getNombre()).toList().get(0);
		String apellidoCliente = cliDTO.getApellido().toString();
		String nombreCliente = cliDTO.getNombre().toString();
		String documentoCliente = cliDTO.getNumeroDocumento().toString();
		String numeroCliente = cliDTO.getNumeroCliente().toString();
		

		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{202, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("Cliente Seleccionado");
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
		
		
		
		JLabel lblFechaDeNacimiento_1_1 = new JLabel("Número Cliente: ");
		lblFechaDeNacimiento_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento_1_1 = new GridBagConstraints();
		gbc_lblFechaDeNacimiento_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblFechaDeNacimiento_1_1.insets = new Insets(30, 50, 5, 5);
		gbc_lblFechaDeNacimiento_1_1.gridx = 0;
		gbc_lblFechaDeNacimiento_1_1.gridy = 0;
		prueba.add(lblFechaDeNacimiento_1_1, gbc_lblFechaDeNacimiento_1_1);
		
		JTextField numeroClienteTP = new JTextField(numeroCliente);
		numeroClienteTP .setEnabled(false);
		numeroClienteTP .setFont(new Font("Tahoma", Font.PLAIN, 30));
		numeroClienteTP .setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_numeroClienteTP  = new GridBagConstraints();
		gbc_numeroClienteTP.fill = GridBagConstraints.HORIZONTAL;
		gbc_numeroClienteTP.insets = new Insets(30, 0, 5, 5);
		gbc_numeroClienteTP.gridx = 1;
		gbc_numeroClienteTP.gridy = 0;
		prueba.add(numeroClienteTP , gbc_numeroClienteTP);
		
		
		
		JLabel apellidoLabel = new JLabel("Apellido: ");
		apellidoLabel.setHorizontalAlignment(SwingConstants.LEFT);
		apellidoLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_apellidoLabel = new GridBagConstraints();
		gbc_apellidoLabel.anchor = GridBagConstraints.WEST;
		gbc_apellidoLabel.insets = new Insets(20, 50, 5, 5);
		gbc_apellidoLabel.gridx = 0;
		gbc_apellidoLabel.gridy = 1;
		prueba.add(apellidoLabel, gbc_apellidoLabel);
		
		JTextField apellidoClienteTP = new JTextField(apellidoCliente);
		apellidoClienteTP.setEnabled(false);
		apellidoClienteTP.setFont(new Font("Tahoma", Font.PLAIN, 30));
		apellidoClienteTP.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_apellidoClienteTP = new GridBagConstraints();
		gbc_apellidoClienteTP.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellidoClienteTP.insets = new Insets(20, 0, 5, 40);
		gbc_apellidoClienteTP.gridx = 1;
		gbc_apellidoClienteTP.gridy = 1;
		prueba.add(apellidoClienteTP, gbc_apellidoClienteTP);
		
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1_2_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_2_1_1.insets = new Insets(20, 50, 5, 5);
		gbc_lblNewLabel_1_2_1_1.gridx = 2;
		gbc_lblNewLabel_1_2_1_1.gridy = 1;
		prueba.add(lblNewLabel_1_2_1_1, gbc_lblNewLabel_1_2_1_1);
		
		
		JTextField nombreClienteLabel = new JTextField(nombreCliente);
		nombreClienteLabel.setEnabled(false);
		nombreClienteLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		nombreClienteLabel.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_nombreClienteLabel = new GridBagConstraints();
		gbc_nombreClienteLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombreClienteLabel.insets = new Insets(20, 0, 5, 30);
		gbc_nombreClienteLabel.gridx = 3;
		gbc_nombreClienteLabel.gridy = 1;
		prueba.add(nombreClienteLabel, gbc_nombreClienteLabel);
		
		JLabel lblEstadoCivil_1_1 = new JLabel("Tipo Documento: ");
		lblEstadoCivil_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstadoCivil_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEstadoCivil_1_1 = new GridBagConstraints();
		gbc_lblEstadoCivil_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblEstadoCivil_1_1.insets = new Insets(20, 50, 40, 5);
		gbc_lblEstadoCivil_1_1.gridx = 0;
		gbc_lblEstadoCivil_1_1.gridy = 3;
		prueba.add(lblEstadoCivil_1_1, gbc_lblEstadoCivil_1_1);
		
		JTextField JTextFieldtipoDocumentoCliente = new JTextField(tipoDocumentoCliente);
		JTextFieldtipoDocumentoCliente.setEnabled(false);
		JTextFieldtipoDocumentoCliente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JTextFieldtipoDocumentoCliente.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_JTextFieldtipoDocumentoCliente = new GridBagConstraints();
		gbc_JTextFieldtipoDocumentoCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTextFieldtipoDocumentoCliente.insets = new Insets(20, 0, 40, 30);
		gbc_JTextFieldtipoDocumentoCliente.gridx = 1;
		gbc_JTextFieldtipoDocumentoCliente.gridy = 3;
		prueba.add(JTextFieldtipoDocumentoCliente, gbc_JTextFieldtipoDocumentoCliente);
		
		JLabel numeroDoc = new JLabel("Número de Documento: ");
		numeroDoc.setHorizontalAlignment(SwingConstants.LEFT);
		numeroDoc.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_numeroDoc = new GridBagConstraints();
		gbc_numeroDoc.anchor = GridBagConstraints.WEST;
		gbc_numeroDoc.insets = new Insets(20, 50, 40, 5);
		gbc_numeroDoc.gridx = 2;
		gbc_numeroDoc.gridy = 3;
		prueba.add(numeroDoc, gbc_numeroDoc);
		
		JTextField JTextFielNumeroDocumentoCliente = new JTextField(documentoCliente);
		JTextFielNumeroDocumentoCliente.setEnabled(false);
		JTextFielNumeroDocumentoCliente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JTextFielNumeroDocumentoCliente.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_JTextFielNumeroDocumentoCliente = new GridBagConstraints();
		gbc_JTextFielNumeroDocumentoCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_JTextFielNumeroDocumentoCliente.insets = new Insets(20, 0, 40, 30);
		gbc_JTextFielNumeroDocumentoCliente.gridx = 3;
		gbc_JTextFielNumeroDocumentoCliente.gridy = 3;
		prueba.add(JTextFielNumeroDocumentoCliente, gbc_JTextFielNumeroDocumentoCliente);
		JButton Boton_Continuar_1 = new JButton();
		Boton_Continuar_1.setText("Aceptar");
		Boton_Continuar_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Boton_Continuar_1.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_Boton_Continuar_1 = new GridBagConstraints();
		gbc_Boton_Continuar_1.insets = new Insets(10, 0, 10, 40);
		gbc_Boton_Continuar_1.gridx = 0;
		gbc_Boton_Continuar_1.gridy = 2;
		panel.add(Boton_Continuar_1, gbc_Boton_Continuar_1);
		Boton_Continuar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panelAnterior) {
					CrearPoliza_1 FuturaPantalla = new CrearPoliza_1(gestorPoliza, gestorCliente, buscarCliente, cliDTO);
					try {
						FuturaPantalla.setVisible(true);
					} catch(Exception er) {
						er.printStackTrace();
					}
					buscarCliente.setVisible(false);
					buscarCliente.dispose();
					MostrarCliente.this.setVisible(false);
					MostrarCliente.this.dispose();
				}
				else{
					PantallaInicio_ProductorDeSeguro FuturaPantalla = new PantallaInicio_ProductorDeSeguro();
					try {
						FuturaPantalla.setVisible(true);
					} catch(Exception er) {
						er.printStackTrace();
					}
					buscarCliente.setVisible(false);
					buscarCliente.dispose();
					MostrarCliente.this.setVisible(false);
					MostrarCliente.this.dispose();
					
				}
			}
		});
	}

}