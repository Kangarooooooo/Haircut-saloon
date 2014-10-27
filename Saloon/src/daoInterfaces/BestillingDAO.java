package daoInterfaces;
import dto.BestillingDTO;


import java.util.List;


public interface BestillingDAO {
	
	BestillingDTO getBestilling(int Bestilling_id) throws DALException;
	List <BestillingDTO> getBestillingList() throws DALException;
	void createBestilling(BestillingDTO bruger) throws DALException;
	void updateBestilling(BestillingDTO bruger) throws DALException;
	void deleteBestilling(BestillingDTO bruger) throws DALException;
	

}
