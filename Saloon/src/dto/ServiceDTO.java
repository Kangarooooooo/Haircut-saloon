package dto;

public class ServiceDTO {
	
	int Service_nr;
	String Service_navn;
	double Pris;
	double Tid;
	
	public ServiceDTO(int Service_nr, String Service_navn, double Pris, double Tid)
	{
		this.Service_nr = Service_nr;
		this.Service_navn = Service_navn;
		this.Pris = Pris;
		this.Tid = Tid;
	}
	public ServiceDTO(ServiceDTO service)
	{
		this.Service_nr = service.getServiceNr();
		this.Service_navn = service.getServiceNavn();
		this.Pris = service.getPris();
		this.Tid = service.getTid();
	}
	
	public int getServiceNr()
	{
		return Service_nr;
	}
	public void setServiceNr(int Service_nr)
	{
		this.Service_nr = Service_nr;
	}
	
	public String getServiceNavn()
	{
		return Service_navn;
	}
	public void setServiceNavn(String Service_navn)
	{
		this.Service_navn = Service_navn;
	}
	
	public double getPris()
	{
		return Pris;
	}
	public void setPris(double Pris)
	{
		this.Pris = Pris;
	}
	
	public double getTid()
	{
		return Tid;
	}
	public void setTid(double Tid)
	{
		this.Tid = Tid;
	}
	
	public String toString()
	{
		return Service_nr  + "\t"  + Service_navn + "\t" + Pris + "\t" + Tid ;
	}

}
