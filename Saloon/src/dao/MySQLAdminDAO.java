package dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;

import connector.Connector;

import daoInterfaces.DALException;
import daoInterfaces.AdminDAO;
import dto.AdminDTO;

public class MySQLAdminDAO implements AdminDAO {

	@Override
	public AdminDTO getAdmin(int Admin_id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> getAdminList(AdminDTO admin) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

}
