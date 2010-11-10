package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ntierbiz.core.orm.util.HibernateUtil;
import org.ntierbiz.core.user.model.BasicAddress;
import org.ntierbiz.core.user.model.BasicAddressPO;
import org.ntierbiz.core.user.model.BasicProfile;
import org.ntierbiz.core.user.model.BasicProfilePO;



public class UserTestBed {
	public static void main(String[] args) {
		
		
		
		SessionFactory sessions =HibernateUtil.getSessionFactory();
		
		Session session = sessions.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			BasicProfile profile=(BasicProfilePO)session.load(BasicProfilePO.class, new Long(1));
			
//		BasicProfile profile=new BasicProfilePO();
//		BasicCredentials credential=new BasicCredentialsPO();
		BasicAddress address=new BasicAddressPO();
//		
//	
// 		profile.setFirstName("kiran5");
//		profile.setLastName("kumar5");
//		credential.setLogin("kiran5");
//		profile.setBasicCredentials(credential);
//		credential.setBasicProfile(profile);
		address.setCountry("India");
		profile.getBasicAddresses().add(address);
		address.setBasicProfile(profile);
		
	
		session.saveOrUpdate(profile);
		session.saveOrUpdate(address);
	transaction.commit();

	
//		System.out.println(profile);
//		
		}catch(Exception e){
			System.out.println(e.toString());
			transaction.rollback();
		}
		finally {
			session.close();
		}
		
	}

}
