package modeloHF;

public class Casilla {
	
	
	private int posicion;
	private TipoEstado estado;
	
	private void Casilla()
	{}
	
	public int getPosicion()
	{return this.posicion;}
	
	public TipoEstado getEstado()
	{return this.estado;}
	
	public void setEstado(TipoEstado pEstado)
	{
		estado = pEstado;
		
	}
	
	public boolean ocupada(Casilla pCas)
	{
		//nos dice si la casilla tiene barco o no
		
		if (!pCas.getEstado().equals(estado.AGUA))
		
		{return true;}
		else return false;
		
	}
	
	public boolean estaAtacada(Casilla pCasilla)

	{
		//nos sirve para saber si una casilla esta tocada a la hora de ir a hundir el barco
		
		if(pCasilla.getEstado().equals(estado.TOCADO) || pCasilla.getEstado().equals(estado.HUNDIDO))
		{return true;}
		else return false;
		
	}
	
	
	public void atacar(int pPos)
	{}
	
	
}
