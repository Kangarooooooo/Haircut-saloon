package daoInterfaces;
import dto.BrugerDTO;

import java.sql.SQLException;
import java.util.List;


public interface BrugerDAO {

	BrugerDTO getBruger(int Bruger_id) throws DALException;
	List <BrugerDTO> getBrugerList() throws DALException;
	void createBruger(BrugerDTO bruger) throws DALException;
	void updateBruger(BrugerDTO bruger) throws DALException;
	void deleteBruger(BrugerDTO bruger) throws DALException;
	boolean verifyUser(String Username, String Password) throws DALException, SQLException;
	boolean userExists(String Username)throws DALException;
	
}
