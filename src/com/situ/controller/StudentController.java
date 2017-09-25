package com.situ.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.pojo.Banji;
import com.situ.pojo.Student;
import com.situ.service.IBanjiService;
import com.situ.service.IStudentService;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

import javafx.scene.control.RadioMenuItem;

/*如果写AAutowired可以不用写了*/
@Controller
@RequestMapping("/student")
public class StudentController {
	
	/*日期专换*/
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true));
    }


	/*@Resource(name="studentService")*/
	/*这个Autowired是根据类型，多个实现类不适合用*/
	@Autowired
	private IStudentService studentService;
	/*@Resource(name="banjiService")*/
	@Autowired
	private IBanjiService banjiService;
	//查找所有学生
	/*@RequestMapping("/findAll")*/
	@RequestMapping(value="/stus/", method = RequestMethod.GET)
	private @ResponseBody List<Student> finAll(Model model){
		
		List<Student> list = studentService.finAll();
		model.addAttribute("list",list);
		for (Student student : list) {
			System.out.println(student);
		}
		/*return "show_student";*/
		return list;
		
	}
	
	//添加学生
	@RequestMapping("/addStudent")
	private String addStudent(Student student){
		System.out.println("添加学生:"+student);
		studentService.addStudent(student);
		
		return "redirect:pageList.action";
		
	}
	//跳转添加学生jsp
	@RequestMapping("/toaddStudent")
	private String toaddStudent(Model model){
		//获得班级
		getBanji(model);
		return "add_student";
		
	}
	//分页
	@RequestMapping("/pageList")
	private String pageList(Integer pageIndex,Integer pageSize,Model model){
		if(pageIndex == null){
			pageIndex = 0;
		}
		pageSize = 3;
		//获取所有班级
		getBanji(model);
		PageBean<Student> pageBean = studentService.pageList(pageIndex,pageSize);
		model.addAttribute("pageBean",pageBean);
		for (Student student : pageBean.getList()) {
			System.out.println(student);
			
		}
		return "show_student";
		
	}
	//分页查询
	@RequestMapping("/seacherByCondition")
	private String searcherByCondition(SearchCondition condition,Model model){
		if(condition.getPageIndex()==null){
			condition.setPageIndex(1);
		}
		condition.setPageSize(3);
		//获取班级信息
		getBanji(model);
		PageBean<Student> pageBean = studentService.pageListByCondition(condition);
		model.addAttribute("pageBean",pageBean);
		model.addAttribute("condition", condition);
		for (Student student : pageBean.getList()) {
			System.out.println(student);
		}
		return "show_student";
		
	}
	//更新学生信息
	@RequestMapping("/update")
	private String update(Student student){
		System.out.println("更新学生:"+student);
		boolean result = studentService.update(student);
		return "redirect:pageList.action";
		
	}
	//跳页面
	@RequestMapping("/toupdate")
	private String toupdate(int id,Model model){
		//获取班级信息
		getBanji(model);
		Student student = studentService.findById(id);
		System.out.println("通过ID查询到学生信息"+student);
		model.addAttribute("student",student);
		return "update_student";
		
	}
	//删除
	@RequestMapping("/deleteStudent")
	private String deleteStudent(int id){
		boolean result =studentService.deleteById(id);
		return "redirect:pageList.action";
		
	}
	private void getBanji(Model model) {
		List<Banji>bList = banjiService.findAll();
		model.addAttribute("bList",bList);
	}
}
