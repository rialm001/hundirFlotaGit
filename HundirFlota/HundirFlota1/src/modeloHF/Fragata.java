package modeloHF;

public class Fragata {
	
	
	private static final int cantidad = 4;
	private static final int longitud = 1;
	private static final int costeReparacion = 1000;
	
	
	public int getLongitud()
	{return this.longitud;}
	
	public static int getCantidad()
	{return cantidad;}
	
	public int getCosteReparar()
	{return this.costeReparacion;}
	

	public int restarBarco()
	{
		//decrementa la cantidad de barcos existentes en 1 unidad
		int cant = this.getCantidad();
		
		
		return cant= cant -1;
		
		
	}
}
