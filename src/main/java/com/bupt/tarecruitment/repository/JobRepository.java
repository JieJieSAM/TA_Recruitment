package com.bupt.tarecruitment.repository;

import com.bupt.tarecruitment.domain.JobPosting;

import java.util.List;
import java.util.Optional;

public interface JobRepository {
    List<JobPosting> findAll();

    Optional<JobPosting> findById(String id);

    void save(JobPosting jobPosting);
}
