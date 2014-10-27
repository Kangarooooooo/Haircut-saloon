package dto;

public class BestillingDTO {
	
	int Bestilling_id;
	double Bestilling_Pris;
	int Frisoer_id;
	int Bruger_id;
	int Service_id;
	int Vare_id;
	int Vare_Antal;
	
	public BestillingDTO(int Bestilling_id, double Bestilling_Pris, int Frisoer_id, int Bruger_id, int Service_id, int Vare_id, int Vare_Antal)
	{
		this.Bestilling_id = Bestilling_id;
		this.Bestilling_Pris = Bestilling_Pris;
		this.Frisoer_id = Frisoer_id;
		this.Bruger_id = Bruger_id;
		this.Service_id = Service_id;
		this.Vare_id = Vare_id;
		this.Vare_Antal = Vare_Antal;
	}
	
	public BestillingDTO(BestillingDTO bestilling)
	{
		this.Bestilling_id = bestilling.getBestillingId();
		this.Bestilling_Pris = bestilling.getBestillingPris();
		this.Frisoer_id = bestilling.getFrisoerId();
		this.Bruger_id = bestilling.getBrugerId();
		this.Service_id = bestilling.getServieId();
		this.Vare_id = bestilling.getVareId();
		this.Vare_Antal = bestilling.getVareAntal();
	
	}

	public int getBestillingId()
	{
		return Bestilling_id;
	}
	public void setBestillingId(int Bestilling_id)
	{
		this.Bestilling_id = Bestilling_id;
	}
	
	public double getBestillingPris()
	{
		return Bestilling_Pris;
	}
	public void setBestillingPris(double Bestilling_Pris)
	{
		this.Bestilling_Pris = Bestilling_Pris;
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
	
	public int getServieId()
	{
		return Service_id;
	}
	public void setServiceId(int Service_id)
	{
		this.Service_id = Service_id;
	}
	
	public int getVareId()
	{
		return Vare_id;
	}
	public void setVareId(int Vare_id)
	{
		this.Vare_id = Vare_id;
	}
	
	public int getVareAntal()
	{
		return Vare_Antal;
	}
	public void setVareAntal(int Vare_Antal)
	{
		this.Vare_Antal = Vare_Antal;
	}
}
