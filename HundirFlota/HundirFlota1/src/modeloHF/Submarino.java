package modeloHF;

public class Submarino {
	
	private static final int cantidad = 2;
	private static final int longitud = 3;
	private static final int costeReparacion = 3000;

	public int getLongitud()
	{return this.longitud;}
	
	public int getCantidad()
	{return this.cantidad;}
	
	public int getCosteReparar()
	{return this.costeReparacion;}
	
	public int restarBarco()
	{
		//decrementa la cantidad de barcos existentes en 1 unidad
		int cant = this.getCantidad();
		
		
		return cant= cant -1;
		
		
	}

}
