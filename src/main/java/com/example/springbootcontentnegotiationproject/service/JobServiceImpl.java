package com.example.springbootcontentnegotiationproject.service;

import com.example.springbootcontentnegotiationproject.dto.JobRequestDTO;
import com.example.springbootcontentnegotiationproject.mapper.JobMapper;
import com.example.springbootcontentnegotiationproject.model.job.Job;
import com.example.springbootcontentnegotiationproject.repository.JobRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor

public class JobServiceImpl implements JobService{


    final JobRepository jobRepository;

    final JobMapper jobMapper;

    @Override
    public Job saveJob(JobRequestDTO jobRequestDTO) {

        Job job=jobMapper.jobRequestDTOToJob(jobRequestDTO);

        return jobRepository.save(job);
    }

    @Override
    public Job updateJob(String id, JobRequestDTO jobRequestDTO) {

        Job newJob=jobRepository.findById(id).orElseThrow();

        newJob.setJobName(jobRequestDTO.getJobName());
        newJob.setWorkedPerson(jobRequestDTO.getWorkedPerson());
        newJob.setRisky(jobRequestDTO.isRisky());

        return jobRepository.save(newJob);
    }

    @Override
    public Job getJob(String id) {
        return jobRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteJob(String id) {
            jobRepository.deleteById(id);
    }

    @Override
    public List<Job> getJobs() {
        List<Job> jobs=jobRepository.findAll();

        return jobs;
    }
}
