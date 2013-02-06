package com.paldaps.bo.entity.emp;


public class EmployeeYearView implements Comparable<EmployeeYearView>{

	private String mth_year;
	private String subs;
	private String rec;
	private String adv;
	private String withdrawal;
	private String ne;
	private String prog_total;
	private String opening;
	public String getMth_year() {
		return mth_year;
	}
	public void setMth_year(String mth_year) {
		this.mth_year = mth_year;
	}
	public String getSubs() {
		return subs;
	}
	public void setSubs(String subs) {
		this.subs = subs;
	}
	public String getRec() {
		return rec;
	}
	public void setRec(String rec) {
		this.rec = rec;
	}
	public String getAdv() {
		return adv;
	}
	public void setAdv(String adv) {
		this.adv = adv;
	}
	public String getWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}
	public String getNe() {
		return ne;
	}
	public void setNe(String ne) {
		this.ne = ne;
	}
	public String getProg_total() {
		return prog_total;
	}
	public void setProg_total(String prog_total) {
		this.prog_total = prog_total;
	}
	
	public String getOpening() {
		return opening;
	}
	public void setOpening(String opening) {
		this.opening = opening;
	}
	public int compareTo(EmployeeYearView o) {
		return this.mth_year.compareTo(o.mth_year);
	}	
	
}
