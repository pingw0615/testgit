package com.wei.service;

import java.util.List;

import com.wei.pojo.Project;

public interface ProjectService {
	//查询出Project表中所有的数据
	public List<Project> findProjects();
	//2.将数据插入Project表中
	public int insertProject(Project pro);
}
