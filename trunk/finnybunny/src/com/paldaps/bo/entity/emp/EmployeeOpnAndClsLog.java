package com.paldaps.bo.entity.emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.paldaps.system.core.domain.AbstractTimestampEntity;
import com.paldaps.system.core.domain.DomainObject;

@Entity
@Table(name = "empopn_cls_log")
public class EmployeeOpnAndClsLog extends AbstractTimestampEntity implements DomainObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Integer id;	
	protected String year;
	protected String opening;
	protected String closing;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOpening() {
		return opening;
	}
	public void setOpening(String opening) {
		this.opening = opening;
	}
	public String getClosing() {
		return closing;
	}
	public void setClosing(String closing) {
		this.closing = closing;
	}

}
