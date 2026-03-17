# Iteration 1 User Stories and Acceptance Criteria

This document defines initial user stories for the TA Recruitment System and their acceptance criteria.

## Scope and Constraints Alignment

- Application type: Java Servlet/JSP web application
- Storage: JSON/CSV/TXT/XML files only
- No database usage
- Focus: core recruitment workflow first, then enhancements

## TA Stories

### TA-01 Create Applicant Profile

As a TA, I want to create my applicant profile, so that I can apply for available jobs.

Acceptance Criteria:
1. Given I am on the profile page, when I submit required fields (name, student ID, skills), then the system stores the profile in file-based storage.
2. Given profile creation is successful, when I revisit the profile page, then I can view the saved profile data.
3. Given required fields are missing, when I submit, then the system shows validation messages and does not save incomplete data.

### TA-02 Upload CV Metadata

As a TA, I want to upload my CV (or CV metadata reference), so that MO can review my qualifications.

Acceptance Criteria:
1. Given my profile exists, when I upload a CV file name/path reference, then it is linked to my profile in file-based storage.
2. Given an unsupported file type or empty upload, when I submit, then I see an error message.
3. Given upload succeeds, when I view my profile, then I can see the latest CV reference.

### TA-03 Search Available Jobs

As a TA, I want to browse available jobs, so that I can choose suitable positions.

Acceptance Criteria:
1. Given jobs are posted, when I open the jobs page, then I see a list of active jobs.
2. Given I provide filter keywords (e.g., module code), when I search, then matching jobs are shown.
3. Given no jobs match, when I search, then the system shows a clear empty-state message.

### TA-04 Apply for a Job

As a TA, I want to apply for a selected job, so that I can be considered for recruitment.

Acceptance Criteria:
1. Given my profile exists and job is active, when I submit an application, then the system creates an application with status `SUBMITTED`.
2. Given I already applied to the same job, when I apply again, then the system blocks duplicate submission.
3. Given application succeeds, when I open my application list, then the new record is visible.

### TA-05 Track Application Status

As a TA, I want to see application status updates, so that I know the current outcome.

Acceptance Criteria:
1. Given I have applications, when I view my dashboard, then I can see status values (SUBMITTED/SHORTLISTED/REJECTED/OFFERED).
2. Given MO updates status, when I refresh the dashboard, then I see the latest status.
3. Given no applications exist, when I open status page, then I see a no-record message.

## MO Stories

### MO-01 Post Job

As a MO, I want to create a job posting, so that TAs can apply.

Acceptance Criteria:
1. Given I am authenticated as MO, when I submit a valid job form, then a job posting is saved to file storage.
2. Given required fields are missing, when I submit, then I see validation errors and nothing is saved.
3. Given job creation succeeds, when I open job list, then the new job appears.

### MO-02 Review Applicants

As a MO, I want to view all applicants for a job, so that I can evaluate candidates.

Acceptance Criteria:
1. Given applications exist for my job, when I open applicant list, then I can see applicant profile summary and CV reference.
2. Given no applications exist, when I open applicant list, then I see an empty-state message.
3. Given data file is readable, when I access the list, then results are loaded without database dependency.

### MO-03 Update Application Status

As a MO, I want to mark applicant status, so that recruitment decisions are recorded.

Acceptance Criteria:
1. Given an application exists, when I set status to SHORTLISTED/REJECTED/OFFERED, then the new status is saved.
2. Given update succeeds, when TA checks dashboard, then the same status is visible.
3. Given invalid status transition input, when I submit, then the system rejects it with an explanatory message.

## Admin Stories

### AD-01 View Overall TA Workload

As an Admin, I want to view TA workload across jobs, so that over-allocation can be identified.

Acceptance Criteria:
1. Given job assignments/applications exist, when I open workload dashboard, then I can see each TA's total workload hours.
2. Given a TA exceeds defined threshold, when dashboard loads, then the system flags that TA.
3. Given no data exists, when dashboard loads, then the system displays zero/default summary.

### AD-02 Export Workload Summary

As an Admin, I want to export workload summary as a text-based file, so that I can share it for planning.

Acceptance Criteria:
1. Given workload data is available, when I request export, then a CSV or JSON summary is generated.
2. Given export succeeds, when I open the exported file, then records match dashboard totals.
3. Given file write fails, when export runs, then the system logs an error and shows failure feedback.

## Optional AI-Enhanced Stories (Post-Core)

### AI-01 Skill Matching Recommendation

As a MO, I want a skill-match score for each applicant, so that I can prioritize review.

Acceptance Criteria:
1. Given applicant skills and job requirements are available, when match runs, then a score and reason summary are shown.
2. Given AI output is unavailable, when match runs, then rule-based scoring still provides a result.
3. Given recommendation is shown, when user views details, then explainable factors are visible.

### AI-02 Missing Skills Advice

As a TA, I want to see missing skills for a job, so that I can improve future applications.

Acceptance Criteria:
1. Given TA profile and job requirements exist, when analysis runs, then missing skills list is displayed.
2. Given no missing skills, when analysis runs, then system explicitly states profile is aligned.
3. Given analysis details are shown, when user checks result, then explanation references job requirements fields.
