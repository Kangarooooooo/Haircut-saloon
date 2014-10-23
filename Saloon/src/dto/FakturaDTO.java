package dto;

public class FakturaDTO {
	
	int Faktura_nr;
	int Service_nr;
	int Bruger_id;
	double Maengde;
	
	public FakturaDTO(int Faktura_nr, int Service_nr, int Bruger_id, double Maengde)
	{
		this.Faktura_nr = Faktura_nr;
		this.Service_nr = Service_nr;
		this.Bruger_id = Bruger_id;
		this.Maengde = Maengde;
	}
	
	public FakturaDTO(FakturaDTO faktura)
	{
		this.Faktura_nr = faktura.getFakturaNr();
		this.Service_nr = faktura.getServiceNr();
		this.Bruger_id = faktura.getBrugerId();
		this.Maengde = faktura.getMaengde();
	}
	
	public int getFakturaNr()
	{
		return Faktura_nr;
	}
	public void setFakturaNr(int Faktura_nr)
	{
		this.Faktura_nr = Faktura_nr;
	}
	
	public int getServiceNr()
	{
		return Faktura_nr;
	}
	public void setServiceNr(int Service_nr)
	{
		this.Service_nr = Service_nr;
	}
	
	public int getBrugerId()
	{
		return Bruger_id;
	}
	public void setBrugerId(int Bruger_id)
	{
		this.Bruger_id = Bruger_id;
	}
	
	public double getMaengde()
	{
		return Maengde;
	}
	public void setMaengde(double Maengde)
	{
		this.Maengde = Maengde;
	}
	

}
