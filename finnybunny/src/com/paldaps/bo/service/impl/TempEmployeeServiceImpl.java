package com.paldaps.bo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paldaps.bo.dao.TempEmployeeDao;
import com.paldaps.bo.entity.emp.TempEmployee;
import com.paldaps.bo.service.TempEmployeeService;

@Service(value = "tempEmployeeService")
@Transactional
public class TempEmployeeServiceImpl implements TempEmployeeService {
	
	private TempEmployeeDao tempEmployeeDao;

	@Autowired
	public void setEmployeeDao(TempEmployeeDao tempEmployeeDao) {
		this.tempEmployeeDao = tempEmployeeDao;
	}

	@Override
	public List<TempEmployee> allTempEmployees(Integer pageSize,Integer pageNumber) throws DataAccessException {
		List<TempEmployee> list=tempEmployeeDao.getAll(pageSize, pageNumber);
		return list;
		
	}

	@Override
	public Integer countAllTempEmployees() throws DataAccessException {
		return tempEmployeeDao.countAll();
	}

	
	
	

}
