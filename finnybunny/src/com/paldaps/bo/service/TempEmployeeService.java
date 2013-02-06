package com.paldaps.bo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.paldaps.bo.entity.emp.TempEmployee;



public interface TempEmployeeService {

	List<TempEmployee> allTempEmployees(Integer pageSize,Integer pageNumber) throws DataAccessException;
	Integer countAllTempEmployees() throws DataAccessException;
}
