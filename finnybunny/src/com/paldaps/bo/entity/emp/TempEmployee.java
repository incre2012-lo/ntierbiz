package com.paldaps.bo.entity.emp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.paldaps.system.core.domain.DomainObject;

@Entity
@Table(name = "temp")
public class TempEmployee implements DomainObject{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String yr_mth;
	 @Id
	 private String per_no;
	 private String emp_name;
	 private String rnk_cd;
	 private String unit_cd;
	 private String pan_number;
	 private String gpf_ac_no;
	 private String gpf_subs;
	 private String gpf_arr_rec;
	 private String advance;
	 private String bank_acno;
	 private String bank_add;
	 private String label;
	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getYr_mth() {
		return yr_mth;
	}

	public void setYr_mth(String yr_mth) {
		this.yr_mth = yr_mth;
	}

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

	public String getGpf_subs() {
		return gpf_subs;
	}

	public void setGpf_subs(String gpf_subs) {
		this.gpf_subs = gpf_subs;
	}

	public String getGpf_arr_rec() {
		return gpf_arr_rec;
	}

	public void setGpf_arr_rec(String gpf_arr_rec) {
		this.gpf_arr_rec = gpf_arr_rec;
	}

	public String getAdvance() {
		return advance;
	}

	public void setAdvance(String advance) {
		this.advance = advance;
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

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 

}
