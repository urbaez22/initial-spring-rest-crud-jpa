package com.example.testjpa.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.testjpa.model.entity.Job;
import com.example.testjpa.model.entity.Person;

import lombok.Data;

@Data
public class JobDTO implements Serializable {
	
	private static final long serialVersionUID = -7022056842114144690L;
	private Long id;
	private String roleTitle;
	private String roleDescription;
	private Date startedAt;
	private Date finishedAt;
	private CompanyDTO company;
	private PersonDTO person;
	
	public JobDTO() {
		super();
	}
	
	public JobDTO(Job j) {
		this.id = j.getId();
		this.roleTitle = j.getRoleTitle();
		this.roleDescription = j.getRoleDescription();
		this.startedAt = j.getStartedAt();
		this.finishedAt = j.getFinishedAt();
		this.company = new CompanyDTO(j.getCompany());
		this.person = new PersonDTO(j.getPerson());
	}
	
	public Job toJob(Person p) {
		Job j = new Job();
		j.setId(this.id);
		j.setRoleTitle(this.roleTitle);
		j.setRoleDescription(this.roleDescription);
		j.setStartedAt(this.startedAt);
		j.setFinishedAt(this.finishedAt);
		j.setCompany(this.company.toCompany());
		j.setPerson(p);
		return j;
	}
}
