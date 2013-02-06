package com.paldaps.bo.dao.hibernate;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paldaps.bo.dao.TempEmployeeDao;
import com.paldaps.bo.entity.emp.TempEmployee;
import com.paldaps.system.core.dao.hibernate.GenericHibernateDAO;

@Repository(value = "tempEmployeeDao")
public class TempEmployeeHibernateDAO extends GenericHibernateDAO<TempEmployee>
		implements TempEmployeeDao {

	 @Autowired
	    public TempEmployeeHibernateDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
		this.clazz=TempEmployee.class;
	    }
	 
	public List<TempEmployee> getAll(Integer pageSize,Integer pageNumber ){
		if(pageNumber==1)
			return this.getCurrentSession().createQuery("from TempEmployee")
					.setMaxResults(pageSize)
					.list();
		else	
		return this.getCurrentSession().createQuery("from TempEmployee")
					.setFirstResult(pageSize * (pageNumber - 1))
					.setMaxResults(pageSize)
					.list();
	 }

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		return ((Long) this.getCurrentSession().createQuery("select count(*) from TempEmployee").uniqueResult()).intValue();
	}
}
