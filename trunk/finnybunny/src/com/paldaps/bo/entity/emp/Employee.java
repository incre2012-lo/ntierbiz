package com.paldaps.bo.entity.emp;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.paldaps.system.core.domain.AbstractTimestampEntity;
import com.paldaps.system.core.domain.DomainObject;
@Entity
@Table(name = "employee")
public class Employee extends AbstractTimestampEntity implements DomainObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	protected String per_no;
	protected String emp_name;
	protected String rnk_cd;
	protected String unit_cd;
	protected String pan_number;
	protected String gpf_ac_no;
	protected String bank_acno;
	protected String bank_add;
	
	
	@OneToMany(orphanRemoval=true,cascade={javax.persistence.CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name = "per_no", nullable=false)
	protected Set<AdvGPFEntry> advGPFEntries =new HashSet<AdvGPFEntry>();
	
	
	@OneToMany(orphanRemoval=true,cascade={javax.persistence.CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name = "per_no", nullable=false)
	protected Set<RecGPFEntry> recGPFEntries =new HashSet<RecGPFEntry>();
	
	
	@OneToMany(orphanRemoval=true,cascade={javax.persistence.CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name = "per_no", nullable=false)
	protected Set<SubsGPFEntry> subsGPFEntries =new HashSet<SubsGPFEntry>();
	
	@OneToMany(orphanRemoval=true,cascade={javax.persistence.CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name = "per_no", nullable=false)
	protected Set<WiDrGPFEntry> widrlsGPFEntries =new HashSet<WiDrGPFEntry>();
	
	@OneToMany(orphanRemoval=true,cascade={javax.persistence.CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinColumn(name = "per_no", nullable=false)
	protected Set<EmployeeOpnAndClsLog> employeeOpnAndClsGPFEntries =new HashSet<EmployeeOpnAndClsLog>();
	
	public String getPer_no() {
		return per_no;
	}
	public void setPer_no(String per_no) {
		this.per_no = per_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	
	public String getRnk_cd() {
		return rnk_cd;
	}
	public void setRnk_cd(String rnk_cd) {
		this.rnk_cd = rnk_cd;
	}
	public String getUnit_cd() {
		return unit_cd;
	}
	public void setUnit_cd(String unit_cd) {
		this.unit_cd = unit_cd;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public String getGpf_ac_no() {
		return gpf_ac_no;
	}
	public void setGpf_ac_no(String gpf_ac_no) {
		this.gpf_ac_no = gpf_ac_no;
	}
	public String getBank_acno() {
		return bank_acno;
	}
	public void setBank_acno(String bank_acno) {
		this.bank_acno = bank_acno;
	}
	public String getBank_add() {
		return bank_add;
	}
	public void setBank_add(String bank_add) {
		this.bank_add = bank_add;
	}
	public Set<AdvGPFEntry> getAdvGPFEntries() {
		return advGPFEntries;
	}
	public void setAdvGPFEntries(Set<AdvGPFEntry> advGPFEntries) {
		this.advGPFEntries = advGPFEntries;
	}
	public Set<RecGPFEntry> getRecGPFEntries() {
		return recGPFEntries;
	}
	public void setRecGPFEntries(Set<RecGPFEntry> recGPFEntries) {
		this.recGPFEntries = recGPFEntries;
	}
	public Set<SubsGPFEntry> getSubsGPFEntries() {
		return subsGPFEntries;
	}
	public void setSubsGPFEntries(Set<SubsGPFEntry> subsGPFEntries) {
		this.subsGPFEntries = subsGPFEntries;
	}
	
	
	public Set<WiDrGPFEntry> getWidrlsGPFEntries() {
		return widrlsGPFEntries;
	}
	public void setWidrlsGPFEntries(Set<WiDrGPFEntry> widrlsGPFEntries) {
		this.widrlsGPFEntries = widrlsGPFEntries;
	}
	
	public Set<EmployeeOpnAndClsLog> getEmployeeOpnAndClsGPFEntries() {
		return employeeOpnAndClsGPFEntries;
	}
	public void setEmployeeOpnAndClsGPFEntries(
			Set<EmployeeOpnAndClsLog> employeeOpnAndClsGPFEntries) {
		this.employeeOpnAndClsGPFEntries = employeeOpnAndClsGPFEntries;
	}
	@Override
	public Integer getId() {
		return null;
	}
	
	
	
}
