package com.situ.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.dao.BanjiDao;
import com.situ.pojo.Banji;
import com.situ.service.IBanjiService;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;
@Service("banjiService")
public class BanjiServiceImpl implements IBanjiService{

	@Resource(name="banjiDao")
	private BanjiDao banjiDao;
	//查询所有
	@Override
	public List<Banji> findAll() {
		
		return banjiDao.findAll();
	}
	//分页查询
	@Override
	public PageBean<Banji> pageList(Integer pageIndex, Integer pageSize) {
		PageBean<Banji> pageBean = new PageBean<Banji>();
		pageBean.setPageIndex(pageIndex);
		System.out.println("pageIndex"+pageIndex);
		pageBean.setPageSize(pageSize);
		System.out.println("pageSize"+pageSize);
		int totalSize = banjiDao.totalSize();//获得班级个数
		int totalpage = (int) Math.ceil(1.0 * totalSize / pageSize);//获得总页数
		pageBean.setTotalCount(totalSize);
		System.out.println("totalSize"+totalSize);
		pageBean.setTotalpage(totalpage);
		System.out.println("totalpage"+totalpage);
		List<Banji> list = banjiDao.pageList(pageIndex,pageSize);
		pageBean.setList(list);
		System.out.println("------------------------list"+list);
		
		
		return pageBean;
	}
	//查询班级人数
	@Override
	public List<Banji> getBanjiPersonNum() {
		
		return banjiDao.getBanjiPersonNum();
	}
	//分页班级
	@Override
	public PageBean<Banji> pageListByCondition(Condition condition) {
		PageBean<Banji> pageBean = new PageBean<Banji>();
		pageBean.setPageIndex(condition.getPageIndex());
		pageBean.setPageSize(condition.getPageSize());
		int totalSize = banjiDao.totalSizeCondition(condition);
		int totalPage = (int) Math.ceil(1.0 * totalSize / condition.getPageSize());
		pageBean.setTotalCount(totalSize);
		pageBean.setTotalpage(totalPage);
		condition.setPageIndex((condition.getPageIndex()-1) * condition.getPageSize());
		List<Banji> list = banjiDao.pageListByCondition(condition);
		pageBean.setList(list);
		return pageBean;
	}
	//添加班级
	@Override
	public boolean addBanji(Banji banji) {
		 int result = banjiDao.addBanji(banji);
		 if (result > 0) {
				return true;
			} else {
				return false;
			}
	}
	//修改
	@Override
	public boolean update(Banji banji) {
		
		return banjiDao.update(banji);
	}
	@Override
	public Banji findById(int id) {
		return banjiDao.findById(id);
	}
	//删除
	@Override
	public boolean deleteById(Banji banji) {
		
		return banjiDao.deleteById(banji);
	}
	
}
