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
	
	public HistorieDTO(HistorieDTO historie)
	{
		this.Bestilling_id = historie.getBestillingId();
		this.Starttid = historie.getStarttid();
		this.Frisoer_id = historie.getFrisoerId();
		this.Bruger_id = historie.getBrugerId();
	}
	
	public int getBestillingId()
	{
		return Bestilling_id;
	}
	public void setBestillingId(int Bestilling_id)
	{
		this.Bestilling_id = Bestilling_id;
	}
	
	public String getStarttid()
	{
		return Starttid;
	}
	public void setStarttid(String Starttid)
	{
		this.Starttid = Starttid;
	}
	
	public int getFrisoerId()
	{
		return Frisoer_id;
	}
	public void setFrisoerId(int Frisoer_id)
	{
		this.Frisoer_id = Frisoer_id;
	}

	public int getBrugerId()
	{
		return Bruger_id;
	}
	public void setBrugerId(int Bruger_id)
	{
		this.Bruger_id = Bruger_id;
	}
}
