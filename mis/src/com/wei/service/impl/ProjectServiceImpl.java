package com.wei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wei.mapper.ProjectMapper;
import com.wei.pojo.Project;
import com.wei.service.ProjectService;
@Service("projectServiceImpl")
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectMapper proMapper;
	@Transactional
	public List<Project> findProjects() {
		return proMapper.findProjects();
	}
	
	//2.将数据插入Project表中
	@Transactional
	public int insertProject(Project pro) {
		return proMapper.insertProject(pro);
	}

}
