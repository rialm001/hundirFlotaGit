package modeloHF;

public class Radar {
	
	
	private static final int cant = 1;
	private static final int coste = 500;
	private int unidEnTienda = 3;
	
	
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
