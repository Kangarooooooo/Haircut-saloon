package dao;

import java.util.ArrayList;
import java.util.List;
import java.io.ObjectInputStream.GetField;
import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;
import daoInterfaces.DALException;
import daoInterfaces.BrugerDAO;
import dto.BrugerDTO;

public class MySQLBrugerDAO implements BrugerDAO 
{

	public BrugerDTO getBruger(int Bruger_id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM Bruger WHERE Bruger_id = " + Bruger_id );
		try 
		{
			if(!rs.first()) throw new DALException("Brugeren " + Bruger_id + " eksisterer ikke");
			return new BrugerDTO (rs.getInt("Bruger_id"), rs.getString("Bruger_navn"), rs.getString("PW"), rs.getString("Adresse"), rs.getString("Email"), rs.getString("Telefon_nr"), rs.getString("Koen"), rs.getInt("Rolle"));
		}
		catch (SQLException e) 
		{
			throw new DALException(e);
		}
	}
	

	@Override
	public List<BrugerDTO> getBrugerList() throws DALException {
		List<BrugerDTO> list = new ArrayList<BrugerDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM Bruger");
		try{
			while(rs.next())
			{
				list.add(new BrugerDTO(rs.getInt("Bruger_id"), rs.getString("Bruger_navn"), rs.getString("PW"), rs.getString("Adresse"), rs.getString("Email"), rs.getString("Telefon_nr"), rs.getString("Koen"), rs.getInt("Rolle")));
			}
		}
		catch(SQLException e)
		{
			throw new DALException(e);
		}
		return list;
		
		
	}

	@Override
	public void createBruger(BrugerDTO bruger) throws DALException {
		
		Connector.doUpdate("INSERT INTO Bruger(Bruger_id, Bruger_navn, PW, Adresse, Email, Telefon_nr, Koen, Rolle) VALUES " +
				"(" + bruger.getBrugerId() + ", '" + bruger.getBrugerNavn() + "', '" + bruger.getPW() + "', '" + bruger.getAdresse() + 
				"', '" + bruger.getEmail() + "', '" + bruger.getTelefonNr() + "', '" + bruger.getKoen() + "', '" + bruger.getRolle() + ")"
				);
		
	}

	@Override
	public void updateBruger(BrugerDTO bruger) throws DALException {
		Connector.doUpdate("UPDATE Bruger SET Bruger_id=+"+bruger.getBrugerId()+", Bruger_navn="+bruger.getBrugerNavn()+","
				+ " PW="+bruger.getPW()+",WHERE Adresse="+bruger.getAdresse()+",Email="+bruger.getEmail()+",Telefon_nr="+bruger.getTelefonNr()+",Koen="
				+bruger.getKoen()+",Rolle="+bruger.getRolle()+"WHERE Bruger_id="+bruger.getBrugerId());
		
	}

	@Override
	public void deleteBruger(BrugerDTO bruger) throws DALException {
		
		
	}


	@Override
	public boolean verifyUser(String Username, String Password) throws DALException{
	ResultSet rs = null;
	try {
		rs = Connector.doQuery("SELECT * FROM Bruger WHERE Bruger_navn = " + Username );
		if(!rs.first()) throw new DALException("Brugeren " + Username + " eksisterer ikke");
		if(rs.getString("PW").equals(Password)){
			return true;
		}
		else{
			return false;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
		throw new DALException(e);
	}
			
	}


	@Override
	public boolean userExists(String Username) throws DALException {
		// TODO Auto-generated method stub
		return false;
	}
	


}
