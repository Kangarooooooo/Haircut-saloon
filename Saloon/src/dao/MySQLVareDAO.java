package dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;
import daoInterfaces.DALException;
import daoInterfaces.VareDAO;
import dto.BrugerDTO;
import dto.VareDTO;

public class MySQLVareDAO implements VareDAO {

	@Override
	public VareDTO getVare(int Vare_id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Vare WHERE Bruger_id = " + Vare_id );
		try 
		{
			if(!rs.first()) throw new DALException("Vare " + Vare_id + " eksisterer ikke");
			return new VareDTO (rs.getInt("Vare_id"), rs.getString("Vare_navn"), rs.getDouble("Varepris"), rs.getInt("VareAntal"));
		}
		catch (SQLException e) 
		{
			throw new DALException(e);
		}
	}
	@Override
	public List<VareDTO> getVareList(VareDTO vare) throws DALException {
		List<VareDTO> list = new ArrayList<VareDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Vare");
		try{
			while(rs.next())
			{
				list.add(new VareDTO(rs.getInt("Vare_id"), rs.getString("Vare_navn"), rs.getDouble("Varepris"), rs.getInt("VareAntal")));
			}
		}
		catch(SQLException e)
		{
			throw new DALException(e);
		}
		return list;
		
		
	}

	@Override
	public void createVare(VareDTO vare) throws DALException {
		Connector.doUpdate("INSERT INTO Vare(Vare_id, Vare_navn, Varepris, VareAntal) VALUES (" + vare.getVareId() +
				", " + vare.getVareNavn() + ", " + vare.getVarepris() + ", " + vare.getAntal() + ")" 
				);
		
	}

	@Override
	public void updateVare(VareDTO vare) throws DALException {
		
		
	}

	@Override
	public void deleteVare(VareDTO vare) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
