package modeloHF;

public class Bomba {
	
	private static final int cant = 10;
	private static final int coste = 200;
	private int unidEnTienda = 20;
	
	
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
