package com.wei.service;

import java.util.List;

import com.wei.pojo.Project;

public interface ProjectService {
	//��ѯ��Project�������е�����
	public List<Project> findProjects();
	//2.�����ݲ���Project����
	public int insertProject(Project pro);
}
