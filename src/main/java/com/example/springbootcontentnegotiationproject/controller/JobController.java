package com.example.springbootcontentnegotiationproject.controller;

import com.example.springbootcontentnegotiationproject.dto.JobRequestDTO;
import com.example.springbootcontentnegotiationproject.model.job.Job;
import com.example.springbootcontentnegotiationproject.service.JobService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RequestMapping("/api/content")
public class JobController {

        final JobService jobService;

       @PostMapping(value = "/job",
               consumes = {"application/json", "application/xml","application/x-yaml" },
               produces =  {"application/json", "application/xml","application/x-yaml" })
    public Job createJob(@RequestBody JobRequestDTO jobRequestDTO){
           return  jobService.saveJob(jobRequestDTO);
       }

       @PutMapping(value = "/job/{id}",
               consumes = {"application/json", "application/xml","application/x-yaml" }
               ,produces =  {"application/json", "application/xml","application/x-yaml" })
    public Job updateJob(@PathVariable("id") String id, @RequestBody JobRequestDTO jobRequestDTO){
           return jobService.updateJob(id, jobRequestDTO);
       }

    @GetMapping(value = "/job/{id}",
            produces =  {"application/json", "application/xml","application/x-yaml" })
    public Job getJob(@PathVariable("id") String id){
        return jobService.getJob(id);
    }
    @DeleteMapping(value = "/job/{id}")
    public void deleteJob(@PathVariable("id") String id){
         jobService.deleteJob(id);
    }
    @GetMapping(value = "/jobs",
            produces =  {"application/json", "application/xml","application/x-yaml" })
    public List<Job> getJobs(){
           return jobService.getJobs();
    }
}
