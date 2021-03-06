package vistaHF;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modeloHF.GestorHF;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class vistaPrincipal extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = -817856513046636577L;
	private JPanel contentPane;
	private JPanel panelReglas;
	private JButton btnJUGAR;
	private JTextPane REGLAS;
	private JLabel lblREGLAS;
	private Controlador controlador = null;


	public void centrarPantalla()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = getSize(); //Tamaño del frame actual (ancho x alto)
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
					vistaPrincipal frame = new vistaPrincipal();
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
	public vistaPrincipal() {
		setTitle("\u00A1 BIENVENIDO A HUNDIR LA FLOTA !");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelReglas(), BorderLayout.CENTER);
		contentPane.add(getLblREGLAS(), BorderLayout.NORTH);
		contentPane.add(getBtnJUGAR(), BorderLayout.SOUTH);
		
		GestorHF.getGestorHF().addObserver(this);
	}

	private JPanel getPanelReglas() {
		if (panelReglas == null) {
			panelReglas = new JPanel();
			panelReglas.add(getREGLAS());
		}
		return panelReglas;
	}
	private JButton getBtnJUGAR() {
		if (btnJUGAR == null) {
			btnJUGAR = new JButton("\u00A1 A JUGAR !");
			btnJUGAR.addActionListener(getControlador());
		}
		return btnJUGAR;
	}

	private JTextPane getREGLAS() {
		if (REGLAS == null) {
			REGLAS = new JTextPane();
			REGLAS.setBackground(UIManager.getColor("Button.background"));
			REGLAS.setFont(new Font("Tahoma", Font.PLAIN, 12));
			REGLAS.setText(" \r\n "
					+ "1. El juego consiste en hundir la flota del contrincante. Para ello, debe colocar su propia"
					+ "flota de forma estratégica y encontrar y hundir con los disparos la flota contraria.\r\n \r\n"
					+ "2. Cada uno de los jugadores dispone de dos cuadrículas que ocultará al otro jugador: en"
					+ "una debe colocar sus barcos y en la otra irá anotando los resultados de los disparos que\r\n"
					+ "realiza en cada turno. En la página siguiente dispone de plantillas de las cuadrículas.\r\n  \r\n"
					+ "3. Cada jugador debe colocar en uno de los cuadros los siguientes barcos en posición"
					+ "horizontal o vertical:\r\n"
					+ "	· 1 Portaaviones que ocupa 4 cuadrados.\r\n"
					+ "	· 2 Submarinos de 3 cuadros\r\n"
					+ "	· 3 Destructores de 2 cuadros\r\n"
					+ "	· 4 Fragatas de 1 cuadro\r\n  \r\n"
					+ "4. Los barcos se tienen que colocar respetando una franja de cuadros en blanco alrededor."
					+ "Sí pueden colocarse junto a los bordes de la cuadrícula,\r\n pero sin llegar a pegarse un"
					+ "barco con otro.\r\n  \r\n"
					+"5. Cada jugador dispone de un turno de disparo que se irá alternando. Para hacerlo dirá las"
					+ "coordenadas. Al disparar, el otro jugador comprobará el resultado en su tablero:\r\n "
					+ " · Si la casilla está en blanco, responderá “agua”.\r\n"
					+ " · Si en la casilla se encuentra parte de un barco responderá “tocado”. En ese caso"
					+ " El jugador tiene derecho a un nuevo disparo en el mismo turno.\r\n"
					+ " · Si en la casilla se encuentra un barco de un cuadro o la última parte de un barco "
					+ "ya tocado, responderá “hundido” y también tiene derecho a un nuevo disparo.\r\n \r\n"
					+ "6. El jugador que dispara anota en su cuadro de disparos los resultados. Si los tiros son "
					+ "“agua”, marcará con un punto la cuadrícula; si los disparos son \r\n  “tocado” o “hundido”, los"
					+ "puede marcar con una cruz. De esta forma el jugador puede saber las cuadrículas que "
					+ "quedan en blanco y en las que ya ha disparado.\r\n \r\n"
					+ "7. Finalmente, gana el jugador que antes consigue hundir la flota del otro.                                          "
				);
		}
		return REGLAS;
	}
	private JLabel getLblREGLAS() {
		if (lblREGLAS == null) {
			lblREGLAS = new JLabel("REGLAS DEL JUEGO");
			lblREGLAS.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return lblREGLAS;
	}
	
	
		//1- CONTROLADOR : instancia	
		private Controlador getControlador() {
			if (controlador == null) {
				controlador = new Controlador();
			}
			return controlador;
		}
		//2- CONTROLADOR : listener
		private class Controlador implements ActionListener {
			//Tras pulsar el botÃ³n, abre una nueva pantalla
			public void actionPerformed(ActionEvent e) {
					
				GestorHF.getGestorHF().tablero();
			}
		}
		@Override
		public void update(Observable o, Object arg) {
			// TODO Esbozo de método generado automáticamente
			
		}

}
