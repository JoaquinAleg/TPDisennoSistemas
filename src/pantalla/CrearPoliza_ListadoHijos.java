package pantalla;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
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

import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;


public class CrearPoliza_ListadoHijos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestorPoliza gestorPoliza;
	private List<ListadoDTO> modeloDTO;
	private List<ListadoDTO> sexDTO;
	private List<ListadoDTO> estCivilDTO;
	private ArrayList <HijosDTO> hijos;

	public CrearPoliza_ListadoHijos(ArrayList <HijosDTO> hijos,	GestorPoliza gestorPoliza, GestorCliente gestorCliente, NombresDTO nombresDTO,
			DatosPolizaDTO datosPolizaDTO, List<ListadoDTO> sexoDTO, List<ListadoDTO> estadoCivilDTO, JFrame conHijos, JFrame poliza1) {
		int cantidadHijos = hijos.size();
		this.hijos=hijos;
		this.gestorPoliza = gestorPoliza;
		this.estCivilDTO = estadoCivilDTO;
		this.sexDTO = sexoDTO;
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
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
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
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
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
		
		JPanel contenedorDeScrollpane = new JPanel();
		contenedorDeScrollpane.setBackground(SystemColor.inactiveCaptionBorder);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(10, 0, 10, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panel.add(contenedorDeScrollpane , gbc_panel_1);
		 
		JPanel ContenedorDeInfo = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        ContenedorDeInfo.setLayout(new BoxLayout(ContenedorDeInfo, BoxLayout.Y_AXIS));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setViewportView(ContenedorDeInfo);
        contenedorDeScrollpane.add(scrollPane, BorderLayout.CENTER);
        scrollPane.getViewport().setPreferredSize(new Dimension(1000, 500));

		
		//--------EMPIEZA------------------------------------------------
			for(HijosDTO hijo : this.hijos){
				if(cantidadHijos == 1) {scrollPane.getViewport().setPreferredSize(new Dimension(1000, 225));}
				final HijosDTO h = hijo;
				JPanel prueba = new JPanel();
				prueba.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
				prueba.setBackground(SystemColor.inactiveCaptionBorder);
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
				
				JDateChooser nacimiento = new JDateChooser();
				nacimiento.setEnabled(false);
				nacimiento.setDate(Date.from(h.getFechaNacimiento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
				nacimiento.setBackground(SystemColor.inactiveCaptionBorder);
				GridBagConstraints gbc_dateChooser_1_1 = new GridBagConstraints();
				gbc_dateChooser_1_1.fill = GridBagConstraints.BOTH;
				gbc_dateChooser_1_1.insets = new Insets(30, 5, 5, 30);
				gbc_dateChooser_1_1.gridx = 1;
				gbc_dateChooser_1_1.gridy = 0;
				prueba.add(nacimiento, gbc_dateChooser_1_1);
				
				JLabel lblEstadoCivil_1_1 = new JLabel("Estado Civil:");
				lblEstadoCivil_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblEstadoCivil_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
				GridBagConstraints gbc_lblEstadoCivil_1_1 = new GridBagConstraints();
				gbc_lblEstadoCivil_1_1.anchor = GridBagConstraints.WEST;
				gbc_lblEstadoCivil_1_1.insets = new Insets(20, 50, 40, 5);
				gbc_lblEstadoCivil_1_1.gridx = 0;
				gbc_lblEstadoCivil_1_1.gridy = 2;
				prueba.add(lblEstadoCivil_1_1, gbc_lblEstadoCivil_1_1);
				
				estCivilDTO = gestorPoliza.getEstadoCiviles();
				JComboBox<ListadoDTO> TipoEstadoCivil = new JComboBox<>(estadoCivilDTO.toArray(new ListadoDTO[estadoCivilDTO.size()]));
				TipoEstadoCivil.setRenderer(new ListadoDTORenderer());
				TipoEstadoCivil.setEnabled(false);
				TipoEstadoCivil.setSelectedIndex(Integer.parseInt(h.getEstadoCivil().toString()));
				TipoEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 30));
				TipoEstadoCivil.setBackground(SystemColor.inactiveCaptionBorder);
				GridBagConstraints gbc_MarcaVehiculo_1_1_1 = new GridBagConstraints();
				gbc_MarcaVehiculo_1_1_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_MarcaVehiculo_1_1_1.insets = new Insets(20, 0, 40, 30);
				gbc_MarcaVehiculo_1_1_1.gridx = 1;
				gbc_MarcaVehiculo_1_1_1.gridy = 2;
				prueba.add(TipoEstadoCivil, gbc_MarcaVehiculo_1_1_1);
				
				JLabel lblNewLabel_1_2_1_1 = new JLabel("Sexo:");
				lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
				GridBagConstraints gbc_lblNewLabel_1_2_1_1 = new GridBagConstraints();
				gbc_lblNewLabel_1_2_1_1.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel_1_2_1_1.insets = new Insets(30, 0, 5, 10);
				gbc_lblNewLabel_1_2_1_1.gridx = 3;
				gbc_lblNewLabel_1_2_1_1.gridy = 0;
				prueba.add(lblNewLabel_1_2_1_1, gbc_lblNewLabel_1_2_1_1);
				
				sexDTO = gestorPoliza.getSexos();
				JComboBox<ListadoDTO> TipoSexo = new JComboBox<>(sexoDTO.toArray(new ListadoDTO[this.sexDTO.size()]));
				TipoSexo.setRenderer(new ListadoDTORenderer());
				TipoSexo.setEnabled(false);
				TipoSexo.setSelectedIndex(Integer.parseInt(h.getSexo().toString()));
				TipoSexo.setFont(new Font("Tahoma", Font.PLAIN, 30));
				TipoSexo.setBackground(SystemColor.inactiveCaptionBorder);
				GridBagConstraints gbc_LocalidadRiesgo_1_1_1 = new GridBagConstraints();
				gbc_LocalidadRiesgo_1_1_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_LocalidadRiesgo_1_1_1.insets = new Insets(30, 0, 5, 40);
				gbc_LocalidadRiesgo_1_1_1.gridx = 4;
				gbc_LocalidadRiesgo_1_1_1.gridy = 0;
				prueba.add(TipoSexo, gbc_LocalidadRiesgo_1_1_1);
				
				JButton btnNewButton_1_1_1 = new JButton("Editar");
				btnNewButton_1_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CrearPoliza_EditarHijos FuturaPantalla = new CrearPoliza_EditarHijos(gestorPoliza, gestorCliente, hijos ,h, nombresDTO,datosPolizaDTO, CrearPoliza_ListadoHijos.this,
								sexoDTO,estadoCivilDTO, conHijos, poliza1);
						
						try {
							FuturaPantalla.setVisible(true);
						} catch(Exception er) {
							er.printStackTrace();
						}
						CrearPoliza_ListadoHijos.this.setVisible(false);
						CrearPoliza_ListadoHijos.this.dispose();
					}
				});
				btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
				btnNewButton_1_1_1.setBackground(SystemColor.controlHighlight);
				GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
				gbc_btnNewButton_1_1_1.insets = new Insets(20, 0, 40, 10);
				gbc_btnNewButton_1_1_1.gridx = 3;
				gbc_btnNewButton_1_1_1.gridy = 2;
				prueba.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
				
				JButton eliminar = new JButton("Eliminar");
				eliminar.setFont(new Font("Tahoma", Font.PLAIN, 35));
				eliminar.setBackground(SystemColor.controlHighlight);
				GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
				gbc_btnNewButton_1_2.insets = new Insets(20, 0, 40, 40);
				gbc_btnNewButton_1_2.gridx = 4;
				gbc_btnNewButton_1_2.gridy = 2;
				prueba.add(eliminar, gbc_btnNewButton_1_2);
				eliminar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
					int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el hijo?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(opcion == 0) { //como el YES está puesto primero, retorna un 0 si lo elije
						hijos.remove(h);
						
						if(hijos.isEmpty()) {
							CrearPoliza_2 FuturaPantalla = new CrearPoliza_2(datosPolizaDTO,gestorPoliza,gestorCliente, nombresDTO,poliza1);
							
							try {
								FuturaPantalla.setVisible(true);
							} catch(Exception er) {
								er.printStackTrace();
							}
							CrearPoliza_ListadoHijos.this.setVisible(false);
							CrearPoliza_ListadoHijos.this.dispose();
							}else {
						
						CrearPoliza_ListadoHijos actualizada = new CrearPoliza_ListadoHijos( hijos,gestorPoliza, gestorCliente, nombresDTO,datosPolizaDTO, sexDTO, estCivilDTO, conHijos,poliza1);
						try {
							actualizada.setVisible(true);
						} catch(Exception er) {
							er.printStackTrace();
						}
						CrearPoliza_ListadoHijos.this.setVisible(false);
						CrearPoliza_ListadoHijos.this.dispose();
					}}
					}
				});
				ContenedorDeInfo.add(prueba);
				contentPane.validate();
			}
			//---------FIN--------------

	
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.SOUTH;
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 3;
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
				CrearPoliza_ListadoHijos.this.setVisible(false);
				CrearPoliza_ListadoHijos.this.dispose();
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
		
		JButton Boton_Continuar = new JButton("Volver");
		Boton_Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						conHijos.setVisible(true);
					} catch(Exception er) {
						er.printStackTrace();
					}
					CrearPoliza_ListadoHijos.this.setVisible(false);
					CrearPoliza_ListadoHijos.this.dispose();
				

			}
		});
		Boton_Continuar.setBackground(SystemColor.controlHighlight);
		Boton_Continuar.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_Boton_Continuar = new GridBagConstraints();
		gbc_Boton_Continuar.insets = new Insets(10, 0, 10, 40);
		gbc_Boton_Continuar.anchor = GridBagConstraints.EAST;
		gbc_Boton_Continuar.gridx = 3;
		gbc_Boton_Continuar.gridy = 0;
		panel_2.add(Boton_Continuar, gbc_Boton_Continuar);


	}

	public void setHijos(ArrayList<HijosDTO> hijos) {
		this.hijos = hijos;
	}

}