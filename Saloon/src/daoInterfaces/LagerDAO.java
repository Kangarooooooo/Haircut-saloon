package daoInterfaces;

import java.util.List;
import dto.LagerDTO;

public interface LagerDAO {
	
	LagerDTO getLager(LagerDTO lager) throws DALException;
	List <LagerDTO> getLagerList() throws DALException;
	void createLager(LagerDTO lager) throws DALException;
	void updatelager(LagerDTO lager) throws DALException;
	void deleteLager(LagerDTO lager) throws DALException;

}
