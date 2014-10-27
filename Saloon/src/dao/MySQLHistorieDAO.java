package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;
import daoInterfaces.DALException;
import daoInterfaces.HistorieDAO;
import dto.BrugerDTO;
import dto.HistorieDTO;

public class MySQLHistorieDAO implements HistorieDAO{

	@Override
	public HistorieDTO getHistorie(int Bestilling_id, int Frisoer_id,
			int Bruger_id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Historie WHERE Bestilling_id = " + Bestilling_id + " AND Frisoer_id = "
			+	Frisoer_id + " AND Bruger_id = " + Bruger_id);
		try 
		{
			if(!rs.first()) throw new DALException("Historien eksisterer ikke");
			return new HistorieDTO (rs.getInt("Bestilling_id"), rs.getString("Starttid"), rs.getInt("Frisoer_id"),  rs.getInt("Bruger_id"));
		}
		catch (SQLException e) 
		{
			throw new DALException(e);
		}
	}

	@Override
	public List<HistorieDTO> HistorieList(HistorieDTO historie)
			throws DALException {
		List<HistorieDTO> list = new ArrayList<HistorieDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Historie");
		try{
			while(rs.next())
			{
				list.add(new HistorieDTO(rs.getInt("Bestilling_id"), rs.getString("Starttid"), rs.getInt("Frisoer_id"),  rs.getInt("Bruger_id")));
			}
		}
		catch(SQLException e)
		{
			throw new DALException(e);
		}
		return list;
		
		
	}

	@Override
	public void deleteHistorie(HistorieDTO historie) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
