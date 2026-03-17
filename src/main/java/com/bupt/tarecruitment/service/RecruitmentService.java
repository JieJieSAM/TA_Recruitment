package com.bupt.tarecruitment.service;

import com.bupt.tarecruitment.domain.JobApplication;
import com.bupt.tarecruitment.domain.JobPosting;

import java.util.List;

public interface RecruitmentService {
    List<JobPosting> listJobs();

    void postJob(JobPosting jobPosting);

    void apply(JobApplication jobApplication);
}
