package com.situ.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.pojo.Banji;
import com.situ.service.IBanjiService;
import com.situ.vo.Condition;
import com.situ.vo.PageBean;
import com.situ.vo.SearchCondition;

@Controller
@RequestMapping("/banji")
public class BanjiController {

	@Resource(name="banjiService")
	private IBanjiService banjiService;
	
	//分页
	@RequestMapping("/pageList")
	private String pageList(Integer pageIndex,Integer pageSize,Model model){
		if(pageIndex==null){
			pageIndex=1;
		}
		pageSize=3; 
		//获得班级人数
		getBanjiPersonNum(model);
		PageBean<Banji> pageBean = banjiService.pageList(pageIndex,pageSize);
		model.addAttribute("pageBean",pageBean);
		for(Banji banji : pageBean.getList()){
			System.out.println(banji);
		}
		
		return "show_banji";
		
	}
	//查询班级
	@RequestMapping("/seacherByCondition")
	private String searchByCondition(Condition condition,Model model){
		if(condition.getPageIndex() == null){
			condition.setPageIndex(1);
		}
		condition.setPageSize(3);
		getBanjiPersonNum(model);
		PageBean<Banji> pageBean = banjiService.pageListByCondition(condition);
		model.addAttribute("condition",condition);
		model.addAttribute("pageBean",pageBean);
		return "show_banji";
		
	}
	//查询班级的人数
	private void getBanjiPersonNum(Model model) {
		List<Banji>bjList = banjiService.getBanjiPersonNum();
		model.addAttribute("bjList",bjList);
		
	}
	//班级添加
	@RequestMapping("/addBanji")
	private String addBanji(Banji banji){
		System.out.println(banji);
		boolean result = banjiService.addBanji(banji);
		return "redirect:pageList.action";
		
	}
	@RequestMapping("toAddBanji")
	private String toAddBanji(Model model){
		
		return "add_banji";	
	}
	//修改
	@RequestMapping("/update")
	private String update(Banji banji,Model model){
		System.out.println(banji);
		boolean result = banjiService.update(banji);
		return "redirect:pageList.action";
	}
	@RequestMapping("toupdate")
	private String toupdate(int id,Model model){
		
		Banji banji = banjiService.findById(id);
		model.addAttribute("banji", banji);
		
		return "update_banji";
		
	}
	//删除
	@RequestMapping("/deleteById")
	private String deleteById(Banji banji,Model model){
		
	boolean result = banjiService.deleteById(banji);
	return "redirect:pageList.action";
	}
}
