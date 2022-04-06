package modeloHF;

public class Destructor {
	
	private static final int cantidad = 3;
	private static final int longitud = 2;
	private static final int costeReparacion = 2000;
	
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
