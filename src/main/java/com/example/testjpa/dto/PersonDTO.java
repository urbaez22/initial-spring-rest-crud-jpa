package com.example.testjpa.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.testjpa.model.entity.Job;
import com.example.testjpa.model.entity.Person;

import lombok.Data;

@Data
public class PersonDTO implements Serializable {
	
	private static final long serialVersionUID = 7473014682044604705L;
	private Long id;
	private String fullname;
	private String email;
	private String phoneNumber;
	private String address;
	private List<JobDTO> jobs;
	
	public PersonDTO() {
		super();
	}
	
	public PersonDTO(Person p) {
		this.id = p.getId();
		this.fullname = p.getFullname();
		this.email = p.getEmail();
		this.phoneNumber = p.getPhoneNumber();
		this.address = p.getAddress();
		if (p.getJobs() != null && p.getJobs().size() > 0) {
			this.jobs = new ArrayList<JobDTO>();
			for (Job j : p.getJobs()) {
				this.jobs.add(new JobDTO(j));
			}
		} else
			this.jobs = null;
	}
	
	public Person toPerson() {
		Person p = new Person();
		p.setId(this.id);
		p.setFullname(this.fullname);
		p.setEmail(this.email);
		p.setPhoneNumber(this.phoneNumber);
		p.setAddress(this.address);
		if (this.jobs != null && this.jobs.size() > 0) {
			p.setJobs(new ArrayList<Job>());
			for (JobDTO j : this.jobs) {
				p.getJobs().add(j.toJob(p));
			}
		}
		return p;
	}
}
