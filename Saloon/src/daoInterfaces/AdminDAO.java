package daoInterfaces;

import dto.AdminDTO;
import java.util.List;

public interface AdminDAO {

	AdminDTO getAdmin(int Admin_id) throws DALException;
	List <AdminDTO> getAdminList(AdminDTO admin) throws DALException;
	
}
