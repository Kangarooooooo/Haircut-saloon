package daoInterfaces;

import dto.ServiceDTO;

import java.util.List;

public interface ServiceDAO {

	ServiceDTO getService(int Service_nr) throws DALException;
	List <ServiceDTO> getServiceList() throws DALException;
	void createService(ServiceDTO service) throws DALException;
	void updateService(ServiceDTO service) throws DALException;
	void deleteService(ServiceDTO service) throws DALException;
	
}
