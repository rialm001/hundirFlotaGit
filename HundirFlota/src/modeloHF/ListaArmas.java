package modeloHF;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaArmas {
	
	private ArrayList<Arma> lista;
	
	
	private void ListaArmas()
	{}
	
	
	private Iterator<Arma> getIterator()
	{
		return lista.iterator();
	}
	
	private void addArma(Arma pArma)
	{lista.add(pArma);}
	
	
	
}
