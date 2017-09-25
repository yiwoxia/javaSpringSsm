package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.situ.pojo.Coures;
import com.situ.vo.Condition;
import com.situ.vo.SearchCondition;

@Repository("courseDao")
public interface CourseDao {
	
	/**
	 * 分页无条件
	 * @param i
	 * @param pageSize
	 * @return
	 */
	public List<Coures> pageList(@Param("pageIndex")int pageIndex, @Param("pageSize")Integer pageSize);

	public int totalSize();
	/**
	 * 获得所选的班级数
	 * @return
	 */
	public List<Coures> getTotalBanjis();
	/**
	 * 获得所选课程的额人数
	 * @return
	 */
	public List<Coures> getTotalPersons();
	/**
	 * 添加
	 * @param coures
	 * @return
	 */
	public int addCoures(Coures coures);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Coures findById(Integer id);
	public int update(Coures coures);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public boolean deleteCourse(Integer id);
	/**
	 * 分页有条件
	 * @param condition
	 * @return
	 */
	public int toatalSizeByCondition(Condition condition);
	public List<Coures> pageListByCondition(Condition condition);


}
