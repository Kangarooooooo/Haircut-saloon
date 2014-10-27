package dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;

import daoInterfaces.DALException;

import dto.ServiceDTO;
import daoInterfaces.ServiceDAO;

public class MySQLServicoDAO implements ServiceDAO 
{

	@Override
	public ServiceDTO getService(int Service_nr) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServiceDTO> getServiceList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createService(ServiceDTO service) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateService(ServiceDTO service) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteService(ServiceDTO service) throws DALException {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
