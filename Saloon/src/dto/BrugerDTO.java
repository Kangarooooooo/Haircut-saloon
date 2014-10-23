package dto;

public class BrugerDTO {
	
	int Bruger_id;
	String Bruger_navn;
	String PW; // password
	String Adresse;
	String Email;
	String Telefon_nr;
	String Koen ;
	int Rolle;

	public BrugerDTO(int Bruger_id, String Bruger_navn, String PW, String Adresse, String Email, String Telefon_nr, String Koen, int Rolle)
	{
		this.Bruger_id = Bruger_id;
		this.Bruger_navn = Bruger_navn;
		this.PW = PW;
		this.Adresse = Adresse;
		this.Email = Email;
		this.Telefon_nr = Telefon_nr;
		this.Koen = Koen;
		this.Rolle = Rolle;
	}
	
	public BrugerDTO(BrugerDTO bruger)
	{
		this.Bruger_id = bruger.getBrugerId();
		this.Bruger_navn = bruger.getBrugerNavn();
		this.PW = bruger.getPW();
		this.Adresse = bruger.getAdresse();
		this.Email = bruger.getEmail();
		this.Telefon_nr = bruger.getTelefonNr();
		this.Koen = bruger.getKoen();
		this.Rolle = bruger.getRolle();
	}
	
	

	public int getBrugerId()
	{
		return Bruger_id;
	}
	
	public void setBrugerId(int Bruger_id)
	{
		this.Bruger_id = Bruger_id;
	}
	
	public String getBrugerNavn()
	{
		return Bruger_navn;
	}
	public void setBrugerNavn(String Bruger_navn)
	{
		this.Bruger_navn = Bruger_navn;
	}
	
	public String getPW()
	{
		return PW;
	}
	public void setPW(String PW)
	{
		this.PW = PW;
	}
	
	public String getAdresse()
	{
		return Adresse;
	}
	public void setAdresse(String Adresse)
	{
		this.Adresse = Adresse;
	}
	
	public String getEmail(){
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getTelefonNr(){
		return Telefon_nr;
	}
	public void setTelefonNr(String Telefon_nr)
	{
		this.Telefon_nr = Telefon_nr;
	}

	public String getKoen(){
		return Koen;
	}
	public void setKoen(String Koen)
	{
		this.Koen = Koen;
	}
	
	public int getRolle()
	{
		return Rolle;
	}
	public void setRolle(int Rolle)
	{
		this.Rolle = Rolle;
	}
	
	
	public String toString(){
		return Bruger_id + "\t" + Bruger_navn + "\t" + PW + "\t" + Adresse + "\t" + Email + "\t" + Telefon_nr + "\t" + Koen;
	}
	
	
}
