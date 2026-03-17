# Prototype Specification Final v1 (Iteration 1)

Target artifact for first assessment: `Prototype_groupXXX.pdf`

## 1. Objective

This prototype demonstrates how TA, MO, and Admin complete core tasks in a file-based Java system without database dependency.

## 2. Fidelity and Deliverable

- Fidelity: low/medium (sufficient for workflow validation)
- Suggested tools: Figma / Balsamiq / draw.io
- Export format: PDF
- Review focus: functionality coverage, usability clarity, role-based navigation

## 3. Scope Boundaries

### In Scope (Iteration 1)

1. Role-based navigation skeleton
2. TA profile creation
3. CV metadata/reference submission
4. Job posting and job listing/search
5. Initial flow consistency checks and form validation states

### Out of Scope (Iteration 1)

1. Full candidate selection and status lifecycle execution
2. Workload calculation engine implementation
3. Advanced AI recommendation logic
4. Production-grade UI polish

## 4. Screen Inventory

| Screen ID | Screen Name | Role | Key Purpose | Related Story |
|---|---|---|---|---|
| S-01 | Role Login/Entry | Shared | enter system by role | TA-01, MO-01, AD-01 |
| S-02 | Role Home Dashboard | Shared | route to role tasks | all |
| S-03 | TA Profile Form | TA | create/edit applicant profile | TA-01 |
| S-04 | CV Metadata Form | TA | upload reference metadata | TA-02 |
| S-05 | Job List + Filter | TA | browse/search active jobs | TA-03 |
| S-06 | Job Detail + Apply | TA | preview job and apply action | TA-04 |
| S-07 | Application Status List | TA | track application statuses | TA-05 |
| S-08 | Job Posting Form | MO | create new TA job posting | MO-01 |
| S-09 | Job Management List | MO | view own posted jobs | MO-01 |
| S-10 | Applicant List by Job | MO | review applicants per job | MO-02 |
| S-11 | Status Update Panel | MO | set shortlist/reject/offer | MO-03 |
| S-12 | Workload Dashboard | Admin | inspect aggregate workload | AD-01 |
| S-13 | Workload Export Page | Admin | export CSV/JSON | AD-02 |

## 5. Screen-Level Form Fields (Minimum)

### S-03 TA Profile Form

- Student ID (required)
- Name (required)
- Email (required)
- Skills (tag list, required)
- Availability hours/week (optional)

Validation:
- required fields cannot be empty
- student ID format must match defined pattern

### S-08 Job Posting Form

- Job ID (generated or required)
- Module code (required)
- Job title (required)
- Required skills (required)
- Weekly workload hours (required)
- Application deadline (optional)

Validation:
- workload must be positive integer
- module code/title must not be empty

## 6. Core Interaction Flows

### Flow A TA Application Journey

S-01 -> S-02 -> S-03 -> S-04 -> S-05 -> S-06 -> S-07

### Flow B MO Posting and Decision Journey

S-01 -> S-02 -> S-08 -> S-09 -> S-10 -> S-11

### Flow C Admin Monitoring Journey

S-01 -> S-02 -> S-12 -> S-13

## 7. Error and Empty States to Include in Prototype

1. Required field missing on profile form
2. CV reference invalid format
3. No jobs found after search
4. Duplicate application warning
5. Applicant list empty for selected job
6. No workload data available

## 8. Story-to-Prototype Coverage Matrix

| Story ID | Covered in Prototype | Screen IDs |
|---|---|---|
| TA-01 | Yes | S-03 |
| TA-02 | Yes | S-04 |
| TA-03 | Yes | S-05 |
| TA-04 | Partial (UI only in Iteration 1) | S-06 |
| TA-05 | Partial (UI only in Iteration 1) | S-07 |
| MO-01 | Yes | S-08, S-09 |
| MO-02 | Partial (UI only in Iteration 1) | S-10 |
| MO-03 | Partial (UI only in Iteration 1) | S-11 |
| AD-01 | Concept only | S-12 |
| AD-02 | Concept only | S-13 |

## 9. Feedback Plan and Evidence

### Planned Stakeholder Questions

1. Are role boundaries clear and realistic?
2. Are any required fields missing for real recruitment?
3. Is status terminology understandable to TA and MO?
4. Is workload dashboard summary sufficient for admin decisions?

### Evidence to Save

- annotated screenshots
- interview/survey notes
- issue list and priority updates
- backlog changes after feedback

## 10. Prototype Acceptance Checklist

1. Every Iteration 1 committed story has at least one concrete screen.
2. Navigation and role permissions are visually understandable.
3. Main error/empty states are represented.
4. PDF export is complete and readable for assessor review.
