package com.situ.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.dao.ManageDao;
import com.situ.pojo.Coures;
import com.situ.service.IManageService;
@Service("manageService")
public class ManageServiceImpl implements IManageService{
	
	@Resource(name="manageDao")
	private ManageDao manageDao;

	//删除
	@Override
	public boolean deleteCoures(Integer id, Integer cid) {
		
		return manageDao.deleteCoures(id,cid);
	}
	//添加课程表
	@Override
	public boolean addCoures(Integer id, Integer cid) {
		
		return manageDao.addCoures(id,cid);
	}
	//获取所有课程
	@Override
	public List<Coures> findAllCourse() {
		
		return manageDao.findALLCourse();
	}
	
	
}
 