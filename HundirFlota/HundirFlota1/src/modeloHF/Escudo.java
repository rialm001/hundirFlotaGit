package modeloHF;

public class Escudo {

	private static final int cant = 2;
	private static final int coste = 1000;
	private int unidEnTienda = 2;
	
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
