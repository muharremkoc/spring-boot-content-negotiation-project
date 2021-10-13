package com.example.springbootcontentnegotiationproject.mapper;


import com.example.springbootcontentnegotiationproject.dto.JobRequestDTO;
import com.example.springbootcontentnegotiationproject.model.job.Job;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface JobMapper {

    @Mappings(
            {
                    @Mapping(target = "jobName",source = "jobName"),
                    @Mapping(target = "workedPerson",source = "workedPerson"),
                    @Mapping(target = "risky",source = "risky")
            }
    )
    Job jobRequestDTOToJob(JobRequestDTO jobRequestDTO);

}
