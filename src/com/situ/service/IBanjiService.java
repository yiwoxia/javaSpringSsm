package com.situ.service;

import java.util.List;

import com.situ.pojo.Banji;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

public interface IBanjiService {

	/**
	 * 查询所有
	 * @return
	 */
	public List<Banji> findAll();
	/**
	 * 分页查询
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public PageBean<Banji> pageList(Integer pageIndex, Integer pageSize);
	/**
	 * 查询班级的人数
	 * @return
	 */
	public List<Banji> getBanjiPersonNum();
	/**
	 * 分页班级
	 * @param condition
	 * @return
	 */
	public PageBean<Banji> pageListByCondition(Condition condition);
	/**
	 * 添加班级
	 * @param banji
	 * @return
	 */
	public boolean addBanji(Banji banji);
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
