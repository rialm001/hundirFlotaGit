package modeloHF;

import java.util.Observable;

import vistaHF.vistaTablero;
import vistaHF.vistaTienda;

@SuppressWarnings("deprecation")
public class GestorHF  extends Observable{
		
		private static GestorHF mGestorHF = new GestorHF();
		
		
		private GestorHF ()
		{
		
			//Mostrar información del modelo
						
		}
		
		public static GestorHF getGestorHF() {
			return mGestorHF;
		}
		
		public void actualizarNBarcos()
		{
			
			
			setChanged();
			notifyObservers();
		}
		
		public void tablero()
		{
			vistaTablero tablero = new vistaTablero();
			tablero.setVisible(true);
			setChanged();
			notifyObservers();
		}

		public void tienda()
		{
			vistaTienda tienda = new vistaTienda();
			tienda.setVisible(true);
			setChanged();
			notifyObservers();
		}
		
		public void restarBarcoPort()
		{
		
			Portaaviones.restarBarco();
			
			System.out.println(" " + Portaaviones.restarBarco());
			setChanged();
			notifyObservers();
		}

	}	
