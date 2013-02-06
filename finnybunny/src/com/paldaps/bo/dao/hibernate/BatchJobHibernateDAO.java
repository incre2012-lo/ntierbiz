package com.paldaps.bo.dao.hibernate;

import org.hibernate.CacheMode;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paldaps.action.job.PublishUtil;
import com.paldaps.bo.entity.emp.Employee;
import com.paldaps.bo.entity.emp.TempEmployee;


@Repository(value = "batchJobHibernateDAO")
public class BatchJobHibernateDAO {
	
	 protected SessionFactory sessionFactory;
	
	@Autowired
	 public BatchJobHibernateDAO(SessionFactory sessionFactory) {
			this.sessionFactory=sessionFactory;
	 }
	

	
	
	
	public void publishEmployeeRecords(String label){
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		ScrollableResults customers = session.createQuery(" from TempEmployee")
			    .setCacheMode(CacheMode.IGNORE)
			    .scroll(ScrollMode.FORWARD_ONLY);
		int count=0;		
		while ( customers.next() ) {
			TempEmployee tempEmployee = (TempEmployee) customers.get(0);
				tempEmployee.setLabel(label);
				Employee employee=(Employee) session.get(Employee.class,tempEmployee.getPer_no());
				if(employee==null)
					employee=PublishUtil.create(tempEmployee);				
					PublishUtil.update(employee,tempEmployee);
				session.saveOrUpdate(employee);
				if ( ++count % 20 == 0 ) {
					//flush a batch of updates and release memory:		    	
					session.flush();
					session.clear();
				}
		}
		tx.commit();
		session.close();
	}
}

