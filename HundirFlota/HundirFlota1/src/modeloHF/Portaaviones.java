package modeloHF;

public class Portaaviones {
	
	
	private static final int cantidad = 1;
	private static final int longitud = 4;
	private static final int costeReparacion = 4000;
	
	private void Portaaviones()
	{}
	
	public int getLongitud()
	{return this.longitud;}
	
	public static int getCantidad()
	{return cantidad;}
	
	public int getCosteReparar()
	{return this.costeReparacion;}
	
	
	public static int restarBarco()
	{
		//decrementa la cantidad de barcos existentes en 1 unidad
		int cant = cantidad;
		
		
		return cant= cant -1;
		
		
	}
	

}
