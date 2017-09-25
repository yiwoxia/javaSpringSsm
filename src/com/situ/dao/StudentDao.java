package com.situ.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.situ.pojo.Student;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;
@Repository("studentDao")
public interface StudentDao {
	/**
	 * 查询所有
	 * @return
	 */
  public List<Student> finAll();
  /**
   * 分页
   * @return
   */
	public int totalSize();
	
	public List<Student> pageList(PageBean<Student> pageben);
	/**
	 * 分页查询
	 * @param condition
	 * @return
	 */
	public int totalSizeByCondition(SearchCondition condition);
	
	public List<Student> pageListByCondition(SearchCondition condition);
	/**
	 * 添加学生
	 * @param student
	 * @return
	 */
	public int addStudent(Student student);
	/**
	 * 修改
	 * @param student
	 * @return
	 */
	public int update(Student student);
	/**
	 * 修改
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
