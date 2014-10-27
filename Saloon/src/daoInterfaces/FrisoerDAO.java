package daoInterfaces;

import java.util.List;
import dto.FrisoerDTO;

public interface FrisoerDAO {
	
	FrisoerDTO getFrisoer(int Frisoer_id) throws DALException;
	List <FrisoerDTO> getFrisoerList(FrisoerDTO frisoer) throws DALException;
	void updateFrisoer(FrisoerDTO frisoer) throws DALException;
	
}
