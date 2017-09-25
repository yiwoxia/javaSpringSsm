package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.situ.pojo.Banji;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

@Repository("banjiDao")
public interface BanjiDao {


	
	/**
	 * 查询所有
	 * @return List<Banji>
	 */
	public List<Banji> findAll();
	/**
	 * 查询有多少个班级
	 * @return
	 */
	public int totalSize();
	/**
	 * 分页
	 */
	public List<Banji> pageList(@Param("pageIndex")Integer pageIndex, @Param("pageSize")Integer pageSize);

	/**
	 * 获得班级的总人数
	 * @return List<Banji>
	 */
	public List<Banji> getBanjiPersonNum();
	/**
	 * 分页查询
	 * @param condition
	 * @return
	 */
	public int totalSizeCondition(Condition condition);
	public List<Banji> pageListByCondition(Condition condition);
	/**
	 * 添加班级
	 * @param banji
	 * @return
	 */
	public int addBanji(Banji banji);
	/**
	 * 修改
	 * @param banji
	 * @return
	 */
	public boolean update(Banji banji);
	public Banji findById(int id);
	/**
	 * 删除
	 * @param banji
	 * @return
	 */
	public boolean deleteById(Banji banji);
	
}
