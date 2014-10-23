package daoInterfaces;
import dto.BestillingDTO;


import java.util.List;


public class BestillingDAO {
	
	BestillingDTO getBestilling(int Bestilling_id) throws DALException;
	List <BestillingDTO> getBestillingList() throws DALException;
	void createBestilling(BrugerDTO bruger) throws DALException;
	void updateBestilling(BestillingDTO bruger) throws DALException;
	void deleteBestilling(BestillingDTO bruger) throws DALException;
	

}
