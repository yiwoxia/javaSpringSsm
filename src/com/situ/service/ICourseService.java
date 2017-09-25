package com.situ.service;

import java.util.List;

import com.situ.pojo.Coures;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

public interface ICourseService {

	/**
	 * 分页
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public PageBean pageList(Integer pageIndex, Integer pageSize);
	/**
	 * 获得所选的班级数
	 * @return
	 */
	public  List<Coures> getTotalBanjis();
	/**
	 * 获得所选课程的额人数
	 * @return
	 */
	public List<Coures> getTotalPersons();
	/**
	 * 添加
	 * @param coures
	 */
	public boolean addCoures(Coures coures);
	/**
	 * 跳转到修改修改课程的界面
	 * @param id
	 * @return
	 */
	public Coures findById(Integer id);
	public boolean update(Coures coures);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public boolean deleteCourse(Integer id);
	/**
	 * 进行条件查询分页
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public PageBean pageListByCondition(Condition condition);
	

}
