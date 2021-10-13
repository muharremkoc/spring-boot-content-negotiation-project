package com.example.springbootcontentnegotiationproject.repository;

import com.example.springbootcontentnegotiationproject.model.job.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job,String> {
}
