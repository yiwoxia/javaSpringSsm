package com.situ.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.pojo.Banji;
import com.situ.pojo.Coures;
import com.situ.service.IBanjiService;
import com.situ.service.IManageService;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

@Controller
@RequestMapping("manage")
public class ManageController {

	@Resource(name="manageService")
	private IManageService manageService;
	@Resource(name="banjiService")
	private IBanjiService banjiService;
	
	//进行班级分页
	@RequestMapping("/pageList")
	private String pageList(Integer pageIndex,Integer pageSize,Model model){
		if(pageIndex==null){
			pageIndex=1;
		}
		pageSize=3;
		//获得班级的人数
		getBanjiPersonNum(model);
		PageBean<Banji> pageBean =banjiService.pageList(pageIndex, pageSize);
		model.addAttribute("pageBean",pageBean);
		for (Banji banji : pageBean.getList()){
			System.out.println("88888888888888888"+banji);
		}
		return "show_manag";
		
	}
	//对班级进行分页
	@RequestMapping("/searchByCondition")
	private String searchByCondition(Condition condition,Model model){
		if(condition.getPageIndex()==null){
			condition.setPageIndex(1);
		}
		condition.setPageSize(3);
		getBanjiPersonNum(model);
		PageBean<Banji> pageBean = banjiService.pageListByCondition(condition);
		model.addAttribute("pageBean",pageBean);
		model.addAttribute("condition"+condition);
		
		return "show_manag";
		
	}
	//进行删除课程
	@RequestMapping("/deleteCoures")
	private String deleteCoures(Integer id,Integer cid){
		
		manageService.deleteCoures(id,cid);
		return "redirect:pageList.action";
		
	}
	//添加班级学生
	@RequestMapping("/toBanjiAddCoures")
	private String addCoures(Integer id, Integer cid,Model model){
	
		List<Banji> bList = banjiService.findAll();
		List<Coures> cList = manageService.findAllCourse();
		model.addAttribute("bList", bList);
		model.addAttribute("cList", cList);
		return "add_manage";
		
	}
	//添加课程
	@RequestMapping("/addCourses")
	private  String addCourses(Integer id, Integer cid){
		boolean result = manageService.addCoures(id, cid);
		return "redirect:pageList.action";
	}
	//查询班级的人数
	private void getBanjiPersonNum(Model model) {
		List<Banji>pList = banjiService.getBanjiPersonNum();
		model.addAttribute("pList",pList);
	}
	 
}
