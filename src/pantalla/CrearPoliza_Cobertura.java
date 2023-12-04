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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import CustomRenderers.ListadoDTORenderer;
import DTOS.DatosPolizaDTO;
import DTOS.HijosDTO;
import DTOS.ListadoDTO;
import DTOS.NombresDTO;
import Gestores.GestorCliente;
import Gestores.GestorPoliza;
import POJOS.Cobertura;

import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;
;



public class CrearPoliza_Cobertura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private GestorPoliza gestorPoliza;
	private GestorCliente gestorCliente;
	private DatosPolizaDTO datosPolizaDTO;
	List<ListadoDTO> modeloTipoFormaPagoDTO;
	private ArrayList<HijosDTO> cantidadHijos;
	String[] modelosTipoFormaPago;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//CrearPoliza_Cobertura frame = new CrearPoliza_Cobertura();
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
	public CrearPoliza_Cobertura(ArrayList<HijosDTO> hijos,
			GestorPoliza gestorPoliza, GestorCliente gestorCliente,  NombresDTO nombresDTO,DatosPolizaDTO datosPolizaDTO, List<ListadoDTO> sexoDTO, List<ListadoDTO> estadoCivilDTO, JFrame anterior) {
		this.cantidadHijos = hijos;
		this.datosPolizaDTO = datosPolizaDTO;
		this.gestorPoliza = gestorPoliza;
		this.gestorCliente = gestorCliente;
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
		gbl_contentPane.rowHeights = new int[]{202, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		//String numeroCliente = new String("numeroCliente");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 4;
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
		JLabel lblDatosDeLa_1 = new JLabel("Selección de cobertura - Cliente nro: numeroCliente");
		lblDatosDeLa_1.setBackground(SystemColor.inactiveCaptionBorder);
		lblDatosDeLa_1.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		lblDatosDeLa_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDatosDeLa_1 = new GridBagConstraints();
		gbc_lblDatosDeLa_1.gridwidth = 4;
		gbc_lblDatosDeLa_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblDatosDeLa_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDatosDeLa_1.gridx = 0;
		gbc_lblDatosDeLa_1.gridy = 1;
		panel.add(lblDatosDeLa_1, gbc_lblDatosDeLa_1);
		lblDatosDeLa_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblDatosDeLa_1_1 = new JLabel("Cobertura Disponible");
		GridBagConstraints gbc_lblDatosDeLa_1_1 = new GridBagConstraints();
		gbc_lblDatosDeLa_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDatosDeLa_1_1.gridwidth = 4;
		gbc_lblDatosDeLa_1_1.gridx = 0;
		gbc_lblDatosDeLa_1_1.gridy = 2;
		panel.add(lblDatosDeLa_1_1, gbc_lblDatosDeLa_1_1);
		lblDatosDeLa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDeLa_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDatosDeLa_1_1.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 0, 0)));
		lblDatosDeLa_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{234, 0};
		gbl_panel_1.rowHeights = new int[]{80, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Cobertura Disponibles");
		
		List<ListadoDTO> coberturaDTO = this.gestorPoliza.getCoberturas();
		String[] coberturas = coberturaDTO.stream().map(c->c.getNombre()).toArray(String[]::new);
		for(String e : coberturas) {
			modelo.addRow( new Object[]{e});
		}

		table = new JTable(modelo);
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		table.setBackground(Color.WHITE);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		panel_1.add(table, gbc_table);
			

		
		JLabel lblFechaDeNacimiento_1_1 = new JLabel("Fecha de Inicio:");

		lblFechaDeNacimiento_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaDeNacimiento_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblFechaDeNacimiento_1_1 = new GridBagConstraints();
		gbc_lblFechaDeNacimiento_1_1.insets = new Insets(0, 0, 20, 5);
		gbc_lblFechaDeNacimiento_1_1.gridx = 0;
		gbc_lblFechaDeNacimiento_1_1.gridy = 4;
		panel.add(lblFechaDeNacimiento_1_1, gbc_lblFechaDeNacimiento_1_1);
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		Calendar maniana = Calendar.getInstance();
		maniana.setTime(Calendar.getInstance().getTime());
		maniana.add(Calendar.DAY_OF_YEAR, 1);
		dateChooser_1_1.setDate(maniana.getTime());
		dateChooser_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_dateChooser_1_1 = new GridBagConstraints();
		gbc_dateChooser_1_1.insets = new Insets(0, 0, 20, 5);
		gbc_dateChooser_1_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1_1.gridx = 1;
		gbc_dateChooser_1_1.gridy = 4;
		panel.add(dateChooser_1_1, gbc_dateChooser_1_1);
		
		JLabel lblNewLabel = new JLabel("Formas de pago:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 20, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		modeloTipoFormaPagoDTO = this.gestorPoliza.getTipoFormaPago();
		JComboBox<ListadoDTO> formasPago = new JComboBox<>(estadoCivilDTO.toArray(new ListadoDTO[estadoCivilDTO.size()]));
		formasPago.setRenderer(new ListadoDTORenderer());
		formasPago.setFont(new Font("Tahoma", Font.PLAIN, 30));
		formasPago.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_formasPago = new GridBagConstraints();
		gbc_formasPago.insets = new Insets(0, 5, 20, 40);
		gbc_formasPago.fill = GridBagConstraints.HORIZONTAL;
		gbc_formasPago.gridx = 3;
		gbc_formasPago.gridy = 4;
		panel.add(formasPago, gbc_formasPago);

		
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 4;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.anchor = GridBagConstraints.SOUTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 6;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{89, 0, 0, 89, 0};
		gbl_panel_2.rowHeights = new int[]{23, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
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
				CrearPoliza_Cobertura.this.setVisible(false);
				CrearPoliza_Cobertura.this.dispose();
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
		Boton_Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datosPolizaDTO.setComienzoVigencia(dateChooser_1_1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
				datosPolizaDTO.setUltimoDiaPago(dateChooser_1_1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().minusDays(1));
				Long[] idFormaPago = modeloTipoFormaPagoDTO.stream().filter(a -> a.getNombre().equals(formasPago.getSelectedItem())).map(b -> b.getId()).toArray(Long[]::new);
				datosPolizaDTO.setIdFormaPago(idFormaPago[0]);
				Long[] idCobertura = coberturaDTO.stream().filter(a -> a.getNombre().equals(modelo.getValueAt(table.getSelectedRow(), 0))).map(b -> b.getId()).toArray(Long[]::new);
				System.out.println(modelo.getValueAt(table.getSelectedRow(), 0));
				System.out.println(idCobertura.toString());
				datosPolizaDTO.setIdCobertura(idCobertura[0]);
				if(formasPago.getSelectedItem().equals(" ")  || table.getSelectionModel().isSelectionEmpty() ) {
					JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos","Error",JOptionPane.WARNING_MESSAGE);
				}else {
				if(formasPago.getSelectedItem().equals("Mensual")) {
				CrearPoliza_Mensual1 CPoliza = new CrearPoliza_Mensual1(datosPolizaDTO, nombresDTO, gestorPoliza, gestorCliente);
				
				try {
					CPoliza.setVisible(true);
				} catch(Exception er) {
					er.printStackTrace();
				}
				CrearPoliza_Cobertura.this.setVisible(false);
				CrearPoliza_Cobertura.this.dispose();
				} else {
					CrearPoliza_Semestral CPoliza = new CrearPoliza_Semestral(datosPolizaDTO, nombresDTO, gestorPoliza, gestorCliente);
					
					try {
						CPoliza.setVisible(true);
					} catch(Exception er) {
						er.printStackTrace();
					}
					CrearPoliza_Cobertura.this.setVisible(false);
					CrearPoliza_Cobertura.this.dispose();
				}
			}}
		});
		Boton_Continuar.setBackground(SystemColor.controlHighlight);
		Boton_Continuar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Continuar = new GridBagConstraints();
		gbc_Boton_Continuar.insets = new Insets(10, 0, 10, 40);
		gbc_Boton_Continuar.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar.gridx = 3;
		gbc_Boton_Continuar.gridy = 0;
		panel_2.add(Boton_Continuar, gbc_Boton_Continuar);
		
		JButton Boton_Continuar_2 = new JButton("Volver");
		Boton_Continuar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				anterior.setVisible(true);
			} catch(Exception er) {
				er.printStackTrace();
			}
				
			CrearPoliza_Cobertura.this.setVisible(false);
			CrearPoliza_Cobertura.this.dispose();
			}
		});
		Boton_Continuar_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		Boton_Continuar_2.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_Boton_Continuar_2 = new GridBagConstraints();
		gbc_Boton_Continuar_2.insets = new Insets(0, 0, 0, 5);
		gbc_Boton_Continuar_2.gridx = 2;
		gbc_Boton_Continuar_2.gridy = 0;
		panel_2.add(Boton_Continuar_2, gbc_Boton_Continuar_2);




	}

}