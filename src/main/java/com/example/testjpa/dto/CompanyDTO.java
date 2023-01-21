package com.example.testjpa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.testjpa.model.entity.Company;
import com.example.testjpa.model.entity.Job;

import lombok.Data;

@Data
public class CompanyDTO implements Serializable {
	
	private static final long serialVersionUID = -3967680943573619762L;
	private Long id;
	private String name;
	private String siteUrl;
	private List<JobDTO> jobs;
	
	public CompanyDTO() {
		super();
	}
	
	public CompanyDTO(Company c) {
		this.id = c.getId();
		this.name = c.getName();
		this.siteUrl = c.getSiteUrl();
		if (c.getJobs() != null && c.getJobs().size() > 0) {
			this.jobs = new ArrayList<JobDTO>();
			for (Job j : c.getJobs()) {
				this.jobs.add(new JobDTO(j));
			}
		} else
			this.jobs = null;
	}
	
	public Company toCompany() {
		Company c = new Company();
		c.setId(this.id);
		c.setName(this.name);
		c.setSiteUrl(this.siteUrl);
		if (this.jobs != null && this.jobs.size() > 0) {
			c.setJobs(new ArrayList<Job>());
			for (JobDTO j : this.jobs) {
				c.getJobs().add(j.toJob(j.getPerson().toPerson()));
			}
		}
		return c;
	}
}
