package com.example.testjpa.model.entity.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.testjpa.dto.PersonDTO;
import com.example.testjpa.model.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updatePersonFromDto(PersonDTO dto, @MappingTarget Person entity);
}
