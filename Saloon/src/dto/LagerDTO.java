package dto;

public class LagerDTO {
	
	int Vare_id;
	int Frisoer_id;
	int Antal;
	
	public LagerDTO(int Vare_id, int Frisoer_id, int Antal)
	{
		this.Vare_id = Vare_id;
		this.Frisoer_id = Frisoer_id;
		this.Antal = Antal;
	}
	
	public LagerDTO(LagerDTO lager)
	{
		this.Vare_id = lager.getVareId();
		this.Frisoer_id = lager.getFrisoerId();
		this.Antal = lager.getAntal();
	}

	public int getVareId()
	{
		return Vare_id;
	}
	public void setVareId(int Antal)
	{
		this.Antal = Antal;
	}
	
	public int getFrisoerId()
	{
		return Frisoer_id;
	}
	public void setFrisoerId(int Frisoer_id)
	{
		this.Frisoer_id = Frisoer_id;
	}
	
	public int getAntal()
	{
		return Antal;
	}
	public void setAntal(int Antal)
	{
		this.Antal = Antal;
	}
}
