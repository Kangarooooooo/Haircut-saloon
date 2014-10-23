package dto;

public class FrisoerDTO {
	
	int Bruger_id;
	int Frisoer_id;
	String CPR;
	double Loen;
	
	public FrisoerDTO(int Bruger_id, int Frisoer_id, String CPR, double Loen)
	{
		this.Bruger_id = Bruger_id;
		this.Frisoer_id = Frisoer_id;
		this.CPR = CPR;
		this.Loen = Loen;
	}
	
	public FrisoerDTO(FrisoerDTO frisoer)
	{
		this.Bruger_id = frisoer.getBrugerId();
		this.Frisoer_id = frisoer.getFrisoerId();
		this.CPR = frisoer.getCPR();
		this.Loen = frisoer.getLoen();
	}
	
	public int getBrugerId()
	{
		return Bruger_id;
	}
	public void setBrugerId(int Bruger_id)
	{
		this.Bruger_id = Bruger_id;
	}
	
	public int getFrisoerId()
	{
		return Frisoer_id;
	}
	public void setFrisoerId(int Frisoer_id)
	{
		this.Frisoer_id = Frisoer_id;
	}
	
	public String getCPR()
	{
		return CPR;
	}
	public void setCPR(String CPR)
	{
		this.CPR = CPR;
	}
	
	public double getLoen()
	{
		return Loen;
	}
	public void setLoen(double Loen)
	{
		this.Loen = Loen;
	}
}
