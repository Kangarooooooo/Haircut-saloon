package daoInterfaces;

import java.util.List;
import dto.VareDTO;

public interface VareDAO {

	VareDTO getVare(int Vare_id) throws DALException;
	List <VareDTO> getVareList(VareDTO vare) throws DALException;
	void createVare(VareDTO vare) throws DALException;
	void updateVare(VareDTO vare) throws DALException;
	void deleteVare(VareDTO vare) throws DALException;
}
