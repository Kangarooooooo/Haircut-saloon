package dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;

import daoInterfaces.DALException;
import daoInterfaces.BestillingDAO;
import dto.BestillingDTO;
public class MySQLBestillingDAO implements BestillingDAO {

	@Override
	public BestillingDTO getBestilling(int Bestilling_id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BestillingDTO> getBestillingList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBestilling(BestillingDTO bruger) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBestilling(BestillingDTO bruger) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBestilling(BestillingDTO bruger) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
