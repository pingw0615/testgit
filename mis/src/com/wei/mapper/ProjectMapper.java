package com.wei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wei.pojo.Project;

public interface ProjectMapper {
	//1。查询出Project表中的所有数据
	@Select("select * from Project")
	public List<Project> findProjects();
	//2.往Project表中插入数据
	@Insert("insert into Project(wType,wName,sTime,eTime,progess,pdetail,leader) values(#{wType},#{wName},#{sTime},#{eTime},#{progess},#{pdetail},#{leader})")
	public int insertProject(Project project);
}
