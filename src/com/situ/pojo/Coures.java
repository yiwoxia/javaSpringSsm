package com.situ.pojo;

import java.util.List;

public class Coures {

	private Integer cid;
	private String cname;
	private String teacher;
    private Integer credit;
    private List<Banji>list;
	private Integer totalBanjis;
	private Integer totalPersons;
  
	public Coures() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coures(Integer cid) {
		super();
		this.cid = cid;
	}
	
	
	
	public Coures(Integer cid, String cname, String teacher, Integer credit, List<Banji> list, Integer totalBanjis,
			Integer totalPersons) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teacher = teacher;
		this.credit = credit;
		this.list = list;
		this.totalBanjis = totalBanjis;
		this.totalPersons = totalPersons;
	}

	
	
	public Coures(String cname) {
		super();
		this.cname = cname;
	}

	public Coures(String cname, String teacher, Integer credit) {
		super();
		this.cname = cname;
		this.teacher = teacher;
		this.credit = credit;
	}

	public Coures(Integer cid, String cname, String teacher, Integer credit) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teacher = teacher;
		this.credit = credit;
	}


	public Coures(Integer cid, String cname, Integer credit) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.credit = credit;
	}


	public Coures(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	
	public String getTeacher() {
		return teacher;
	}


	public List<Banji> getList() {
		return list;
	}


	public void setList(List<Banji> list) {
		this.list = list;
	}


	public Integer getTotalBanjis() {
		return totalBanjis;
	}


	public void setTotalBanjis(Integer totalBanjis) {
		this.totalBanjis = totalBanjis;
	}


	public Integer getTotalPersons() {
		return totalPersons;
	}


	public void setTotalPersons(Integer totalPersons) {
		this.totalPersons = totalPersons;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}



	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}



	public Integer getCredit() {
		return credit;
	}



	public void setCredit(Integer credit) {
		this.credit = credit;
	}


	@Override
	public String toString() {
		return "Coures [cid=" + cid + ", cname=" + cname + ", teacher=" + teacher + ", credit=" + credit + ", list="
				+ list + ", totalBanjis=" + totalBanjis + ", totalPersons=" + totalPersons + "]";
	}
    
}
