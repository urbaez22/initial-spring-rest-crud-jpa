package com.example.testjpa.model.entity.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.testjpa.dto.JobDTO;
import com.example.testjpa.model.entity.Job;

@Mapper(componentModel = "spring")
public interface JobMapper {
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updatePersonFromDto(JobDTO dto, @MappingTarget Job entity);
}
