package com.situ.pojo;

import java.util.List;

public class Banji {
   
	private Integer id;
	private String bname;
	private Integer totalPersonNum;
	private List<Coures> list;
	private String name;
	
	public Banji() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Banji(Integer id, String bname, Integer totalPersonNum, List<Coures> list, String name) {
		super();
		this.id = id;
		this.bname = bname;
		this.totalPersonNum = totalPersonNum;
		this.list = list;
		this.name = name;
	}



	public Banji(Integer id, String bname, Integer totalPersonNum) {
		super();
		this.id = id;
		this.bname = bname;
		this.totalPersonNum = totalPersonNum;
	}
	
	public Integer getTotalPersonNum() {
		return totalPersonNum;
	}

	public void setTotalPersonNum(Integer totalPersonNum) {
		this.totalPersonNum = totalPersonNum;
	}

	public Banji(Integer id, String bname) {
		super();
		this.id = id;
		this.bname = bname;
	}

	public Banji(Integer id, String bname, Integer totalPersonNum, List<Coures> list) {
		super();
		this.id = id;
		this.bname = bname;
		this.totalPersonNum = totalPersonNum;
		this.list = list;
	}

	public Banji(Integer id, String bname, List<Coures> list) {
		super();
		this.id = id;
		this.bname = bname;
		this.list = list;
	}


	public Banji(Integer id, String bname, Integer totalPersonNum, String name) {
		super();
		this.id = id;
		this.bname = bname;
		this.totalPersonNum = totalPersonNum;
		this.name = name;
	}

	public List<Coures> getList() {
		return list;
	}



	public void setList(List<Coures> list) {
		this.list = list;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Banji(Integer id) {
		super();
		this.id = id;
	}

	
    
	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	@Override
	public String toString() {
		return "Banji [id=" + id + ", bname=" + bname + ", totalPersonNum=" + totalPersonNum + ", list=" + list
				+ ", name=" + name + "]";
	}

	
}
