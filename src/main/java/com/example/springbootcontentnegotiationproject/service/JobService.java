package com.example.springbootcontentnegotiationproject.service;

import com.example.springbootcontentnegotiationproject.dto.JobRequestDTO;
import com.example.springbootcontentnegotiationproject.model.job.Job;

import java.util.List;

public interface JobService {

    Job saveJob(JobRequestDTO jobRequestDTO);

    Job updateJob(String id,JobRequestDTO jobRequestDTO);

    Job getJob(String id);

    void deleteJob(String id);

    List<Job> getJobs();

}
