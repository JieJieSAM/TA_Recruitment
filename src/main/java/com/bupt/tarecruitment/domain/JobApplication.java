package com.bupt.tarecruitment.domain;

public class JobApplication {
    private String id;
    private String jobId;
    private String applicantId;
    private ApplicationStatus status;

    public JobApplication() {
    }

    public JobApplication(String id, String jobId, String applicantId, ApplicationStatus status) {
        this.id = id;
        this.jobId = jobId;
        this.applicantId = applicantId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }
}
