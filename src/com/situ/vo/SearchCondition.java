package com.situ.vo;

public class SearchCondition {
	private Integer id;
	private String name;
	private String age;
	private String gender;
	private String address;
	private String birthday;
	private String banji_id;
	//当前的页
	private Integer pageIndex;
	//页有多少数据
	private Integer pageSize;

	public SearchCondition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SearchCondition(Integer id, String name, String age, String gender, String address, String birthday,
			String banji_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
		this.banji_id = banji_id;
	}


	public SearchCondition(String name, String age, String gender, String address, String birthday, String banji_id,
			Integer pageIndex, Integer pageSize) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
		this.banji_id = banji_id;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	

	public SearchCondition(Integer id, String name, String age, String gender, String address, String birthday,
			String banji_id, Integer pageIndex, Integer pageSize) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
		this.banji_id = banji_id;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}



	public SearchCondition(String name, String age, String gender, String address, String birthday, Integer pageIndex,
			Integer pageSize) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public SearchCondition(String name, String age, String gender, String address, String birthday) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
	}

	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}

	
	
	public void setBanji_id(String banji_id) {
		this.banji_id = banji_id;
	}



	public String getBanji_id() {
		return banji_id;
	}



	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	@Override
	public String toString() {
		return "SearchCondition [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + ", birthday=" + birthday + ", banji_id=" + banji_id + ", pageIndex=" + pageIndex
				+ ", pageSize=" + pageSize + "]";
	}

	
}
