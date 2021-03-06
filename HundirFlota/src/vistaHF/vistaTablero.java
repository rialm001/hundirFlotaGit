package vistaHF;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modeloHF.GestorHF;
import modeloHF.Portaaviones;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("deprecation")
public class vistaTablero extends JFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5388845059595950403L;
	private JPanel contentPane;
	private JPanel panelCENTRO;
	private JPanel panelARRIBA;
	private JPanel panelIZQUIERDA;
	private JLabel lblJUG;
	private JLabel lblPC;
	private JPanel panelPC;
	private JPanel panelJUG;
	private JPanel panelABAJO;
	private JPanel panelFLOTA;
	private JPanel panelINFOJUG;
	private JPanel panelARMAMENTO;
	private int X,Y;
	private ArrayList <JButton > lista = new ArrayList <JButton>() ;
	private Controlador controlador = null;
	private Controlador2 controladorCAS = null;
	private Controlador3 controladorPORTA = null;
	private JPanel panelINFO;
	private JButton btnTIENDA;
	private JLabel FLOTA;
	private JPanel panelBARCOS;
	private JButton PORTAAVIONES;
	private JLabel nPORTA;
	private JLabel SUBMARINO;
	private JLabel nSUB;
	private JLabel DESTRUCTOR;
	private JLabel nDESTR;
	private JLabel FRAGATA;
	private JLabel nFRAG;
	private JLabel DINERO;
	private JLabel nDINERO;


	private void centrarPantalla()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = getSize(); //Tama?o del frame actual (ancho x alto)
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);	
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaTablero frame = new vistaTablero();
					frame.setVisible(true);
					frame.centrarPantalla();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vistaTablero() {
		setTitle("HUNDIR LA FLOTA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelCENTRO(), BorderLayout.CENTER);
		contentPane.add(getPanelARRIBA(), BorderLayout.NORTH);
		contentPane.add(getPanelIZQUIERDA(), BorderLayout.EAST);
		contentPane.add(getPanel_2(), BorderLayout.SOUTH);
		this.crearTablero(panelJUG);
		this.crearTablero(panelPC);
		GestorHF.getGestorHF().addObserver(this);
	}
	private JPanel getPanelCENTRO() {
		if (panelCENTRO == null) {
			panelCENTRO = new JPanel();
			panelCENTRO.setLayout(new GridLayout(1, 0, 0, 0));
			panelCENTRO.add(getPanelJUG());
			panelCENTRO.add(getPanelPC());
		}
		return panelCENTRO;
	}
	private JPanel getPanelARRIBA() {
		if (panelARRIBA == null) {
			panelARRIBA = new JPanel();
			panelARRIBA.setLayout(new GridLayout(1, 0, 0, 0));
			panelARRIBA.add(getLblJUG());
			panelARRIBA.add(getLblPC());
		}
		return panelARRIBA;
	}
	private JPanel getPanelIZQUIERDA() {
		if (panelIZQUIERDA == null) {
			panelIZQUIERDA = new JPanel();
		}
		return panelIZQUIERDA;
	}
	private JLabel getLblJUG() {
		if (lblJUG == null) {
			lblJUG = new JLabel("TABLERO JUGADOR");
			lblJUG.setForeground(Color.BLUE);
			lblJUG.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblJUG.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblJUG;
	}
	private JLabel getLblPC() {
		if (lblPC == null) {
			lblPC = new JLabel("TABLERO CONTRINCANTE");
			lblPC.setForeground(Color.BLUE);
			lblPC.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPC.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblPC;
	}
	private JPanel getPanelPC() {
		if (panelPC == null) {
			panelPC = new JPanel();
		}
		return panelPC;
	}
	private JPanel getPanelJUG() {
		if (panelJUG == null) {
			panelJUG = new JPanel();
		}
		return panelJUG;
	}
	private JPanel getPanel_2() {
		if (panelABAJO == null) {
			panelABAJO = new JPanel();
			panelABAJO.setLayout(new GridLayout(0, 3, 0, 0));
			panelABAJO.add(getPanel_1_1());
			panelABAJO.add(getPanel_2_1());
			panelABAJO.add(getPanel_3());
		}
		return panelABAJO;
	}
	private JPanel getPanel_1_1() {
		if (panelFLOTA == null) {
			panelFLOTA = new JPanel();
			panelFLOTA.setLayout(new GridLayout(0, 1, 0, 0));
			panelFLOTA.add(getLabel_1());
			panelFLOTA.add(getPanel_2_2());
		}
		return panelFLOTA;
	}
	private JPanel getPanel_2_1() {
		if (panelINFOJUG == null) {
			panelINFOJUG = new JPanel();
			panelINFOJUG.setLayout(new GridLayout(0, 1, 0, 0));
			panelINFOJUG.add(getPanelINFO());
			panelINFOJUG.add(getBtnTIENDA());
		}
		return panelINFOJUG;
	}
	private JPanel getPanel_3() {
		if (panelARMAMENTO == null) {
			panelARMAMENTO = new JPanel();
			panelARMAMENTO.setLayout(new GridLayout(0, 2, 0, 0));
		}
		return panelARMAMENTO;
	}
	
	private JPanel getPanelINFO() {
		if (panelINFO == null) {
			panelINFO = new JPanel();
			panelINFO.setLayout(new GridLayout(1, 0, 0, 0));
			panelINFO.add(getDINERO());
			panelINFO.add(getNDINERO());
		}
		return panelINFO;
	}
	private JButton getBtnTIENDA() {
		if (btnTIENDA == null) {
			btnTIENDA = new JButton("TIENDA");
			btnTIENDA.addActionListener(getControladorBTN());
		}
		return btnTIENDA;
	}
	
	private JLabel getLabel_1() 
	{	if (FLOTA == null) {
			FLOTA = new JLabel("FLOTA");
			FLOTA.setFont(new Font("Tahoma", Font.BOLD, 14));
			FLOTA.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return FLOTA;
	}
	private JPanel getPanel_2_2() {
		if (panelBARCOS == null) {
			panelBARCOS = new JPanel();
			panelBARCOS.setLayout(new GridLayout(0, 2, 0, 0));
			panelBARCOS.add(getLabel_2());
			panelBARCOS.add(getLabel_3());
			panelBARCOS.add(getSUBMARINO());
			panelBARCOS.add(getNSUB());
			panelBARCOS.add(getDESTRUCTOR());
			panelBARCOS.add(getNDESTR());
			panelBARCOS.add(getFRAGATA());
			panelBARCOS.add(getNFRAG());
		}
		return panelBARCOS;
	}
	private JButton getLabel_2() {
		if (PORTAAVIONES == null) {
			PORTAAVIONES = new JButton("PORTAAVIONES");
			PORTAAVIONES.setHorizontalAlignment(SwingConstants.LEFT);
			PORTAAVIONES.addActionListener(getControladorPorta());

		}
		return PORTAAVIONES;
	}
	private JLabel getLabel_3() {
		if (nPORTA == null) {
			nPORTA = new JLabel(" " );
			nPORTA.setText(""+Portaaviones.getCantidad());
		}
		return nPORTA;
	}
	private JLabel getSUBMARINO() {
		if (SUBMARINO == null) {
			SUBMARINO = new JLabel("SUBMARINO");
		}
		return SUBMARINO;
	}
	private JLabel getNSUB() {
		if (nSUB == null) {
			nSUB = new JLabel("");
		}
		return nSUB;
	}
	private JLabel getDESTRUCTOR() {
		if (DESTRUCTOR == null) {
			DESTRUCTOR = new JLabel("DESTRUCTOR");
		}
		return DESTRUCTOR;
	}
	private JLabel getNDESTR() {
		if (nDESTR == null) {
			nDESTR = new JLabel("");
		}
		return nDESTR;
	}
	private JLabel getFRAGATA() {
		if (FRAGATA == null) {
			FRAGATA = new JLabel("FRAGATA");
		}
		return FRAGATA;
	}
	private JLabel getNFRAG() {
		if (nFRAG == null) {
			nFRAG = new JLabel("");
		}
		return nFRAG;
	}
	private JLabel getDINERO() {
		if (DINERO == null) {
			DINERO = new JLabel("DINERO DISPONIBLE");
		}
		return DINERO;
	}
	private JLabel getNDINERO() {
		if (nDINERO == null) {
			nDINERO = new JLabel("");
		}
		return nDINERO;
	}

	private JButton cbt3() 
	{ //par?metros de entrada 
		
		JButton btn = new JButton(); //texto del bot?n
		btn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btn.setOpaque(true);
		btn.setBackground(Color.darkGray);
		return btn; 
	}
	
	public void crearTablero(JPanel panel) {
		int i,j;
			
		//cremos el tablero con las casillas(0-24)
		for(i=0; i<10;i++) {
			for(j=0; j<10;j++) {
				//coordenadas
				int  Xx = i; 
				int  Yy = j;				
			
				//creamos el JLabel
				JButton btt = cbt3();
											
				//a?adimos JLabel al array;
				lista.add(btt);
				
				//accion al hacer clic
				 btt.addActionListener(getControladorCAS());
																					
				panel.setLayout(new GridLayout(10, 10, 0, 0));
				panel.add(btt, BorderLayout.CENTER);
			}
		}
}
		//1- CONTROLADOR : instancia	 
	
	private Controlador3 getControladorPorta() {
		if (controladorPORTA == null) {
			controladorPORTA = new Controlador3();
		}
		return controladorPORTA;
	}		
	
			private Controlador2 getControladorCAS() {
				if (controladorCAS == null) {
					controladorCAS = new Controlador2();
				}
				return controladorCAS;
			}
			
			private Controlador getControladorBTN() {
				if (controlador == null) {
					controlador = new Controlador();
				}
				return controlador;
			}
			
			//2- CONTROLADOR : listener
			private class Controlador implements ActionListener {
				//Tras pulsar el botón, abre una nueva pantalla
				public void actionPerformed(ActionEvent e) {
						
					GestorHF.getGestorHF().tienda();
				}
			}
	
			private class Controlador2 implements ActionListener {
				//Tras pulsar el botón, abre una nueva pantalla
				public void actionPerformed(ActionEvent e) {
						
					GestorHF.getGestorHF().tablero();
				}
			}
			
			private class Controlador3 implements ActionListener {
				//Tras pulsar el botón, abre una nueva pantalla
				public void actionPerformed(ActionEvent e) {
						
					GestorHF.getGestorHF().restarBarcoPort();
				}
			}
			
			@Override
			public void update(Observable o, Object arg) {
				// TODO Esbozo de m?todo generado autom?ticamente
				
			}
}