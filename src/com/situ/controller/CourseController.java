package com.situ.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.pojo.Banji;
import com.situ.pojo.Coures;
import com.situ.service.ICourseService;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Resource(name="courseService")
	private ICourseService courseService;
	
	//分页
	@RequestMapping("/pageList")
	private String pageList(Integer pageIndex,Integer pageSize,Model model){
		if(pageIndex==null){
			pageIndex=1;
		}
		pageSize= 3;
		//获得所选的班级数
		getTotalBanjis(model);
		//获得所选课程的额人数
		getTotalPersons(model);
		PageBean pageBean = courseService.pageList(pageIndex,pageSize);
		model.addAttribute("pageBean",pageBean);
		return "show_course";
		
	}
	//进行条件查询分页
	@RequestMapping("/seacherByCondition")
	private String seacherByCondition(Condition condition,Model model){
		if(condition.getPageIndex()==null){
			condition.setPageIndex(1);
		}
		condition.setPageSize(3);
		//获得所选的班级数
		getTotalBanjis(model);
		//获得所选课程的人数
		getTotalPersons(model);
		PageBean pageBean = courseService.pageListByCondition(condition);
		model.addAttribute("pageBean",pageBean);
		System.out.println("0000000000000"+pageBean);
		return "show_course";
		
	}
	//获得所选课程的额人数
	private void getTotalPersons(Model model) {
		List<Coures> psList = courseService.getTotalPersons();
		model.addAttribute("psList",psList);
		System.out.println("=================================="+psList);
	}
	//获得所选的班级数
	private void getTotalBanjis(Model model) {
		List<Coures> tbsList = courseService.getTotalBanjis();
		model.addAttribute("tbsList",tbsList);
		System.out.println("--------------------------------"+tbsList);
	}
	//跳转到添加课程的页面
	@RequestMapping("/toAddCoures")
	private String toAddCoures(Model model) {
		
		return "add_coures";
	}
	//添加班级
	@RequestMapping("/addCoures")
	private String addCoures(Coures coures){
		courseService.addCoures(coures);
		return "redirect:pageList.action";
	} 

	//修改课程
	@RequestMapping("/update")
	private String update(Coures coures) {
		
		boolean result = courseService.update(coures);
		return "redirect:pageList.action";
	}
	//跳转到修改修改课程的界面
	@RequestMapping("/toUpdate")
	private String toUpdate(Integer id,Model model) {
		Coures coures = courseService.findById(id);
		model.addAttribute("coures", coures);
		System.out.println("---------------------------======================"+coures);
		return "update_coures";
	}
	//删除课程信息Id
	@RequestMapping("/delCourse")
	private String delCourse(Integer id) {
		
		boolean result = courseService.deleteCourse(id);
		return "redirect:pageList.action";
	}
}
