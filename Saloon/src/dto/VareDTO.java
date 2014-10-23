package dto;

public class VareDTO {
	
	int Vare_id;
	String Vare_navn;
	double Varepris;
	int Antal;
	
	public VareDTO(int Vare_id, String Vare_navn, double Varepris, int Antal)
	{
		this.Vare_id = Vare_id;
		this.Vare_navn = Vare_navn;
		this.Varepris = Varepris;
		this.Antal = Antal;
	}
	
	public VareDTO(VareDTO vare)
	{
		
	}
	
	public int getVareId()
	{
		return Vare_id;
	}
	
	public void setVareId(int Vare_id)
	{
		this.Vare_id = Vare_id;
	}
	
	public String getVareNavn()
	{
		return Vare_navn;
	}
	public void setVareNavn(String Vare_navn)
	{
		this.Vare_navn = Vare_navn;
	}
	
	public double getPris

}
