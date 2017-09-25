package com.situ.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.pojo.Student;

@Controller
@RequestMapping(value="/json")
public class JsonController {
	
	@RequestMapping("/requestJson")
	private @ResponseBody Student requestJson(@RequestBody Student student){
		System.out.println(student);
		return student;
	}
	@RequestMapping("/responseEntity")
	private @ResponseBody Student responseEntity( Student student){
		System.out.println(student);
		return student;
	}
	@RequestMapping("/responseList")
	private @ResponseBody List<Student> responseList(@RequestBody Student student){
		System.out.println(student);
		List<Student> list = new ArrayList<Student>();
		Student stu1 = new Student("张三", 12, "男", "青岛");
		Student stu2 = new Student("李四", 12, "男", "青岛");
		Student stu3 = new Student("王五", 12, "男", "青岛");
		Student stu4 = new Student("赵六", 12, "男", "青岛");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		return list;
	}
	@RequestMapping("/responseMap")
	private @ResponseBody Map<String,Object> responseMap(@RequestBody Student student){
		System.out.println(student);
		List<Student> list = new ArrayList<Student>();
		Student stu1 = new Student("张三", 12, "男", "青岛");
		Student stu2 = new Student("李四", 12, "男", "青岛");
		Student stu3 = new Student("王五", 12, "男", "青岛");
		Student stu4 = new Student("赵六", 12, "男", "青岛");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("rows", list);
		return map;
	}
	
}
