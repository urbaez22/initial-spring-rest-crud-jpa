package com.example.testjpa.model.entity.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.testjpa.dto.CompanyDTO;
import com.example.testjpa.model.entity.Company;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updatePersonFromDto(CompanyDTO dto, @MappingTarget Company entity);
}
