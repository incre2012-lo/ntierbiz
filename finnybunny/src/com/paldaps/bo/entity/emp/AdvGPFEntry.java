package com.paldaps.bo.entity.emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.paldaps.system.core.domain.AbstractTimestampEntity;
import com.paldaps.system.core.domain.DomainObject;
@Entity
@Table(name = "advgpfentry")
public class AdvGPFEntry extends AbstractTimestampEntity implements DomainObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Integer id;
	protected String yr_mth;
	protected String advance;
	protected String remark;
	protected String authorId;
	protected String label;
	
	
	
	public String getYr_mth() {
		return yr_mth;
	}
	public void setYr_mth(String yr_mth) {
		this.yr_mth = yr_mth;
	}
		public String getAdvance() {
		return advance;
	}
	public void setAdvance(String advance) {
		this.advance = advance;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
