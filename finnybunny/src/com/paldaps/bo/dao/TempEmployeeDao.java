package com.paldaps.bo.dao;

import java.util.List;

import com.paldaps.bo.entity.emp.TempEmployee;
import com.paldaps.system.core.dao.IGenericDAO;

public interface TempEmployeeDao extends IGenericDAO<TempEmployee> {
	List<TempEmployee> getAll(Integer pageSize,Integer pageNumber );
	Integer countAll();

}
