package ppalHF;

import modeloHF.GestorHF;
import vistaHF.vistaPrincipal;
import vistaHF.vistaTablero;
import vistaHF.vistaTienda;
	

	public class principalHF {
		public static void main(String[] args) {
			
			//MODELO//
		
			GestorHF.getGestorHF();
			
			//VISTA//
			@SuppressWarnings("unused")
			vistaPrincipal ppal = new vistaPrincipal();
			@SuppressWarnings("unused")
			vistaTablero tablero = new vistaTablero();
			@SuppressWarnings("unused")
			vistaTienda tienda = new vistaTienda();
		
		}
	}

