package dto;

public class AdminDTO {

	int Admin_id;
	int Bruger_id;
	
	public AdminDTO(int Admin_id, int Bruger_id)
	{
		this.Admin_id = Admin_id;
		this.Bruger_id = Bruger_id;
	}
	
	public AdminDTO(AdminDTO admin)
	{
		this.Admin_id = admin.getAdminId();
		this.Bruger_id = admin.getBrugerId();
	}
	
	public int getAdminId()
	{
		return Admin_id;
		
	}
	public void setAdminId(int Admin_id)
	{
		this.Admin_id = Admin_id;
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
