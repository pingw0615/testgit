package com.wei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wei.pojo.Project;
import com.wei.service.ProjectService;

@Controller
public class ProjectController {
	//1.查询出Project表中的数据
	@Autowired
	@Qualifier("projectServiceImpl")
	ProjectService projectService;
	@RequestMapping(value="/showAll")
	@Transactional
	public String findAll(Model model ){
		List<Project> projects=projectService.findProjects();
		model.addAttribute("projects", projects);
		return "index.jsp";
	}
	//2.将数据插入到Project表中
	
	@RequestMapping(value="/insertProject")
	@Transactional
	public String insertAll(@RequestParam("type") String type,@RequestParam("name") String name,@RequestParam("stime") String stime,@RequestParam("etime") String etime,@RequestParam("progess") String progess,@RequestParam("detail") String detail,@RequestParam("leader") String leader){
		Project pro=new Project(type, name, stime, etime, progess, detail, leader);
		int row=projectService.insertProject(pro);
		if(row>0){
			System.out.println("插入成功");
		}
		return "redirect:showAll";
	}
}
