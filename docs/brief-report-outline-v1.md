# Brief Report Draft v1 (First Assessment)

Target file on submission platform: `Report_groupXXX.pdf`  
Page constraint: max 5 pages for main body (appendix excluded).

## 1. Introduction

BUPT International School currently handles TA recruitment through forms and Excel tracking, which leads to inconsistent records, delayed updates, and poor visibility of workload distribution.

Our project proposes a lightweight TA Recruitment System developed with Agile methods. The Iteration 1 goal is to establish validated requirements, a prioritized product backlog, and a role-based prototype that demonstrates the core value path.

## 2. Requirement-Finding Approach

### 2.1 Techniques Used

1. Semi-structured interviews (MO, TA, Admin perspectives)
2. Short questionnaire for field and workflow preferences
3. Existing process walkthrough (manual form and spreadsheet flow)

### 2.2 Why These Techniques

- Interviews provide qualitative context and hidden pain points.
- Questionnaires provide quick comparability for feature priority.
- Process walkthrough identifies handover failures and duplicated work.

### 2.3 Key Findings

1. Profile and CV information is frequently incomplete.
2. Job availability visibility is inconsistent for applicants.
3. Status communication is delayed and non-transparent.
4. Admin lacks a unified workload view.

These findings directly informed the Must-have stories in Iteration 1 and Iteration 2 planning.

## 3. User Stories and Acceptance Criteria

We defined stories for three roles: TA, MO, Admin, using standard format:

- As a [role], I want [goal], so that [value].

Each story includes testable acceptance criteria with Given-When-Then logic to support objective demo and later acceptance testing.

Reference document: `docs/iteration1-user-stories.md`

## 4. Prioritization and Estimation

### 4.1 Prioritization Method

MoSCoW method was used:

- Must: core recruitment path (`profile -> job post/search -> apply groundwork`)
- Should: supportive but not blocking features
- Could: optional AI enhancements and advanced outputs

### 4.2 Estimation Method

Story points were assigned with team discussion (Fibonacci values 3/5/8), considering complexity, uncertainty, and integration cost.

### 4.3 Iteration 1 Commitment Rationale

Iteration 1 focuses on high-value/low-dependency stories:

- TA-01, TA-02, TA-03, MO-01

This secures the baseline user journey while keeping risk manageable before the first checkpoint.

## 5. Iteration Planning and Agile Management

### 5.1 Iteration Plan

- Iteration 1: requirements finalization + prototype + backlog + project skeleton
- Iteration 2: complete apply/review/status workflow
- Iteration 3: workload dashboard + data quality + stronger tests
- Iteration 4: usability polish + final acceptance preparation

### 5.2 Team Collaboration

- branch-per-task strategy on GitHub
- pull request review for each story
- weekly planning + daily short stand-up
- documented backlog refinement after feedback

## 6. Prototype Summary

The prototype is low/medium fidelity and covers role-based workflows for TA, MO, and Admin.

It includes:

1. TA profile/CV/job browsing pages
2. MO job posting and applicant review pages
3. Admin workload overview concept page

It also shows error and empty states to validate usability and edge-case handling.

Reference document: `docs/prototype-spec-v1.md`

## 7. Reflection and Risks

### 7.1 What Worked Well

1. Role-based decomposition improved scope clarity.
2. Early acceptance criteria reduced ambiguity.
3. Story-to-prototype traceability improved team alignment.

### 7.2 Identified Risks

1. Requirement changes after stakeholder review
2. Inconsistent data schema across modules
3. Integration delays near assessment checkpoints

### 7.3 Mitigation

1. Weekly refinement with explicit change logs
2. Shared JSON schema conventions
3. Integration freeze window before each assessment demo

## 8. Next Iteration Plan

Iteration 2 will implement the end-to-end operational path:

- TA apply for job
- MO review applicants
- MO update status
- TA track updated status

This will deliver the first complete functional workflow for intermediate demo preparation.

## Appendix (Not in Page Limit)

Suggested appendix content:

- interview question list
- survey summary table
- prototype screenshots
- backlog revision history
- GitHub activity evidence
