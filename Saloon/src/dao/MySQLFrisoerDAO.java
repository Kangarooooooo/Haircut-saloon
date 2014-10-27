package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;
import daoInterfaces.DALException;
import daoInterfaces.FrisoerDAO;
import dto.BrugerDTO;
import dto.FrisoerDTO;

public class MySQLFrisoerDAO implements FrisoerDAO {

	@Override
	public FrisoerDTO getFrisoer(int Frisoer_id) throws DALException {
		
			ResultSet rs = Connector.doQuery("SELECT * FROM Frisoer WHERE Frisoer_id = " + Frisoer_id );
			try 
			{
				if(!rs.first()) throw new DALException("Frisøren " + Frisoer_id + " eksisterer ikke");
				return new FrisoerDTO (rs.getInt("Bruger_id"), rs.getInt("Frisoer_id"), rs.getString("CPR"), rs.getDouble("Loen"));
			}
			catch (SQLException e) 
			{
				throw new DALException(e);
			}
			
	}

	@Override
	public List<FrisoerDTO> getFrisoerList(FrisoerDTO frisoer)
			throws DALException {
		List<FrisoerDTO> list = new ArrayList<FrisoerDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Frisoer");
		try{
			while(rs.next())
			{
				list.add(new FrisoerDTO(rs.getInt("Bruger_id"), rs.getInt("Frisoer_id"), rs.getString("CPR"), rs.getDouble("Loen")));
			}
		}
		catch(SQLException e)
		{
			throw new DALException(e);
		}
		return list;
		
	}

	@Override
	public void updateFrisoer(FrisoerDTO frisoer) throws DALException {

		
		}

}
