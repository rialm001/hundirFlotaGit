package modeloHF;

public class HundirFlota {

	private static HundirFlota miHundirFlota; 
	private Humano jugador;
	private PC pc;
	private Turno turno;
		
	public HundirFlota() {
		// TODO Esbozo de constructor generado autom�ticamente
		
	}

	public static HundirFlota getMiHundirFlota()
	{
		if(miHundirFlota==null)
		{
			miHundirFlota = new HundirFlota();
		}
		return miHundirFlota;
	}
	
	public void jugar()
	
	{
		//aqui se inicializara todo
		
		
	}
	
	
}
