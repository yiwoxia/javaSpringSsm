package com.situ.service;

import java.util.List;

import com.situ.pojo.Coures;

public interface IManageService {

	/**
	 * 删除
	 * @param id
	 * @param cid
	 */
	public boolean deleteCoures(Integer id, Integer cid);
	 /**
	  * 添加课程表
	  * @param id
	  * @param cid
	  * @return
	  */
	public boolean addCoures(Integer id, Integer cid);
	/**
	 * 获取所有课程
	 * @return
	 */
	public List<Coures> findAllCourse();
	

}
