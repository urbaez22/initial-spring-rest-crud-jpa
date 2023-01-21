package com.example.testjpa.model.entity.mapper;

import com.example.testjpa.dto.CompanyDTO;
import com.example.testjpa.dto.JobDTO;
import com.example.testjpa.dto.PersonDTO;
import com.example.testjpa.model.entity.Company;
import com.example.testjpa.model.entity.Job;
import com.example.testjpa.model.entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-21T13:43:23-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public void updatePersonFromDto(CompanyDTO dto, Company entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getSiteUrl() != null ) {
            entity.setSiteUrl( dto.getSiteUrl() );
        }
        if ( entity.getJobs() != null ) {
            List<Job> list = jobDTOListToJobList( dto.getJobs() );
            if ( list != null ) {
                entity.getJobs().clear();
                entity.getJobs().addAll( list );
            }
        }
        else {
            List<Job> list = jobDTOListToJobList( dto.getJobs() );
            if ( list != null ) {
                entity.setJobs( list );
            }
        }
    }

    protected List<Job> jobDTOListToJobList(List<JobDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Job> list1 = new ArrayList<Job>( list.size() );
        for ( JobDTO jobDTO : list ) {
            list1.add( jobDTOToJob( jobDTO ) );
        }

        return list1;
    }

    protected Company companyDTOToCompany(CompanyDTO companyDTO) {
        if ( companyDTO == null ) {
            return null;
        }

        Company company = new Company();

        company.setId( companyDTO.getId() );
        company.setName( companyDTO.getName() );
        company.setSiteUrl( companyDTO.getSiteUrl() );
        company.setJobs( jobDTOListToJobList( companyDTO.getJobs() ) );

        return company;
    }

    protected Person personDTOToPerson(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDTO.getId() );
        person.setFullname( personDTO.getFullname() );
        person.setEmail( personDTO.getEmail() );
        person.setPhoneNumber( personDTO.getPhoneNumber() );
        person.setAddress( personDTO.getAddress() );
        person.setJobs( jobDTOListToJobList( personDTO.getJobs() ) );

        return person;
    }

    protected Job jobDTOToJob(JobDTO jobDTO) {
        if ( jobDTO == null ) {
            return null;
        }

        Job job = new Job();

        job.setId( jobDTO.getId() );
        job.setRoleTitle( jobDTO.getRoleTitle() );
        job.setRoleDescription( jobDTO.getRoleDescription() );
        job.setStartedAt( jobDTO.getStartedAt() );
        job.setFinishedAt( jobDTO.getFinishedAt() );
        job.setCompany( companyDTOToCompany( jobDTO.getCompany() ) );
        job.setPerson( personDTOToPerson( jobDTO.getPerson() ) );

        return job;
    }
}
