package com.estratg.core.user.mgr;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.estratg.core.orm.dao.DAOFactory;
import com.estratg.core.user.dao.BasicAddressDAO;
import com.estratg.core.user.dao.BasicProfileDAO;
import com.estratg.core.user.model.BasicAddress;
import com.estratg.core.user.model.BasicAddressPO;
import com.estratg.core.user.model.BasicCredentials;
import com.estratg.core.user.model.BasicProfile;
import com.estratg.core.user.model.BasicProfilePO;

public class UserMgrImpl implements UserMgr {


	private DAOFactory factory;
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public UserMgrImpl() {
		factory = DAOFactory.instance(DAOFactory.HIBERNATE);
	
	}

	
	
	/* (non-Javadoc)
	 * @see com.estratg.core.user.mgr.UserMgr#createUser(com.estratg.core.user.BasicProfile, com.estratg.core.user.BasicCredentials, com.estratg.core.user.BasicAddress)
	 */
	@Override
	public boolean createUser(BasicProfile profile,
			BasicCredentials credentials, BasicAddress address) {
		
		try {
			BasicProfileDAO basicProfileDAO = factory.getBasicProfileDAO();
			basicProfileDAO.setSession(sessionFactory.getCurrentSession());
			BasicAddressDAO basicAddressDAO = factory.getBasicAddressDAO();
			basicAddressDAO.setSession(sessionFactory.getCurrentSession());
			profile.setBasicCredentials(credentials);
			credentials.setBasicProfile(profile);
			profile.getBasicAddresses().add(address);
			address.setBasicProfile(profile);
			basicProfileDAO.makePersistent((BasicProfilePO) profile);
			basicAddressDAO.makePersistent((BasicAddressPO) address);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {

		}
	}
	
	public List<BasicProfilePO> getAllProfiles(){

		List<BasicProfilePO> profiles=new ArrayList<BasicProfilePO>(); 
		try {
			BasicProfileDAO basicProfileDAO = factory.getBasicProfileDAO();
			basicProfileDAO.setSession(sessionFactory.getCurrentSession());					
			profiles=basicProfileDAO.findAll();
		} catch (Exception e) {
			e.printStackTrace();		
		} finally {

		}
		return profiles;
	}
}
