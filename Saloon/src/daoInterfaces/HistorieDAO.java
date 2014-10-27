package daoInterfaces;

import java.util.List;
import dto.HistorieDTO;

public interface HistorieDAO {

	HistorieDTO getHistorie(int Bestilling_id, int Frisoer_id, int Bruger_id) throws DALException;
	List <HistorieDTO>HistorieList(HistorieDTO historie) throws DALException;
	void deleteHistorie(HistorieDTO historie) throws DALException;
	
}
