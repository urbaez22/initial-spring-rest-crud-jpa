package com.example.testjpa.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jobs")
@Data
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "role_title")
	private String roleTitle;
	
	@Column(name = "role_description")
	private String roleDescription;
	
	@Column(name = "started_at")
	private Date startedAt;
	
	@Column(name = "finished_at")
	private Date finishedAt;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	Company company;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	Person person;
}
