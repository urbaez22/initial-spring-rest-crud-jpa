package com.example.testjpa.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testjpa.model.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
