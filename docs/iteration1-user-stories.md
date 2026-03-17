# Iteration 1 Final - User Stories and Acceptance Criteria

This is the final Iteration 1 user story set for the first assessment (22 March 2026).

## 1. Handout Alignment

- Project type: Java application (Servlet/JSP web prototype chosen)
- Data constraint: text-file storage only (JSON/CSV/TXT/XML)
- No database
- Agile expectation: prioritized backlog + iteration planning + evidence

## 2. Story Index and Priority

| Story ID | Role | Story Title | Priority | Iteration Target |
|---|---|---|---|---|
| TA-01 | TA | Create applicant profile | Must | Iteration 1 |
| TA-02 | TA | Upload CV metadata/reference | Should | Iteration 1 |
| TA-03 | TA | Search available jobs | Must | Iteration 1 |
| TA-04 | TA | Apply for a job | Must | Iteration 2 |
| TA-05 | TA | Track application status | Must | Iteration 2 |
| MO-01 | MO | Post job | Must | Iteration 1 |
| MO-02 | MO | Review applicants | Must | Iteration 2 |
| MO-03 | MO | Update application status | Must | Iteration 2 |
| AD-01 | Admin | View overall workload | Should | Iteration 3 |
| AD-02 | Admin | Export workload summary | Should | Iteration 3 |
| AI-01 | MO | Skill match recommendation (explainable) | Could | Iteration 4 |
| AI-02 | TA | Missing skills advice | Could | Iteration 4 |

## 3. User Stories with Acceptance Criteria

### TA-01 Create Applicant Profile

As a TA, I want to create my applicant profile, so that I can apply for available jobs.

Acceptance Criteria:
1. Given I am on profile page, when I submit required fields (name, student ID, skill tags), then the system saves profile data to file-based storage.
2. Given profile is saved, when I open profile page again, then the saved values are displayed.
3. Given required fields are missing, when I submit, then validation errors are shown and data is not saved.

### TA-02 Upload CV Metadata/Reference

As a TA, I want to upload or register my CV reference, so that MOs can evaluate my qualifications.

Acceptance Criteria:
1. Given profile exists, when I submit CV metadata (file name/path/reference), then it is linked to my profile in file storage.
2. Given upload is empty or unsupported, when I submit, then I see a clear error message.
3. Given update succeeds, when I revisit profile, then latest CV reference is visible.

### TA-03 Search Available Jobs

As a TA, I want to browse and filter jobs, so that I can find suitable opportunities.

Acceptance Criteria:
1. Given active jobs exist, when I open jobs list, then all active jobs are displayed.
2. Given filter keywords are entered (module code/title), when search runs, then only matched jobs are shown.
3. Given no match exists, when search runs, then an empty-state message appears.

### TA-04 Apply for a Job

As a TA, I want to apply for a selected job, so that I can be considered in recruitment.

Acceptance Criteria:
1. Given profile exists and selected job is active, when I submit application, then a new application record is created with status `SUBMITTED`.
2. Given I already applied to the same job, when I submit again, then duplicate application is blocked.
3. Given application is successful, when I open application list, then the new record is visible.

### TA-05 Track Application Status

As a TA, I want to track my application status, so that I understand current outcomes.

Acceptance Criteria:
1. Given I have applications, when I open status page, then each record shows one of `SUBMITTED`, `SHORTLISTED`, `REJECTED`, `OFFERED`.
2. Given MO updates status, when I refresh status page, then latest value is displayed.
3. Given no applications exist, when I open status page, then no-record guidance is shown.

### MO-01 Post Job

As a MO, I want to post jobs, so that TAs can apply.

Acceptance Criteria:
1. Given I am MO user, when I submit a valid job form, then job record is saved to file storage.
2. Given required fields are missing, when I submit, then validation errors appear and save is rejected.
3. Given posting succeeds, when I open job list, then the new job appears.

### MO-02 Review Applicants

As a MO, I want to review applicants for each job, so that I can make hiring decisions.

Acceptance Criteria:
1. Given applications exist for a job, when I open applicant list, then applicant summary and CV reference are visible.
2. Given no applications exist, when I open applicant list, then an empty-state message appears.
3. Given data is stored in files, when list is loaded, then no database dependency is required.

### MO-03 Update Application Status

As a MO, I want to update applicant status, so that decisions are recorded and visible.

Acceptance Criteria:
1. Given application exists, when I choose `SHORTLISTED`, `REJECTED`, or `OFFERED`, then status is saved.
2. Given status update succeeds, when TA opens status page, then same status is shown.
3. Given invalid status input is submitted, when save is attempted, then update fails with clear error.

### AD-01 View Overall Workload

As an Admin, I want to view TA workload totals, so that over-allocation can be identified.

Acceptance Criteria:
1. Given job/application data exists, when dashboard loads, then each TA's total assigned workload is shown.
2. Given total exceeds threshold, when dashboard renders, then TA is flagged.
3. Given no records exist, when dashboard loads, then zero/default state is shown.

### AD-02 Export Workload Summary

As an Admin, I want to export workload data, so that the summary can be shared.

Acceptance Criteria:
1. Given workload data exists, when export is requested, then CSV or JSON file is produced.
2. Given export succeeds, when file is opened, then totals match dashboard.
3. Given file write fails, when export runs, then system logs error and shows failure message.

### AI-01 Skill Match Recommendation (Optional)

As a MO, I want explainable skill-match scoring, so that I can prioritize applicant review.

Acceptance Criteria:
1. Given job requirement and TA skills exist, when scoring runs, then score + reason summary is shown.
2. Given AI service is unavailable, when scoring runs, then rule-based fallback score is returned.
3. Given result is shown, when details are opened, then explainable factors are visible.

### AI-02 Missing Skills Advice (Optional)

As a TA, I want to know missing skills for target jobs, so that I can improve my profile.

Acceptance Criteria:
1. Given profile and job requirements exist, when analysis runs, then missing skill list is shown.
2. Given no gap exists, when analysis runs, then alignment confirmation is shown.
3. Given advice is shown, when details are viewed, then advice is linked to requirement fields.

## 4. Traceability (Story to Prototype)

| Story ID | Prototype Screen(s) | Backlog ID |
|---|---|---|
| TA-01 | TA Profile Form | PB-01 |
| TA-02 | CV Metadata Form | PB-02 |
| TA-03 | Jobs List + Filter | PB-03 |
| TA-04 | Job Detail + Apply | PB-04 |
| TA-05 | Application Status List | PB-05 |
| MO-01 | Job Posting Form | PB-06 |
| MO-02 | Applicant List | PB-07 |
| MO-03 | Status Update Panel | PB-08 |
| AD-01 | Workload Dashboard | PB-09 |
| AD-02 | Export Action Page | PB-10 |
