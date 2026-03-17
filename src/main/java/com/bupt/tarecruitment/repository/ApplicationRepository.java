package com.bupt.tarecruitment.repository;

import com.bupt.tarecruitment.domain.JobApplication;

import java.util.List;

public interface ApplicationRepository {
    List<JobApplication> findAll();

    List<JobApplication> findByApplicantId(String applicantId);

    void save(JobApplication jobApplication);
}
