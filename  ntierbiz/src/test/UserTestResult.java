package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.estratg.core.orm.util.HibernateUtil;
import com.estratg.core.user.mgr.UserMgr;
import com.estratg.core.user.mgr.UserMgrImpl;
import com.estratg.core.user.model.BasicAddress;
import com.estratg.core.user.model.BasicProfilePO;


public class UserTestResult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		SessionFactory sessions =HibernateUtil.getSessionFactory();
		
		Session session = sessions.openSession();
		List<BasicProfilePO> profiles;
		
		try {

			UserMgr userMgr=new UserMgrImpl();
			profiles=userMgr.getAllProfiles();
//			BasicProfile profile=(BasicProfilePO)session.load(BasicProfilePO.class, new Long(1));
//	
//		System.out.println(profile.getBasicCredentials().getLogin());
//		
	for(BasicProfilePO profile:profiles){
		System.out.println(profile.getCompanyName()+"||"+profile.getId());
		for(BasicAddress address:profile.getBasicAddresses()){
			System.out.println(address.getCountry());
		}
	}
//		
//		System.out.println();
		
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		finally {
			session.close();
		}
		
	

	}

}
