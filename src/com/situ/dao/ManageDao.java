package com.situ.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.situ.pojo.Coures;


public interface ManageDao {

	/**
	 * 
	 * 添加课程表
	 * @param id
	 * @param cid
	 * @return
	 */
	boolean addCoures(Integer id, Integer cid);
	/**
	 * 获取班所有课程
	 * @return
	 */
	List<Coures> findALLCourse();
	/**
	 *  删除
	 * @param id
	 * @param cid
	 * @return
	 */
	boolean deleteCoures(Integer id, Integer cid);


	
	
	
}
