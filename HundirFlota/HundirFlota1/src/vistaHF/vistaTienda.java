package vistaHF;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class vistaTienda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -642308261010466668L;

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
					vistaTienda frame = new vistaTienda();
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
	public vistaTienda() {
		setBounds(100, 100, 1000, 700);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
