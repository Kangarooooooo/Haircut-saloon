package main;

import dao.MySQLBrugerDAO;
import daoInterfaces.DALException;
import dto.BrugerDTO;
import java.sql.SQLException;

import connector.Connector;
public class mainTest {

	public static void main(String[] args) {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); 
		
		}
		System.out.println("Operatoer nummer 1:");
		MySQLBrugerDAO bruger = new MySQLBrugerDAO();
		try { System.out.println(bruger.getBruger(1)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		

	}

}
