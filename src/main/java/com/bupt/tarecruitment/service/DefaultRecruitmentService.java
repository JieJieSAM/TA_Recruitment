package com.bupt.tarecruitment.service;

import com.bupt.tarecruitment.domain.JobApplication;
import com.bupt.tarecruitment.domain.JobPosting;
import com.bupt.tarecruitment.repository.ApplicationRepository;
import com.bupt.tarecruitment.repository.JobRepository;

import java.util.List;

public class DefaultRecruitmentService implements RecruitmentService {
    private final JobRepository jobRepository;
    private final ApplicationRepository applicationRepository;

    public DefaultRecruitmentService(JobRepository jobRepository, ApplicationRepository applicationRepository) {
        this.jobRepository = jobRepository;
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<JobPosting> listJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void postJob(JobPosting jobPosting) {
        jobRepository.save(jobPosting);
    }

    @Override
    public void apply(JobApplication jobApplication) {
        applicationRepository.save(jobApplication);
    }
}
