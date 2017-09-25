package com.situ.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.dao.CourseDao;
import com.situ.pojo.Coures;
import com.situ.service.ICourseService;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;
@Service("courseService")
public class CourseServiceImpl implements ICourseService{
	
	@Resource(name="courseDao")
	private CourseDao courseDao;
	
	//分页
	@Override
	public PageBean pageList(Integer pageIndex, Integer pageSize) {
		
		PageBean<Coures> pageBean = new PageBean<Coures>();
		pageBean.setPageIndex(pageIndex);
		pageBean.setPageSize(pageSize);
		int totalSize = courseDao.totalSize();
		
		pageBean.setTotalCount(totalSize);
		int totalpage = (int) Math.ceil(1.0 * totalSize / pageSize);
		pageBean.setTotalCount(totalSize);
		pageBean.setTotalpage(totalpage);
		System.out.println(totalSize);
		System.out.println(totalpage);
		List<Coures> list = courseDao.pageList(((pageIndex -1 ) * pageSize),pageSize);
		pageBean.setList(list);
		return pageBean;
	}
	//获得所选的班级数
	@Override
	public List<Coures> getTotalBanjis() {
		
		return courseDao.getTotalBanjis();
	}
	//获得所选课程的额人数
	@Override
	public List<Coures> getTotalPersons() {
		
		return courseDao.getTotalPersons();
	}
	//添加
	@Override
	public boolean addCoures(Coures coures) {
		int result = courseDao.addCoures(coures);	
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}
	//跳转到修改修改课程的界面
	@Override
	public Coures findById(Integer id) {
		return courseDao.findById(id);
	}
	//删除课程信息
	@Override
	public boolean deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		return courseDao.deleteCourse(id);
	}
	//修改
	@Override
	public boolean update(Coures coures) {
		
		int result = courseDao.update(coures);
		
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}
	//进行条件分页查询
	@Override
	public PageBean pageListByCondition(Condition condition) {
		PageBean<Coures> pageBean = new PageBean<Coures>();
		pageBean.setPageIndex(condition.getPageIndex());
		pageBean.setPageSize(condition.getPageSize());
		condition.setPageIndex((condition.getPageIndex() - 1) * condition.getPageSize());
		int totalSize = courseDao.toatalSizeByCondition(condition);
		int totalPage = (int) Math.ceil(1.0 * totalSize / condition.getPageSize());
		pageBean.setTotalCount(totalSize);
		pageBean.setTotalpage(totalPage);
		List<Coures> list = courseDao.pageListByCondition(condition);
		pageBean.setList(list);
		return  pageBean;
	}


}
