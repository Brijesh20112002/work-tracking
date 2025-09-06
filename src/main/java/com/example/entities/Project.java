package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "projectId")
	private int projectId;
	private String projectName;

	private String projectfile;

	@Column(length = 200)
	private String projectDescription;

	private String status;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "project", orphanRemoval = true)
	private List<TaskMaster> tasks = new ArrayList<>();

	public Project(int id, String projectName, String projectfile, String projectDescription, String status) {
		super();
		this.projectId = id;
		this.projectName = projectName;
		this.projectfile = projectfile;
		this.projectDescription = projectDescription;
		this.status = status;
	}

	public Project() {

	}

	public int getId() {
		return projectId;
	}

	public void setId(int id) {
		this.projectId = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectfile() {
		return projectfile;
	}

	public void setProjectfile(String projectfile) {
		this.projectfile = projectfile;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<TaskMaster> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskMaster> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Project [id=" + projectId + ", projectName=" + projectName + ", projectfile=" + projectfile
				+ ", projectDescription=" + projectDescription + ", status=" + status + ", tasks=" + tasks + "]";
	}

}
