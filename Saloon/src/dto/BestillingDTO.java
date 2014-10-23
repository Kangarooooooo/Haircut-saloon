package dto;

public class BestillingDTO {
	
	int Bestilling_id;
	int Frisoer_id;
	int Bruger_id;
	
	public BestillingDTO(int Bestilling_id, int Frisoer_id, int Bruger_id)
	{
		this.Bestilling_id = Bestilling_id;
		this.Frisoer_id = Frisoer_id;
		this.Bruger_id = Bruger_id;
	}
	
	public BestillingDTO(BestillingDTO bestilling)
	{
		this.Bestilling_id = bestilling.getBestillingId();
		this.Frisoer_id = bestilling.getFrisoerId();
		this.Bruger_id = bestilling.getBrugerId();
	
	}

	public int getBestillingId()
	{
		return Bestilling_id;
	}
	public void setBestillingId(int Bestilling_id)
	{
		this.Bestilling_id = Bestilling_id;
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
