package dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;

import daoInterfaces.DALException;
import daoInterfaces.HistorieDAO;
import dto.HistorieDTO;

public class MySQLHistorieDAO implements HistorieDAO{

	@Override
	public HistorieDTO getHistorie(int Bestilling_id, int Frisoer_id,
			int Bruger_id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistorieDTO> HistorieList(HistorieDTO historie)
			throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHistorie(HistorieDTO historie) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
