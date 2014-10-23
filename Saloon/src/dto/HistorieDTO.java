package dto;

public class HistorieDTO {
	
	int Bestilling_id;
	String Starttid;
	int Frisoer_id;
	int Bruger_id;
	
	public HistorieDTO(int Bestilling_id, String Starttid, int Frisoer_id, int Bruger_id)
	{
		this.Bestilling_id = Bestilling_id;
		this.Starttid = Starttid;
		this.Frisoer_id = Frisoer_id;
		this.Bruger_id = Bruger_id;
	}
	
	public HistorieDTO()
	{
	
	}

}
