package modeloHF;

public class Arma {

	private int coste;
	private int cant;
	private int unidEnTienda;
	
	
	
	private Arma()
	{}
	
	public int getCoste()
	{return this.coste;}
	
	public int getCantidad()
	{return this.cant;}
	
	public int getUnidEnTienda()
	{return this.unidEnTienda;}
	
	public void restarArma()
	//resta las unidades compradas del stock inicial de la tienda
	
	{unidEnTienda = unidEnTienda - 1;}
	
	
}
