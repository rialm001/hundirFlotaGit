package modeloHF;

import java.util.ArrayList;
import java.util.Iterator;

public class Tablero {

	private ArrayList<Casilla> lista;
	private ListaBarcos barcos;
		
	
	public Tablero() {
		// TODO Esbozo de constructor generado autom�ticamente
	}

	
	private Iterator<Casilla> getIterator()
	{ return  lista.iterator();}
	
	private Casilla getCasilla(int pInd)
	{
		return lista.get(pInd);}
	
	private void cambiarEstadoCasilla(Casilla pCas)
	{
		//hay que mirar que tipo de barco es, y si el estado del resto de sus casillas
		//if() 
		{pCas.setEstado(null);}
		
		
		pCas.setEstado(null);
	}
	
	
	private void atacar()
	{}
	
	private void addBarco(int pPos, Barco pBarco)
	
	{}
	
	
	
}
