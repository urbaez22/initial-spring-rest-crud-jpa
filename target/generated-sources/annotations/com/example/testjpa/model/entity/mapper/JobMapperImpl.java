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
public class JobMapperImpl implements JobMapper {

    @Override
    public void updatePersonFromDto(JobDTO dto, Job entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getRoleTitle() != null ) {
            entity.setRoleTitle( dto.getRoleTitle() );
        }
        if ( dto.getRoleDescription() != null ) {
            entity.setRoleDescription( dto.getRoleDescription() );
        }
        if ( dto.getStartedAt() != null ) {
            entity.setStartedAt( dto.getStartedAt() );
        }
        if ( dto.getFinishedAt() != null ) {
            entity.setFinishedAt( dto.getFinishedAt() );
        }
        if ( dto.getCompany() != null ) {
            if ( entity.getCompany() == null ) {
                entity.setCompany( new Company() );
            }
            companyDTOToCompany( dto.getCompany(), entity.getCompany() );
        }
        if ( dto.getPerson() != null ) {
            if ( entity.getPerson() == null ) {
                entity.setPerson( new Person() );
            }
            personDTOToPerson1( dto.getPerson(), entity.getPerson() );
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

    protected void companyDTOToCompany(CompanyDTO companyDTO, Company mappingTarget) {
        if ( companyDTO == null ) {
            return;
        }

        mappingTarget.setId( companyDTO.getId() );
        mappingTarget.setName( companyDTO.getName() );
        mappingTarget.setSiteUrl( companyDTO.getSiteUrl() );
        if ( mappingTarget.getJobs() != null ) {
            List<Job> list = jobDTOListToJobList( companyDTO.getJobs() );
            if ( list != null ) {
                mappingTarget.getJobs().clear();
                mappingTarget.getJobs().addAll( list );
            }
            else {
                mappingTarget.setJobs( null );
            }
        }
        else {
            List<Job> list = jobDTOListToJobList( companyDTO.getJobs() );
            if ( list != null ) {
                mappingTarget.setJobs( list );
            }
        }
    }

    protected void personDTOToPerson1(PersonDTO personDTO, Person mappingTarget) {
        if ( personDTO == null ) {
            return;
        }

        mappingTarget.setId( personDTO.getId() );
        mappingTarget.setFullname( personDTO.getFullname() );
        mappingTarget.setEmail( personDTO.getEmail() );
        mappingTarget.setPhoneNumber( personDTO.getPhoneNumber() );
        mappingTarget.setAddress( personDTO.getAddress() );
        if ( mappingTarget.getJobs() != null ) {
            List<Job> list = jobDTOListToJobList( personDTO.getJobs() );
            if ( list != null ) {
                mappingTarget.getJobs().clear();
                mappingTarget.getJobs().addAll( list );
            }
            else {
                mappingTarget.setJobs( null );
            }
        }
        else {
            List<Job> list = jobDTOListToJobList( personDTO.getJobs() );
            if ( list != null ) {
                mappingTarget.setJobs( list );
            }
        }
    }
}
