package com.situ.service;

import java.util.List;

import javax.annotation.Resource;

import com.situ.pojo.Student;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

public interface IStudentService {
	/**
	 *  查询所有
	 * @return
	 */
	public List<Student> finAll();
	
	/**
	 * 分页
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public PageBean<Student> pageList(Integer pageIndex, Integer pageSize);
	/**
	 * 分页查询
	 * @param condition
	 * @return
	 */
	public PageBean<Student> pageListByCondition(SearchCondition condition);
	/**
	 * 添加
	 * @param student
	 */
	public void addStudent(Student student);
	/**
	 * 更新
	 * @param student
	 * @return
	 */
	public boolean update(Student student);
	
	/**
	 * 根据I的更新
	 * @param id
	 * @return
	 */
	public Student findById(int id);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);

}
