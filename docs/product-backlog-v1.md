# Product Backlog Final v1 (Iteration 1 Release)

This backlog is the final Iteration 1 planning baseline for the first assessment on **22 March 2026**.

## 1. Rules and Methods

- Prioritization method: MoSCoW (`Must`, `Should`, `Could`)
- Estimation method: Story points (Fibonacci style: 3, 5, 8)
- Ownership: one primary owner per item, with team review in PR
- Constraint check: all items comply with Java + file storage + no database

## 2. Backlog Table

| Backlog ID | Story ID | Item | Priority | Story Points | Owner | Iteration | Dependency | Acceptance Ref | Status |
|---|---|---|---|---:|---|---|---|---|---|
| PB-01 | TA-01 | Create applicant profile | Must | 5 | Member A | Iteration 1 | - | AC-TA-01 | Planned |
| PB-02 | TA-02 | Upload CV metadata/reference | Should | 3 | Member A | Iteration 1 | PB-01 | AC-TA-02 | Planned |
| PB-03 | TA-03 | Search available jobs | Must | 5 | Member B | Iteration 1 | PB-06 | AC-TA-03 | Planned |
| PB-04 | TA-04 | Apply for a job | Must | 8 | Member B | Iteration 2 | PB-01, PB-03 | AC-TA-04 | Planned |
| PB-05 | TA-05 | Track application status | Must | 5 | Member C | Iteration 2 | PB-04, PB-08 | AC-TA-05 | Planned |
| PB-06 | MO-01 | Post job | Must | 8 | Member D | Iteration 1 | - | AC-MO-01 | Planned |
| PB-07 | MO-02 | Review applicants | Must | 8 | Member D | Iteration 2 | PB-04 | AC-MO-02 | Planned |
| PB-08 | MO-03 | Update application status | Must | 5 | Member C | Iteration 2 | PB-07 | AC-MO-03 | Planned |
| PB-09 | AD-01 | View workload dashboard | Should | 8 | Member E | Iteration 3 | PB-08 | AC-AD-01 | Planned |
| PB-10 | AD-02 | Export workload summary | Should | 5 | Member E | Iteration 3 | PB-09 | AC-AD-02 | Planned |
| PB-11 | NFR-01 | Input validation and error messages | Must | 5 | Member F | Iteration 2 | PB-01, PB-06 | NFR-AC-01 | Planned |
| PB-12 | NFR-02 | File format consistency and schema rules | Must | 5 | Member F | Iteration 2 | PB-01..PB-10 | NFR-AC-02 | Planned |
| PB-13 | NFR-03 | Unit tests for service/storage layer | Should | 5 | Member C | Iteration 3 | PB-04, PB-08 | NFR-AC-03 | Planned |
| PB-14 | NFR-04 | User manual draft and screenshots | Should | 3 | Member A | Iteration 4 | stable UI | NFR-AC-04 | Planned |
| PB-15 | AI-01 | Skill match recommendation (explainable) | Could | 8 | Member B | Iteration 4 | PB-07 | AC-AI-01 | Planned |
| PB-16 | AI-02 | Missing skills advice | Could | 5 | Member E | Iteration 4 | PB-03 | AC-AI-02 | Planned |

## 3. Iteration 1 Final Commitment

### Committed (Must finish before first assessment)

- PB-01 Create applicant profile
- PB-02 Upload CV metadata/reference
- PB-03 Search available jobs
- PB-06 Post job
- Documentation package completion (stories, backlog, prototype spec, brief report draft)

### Stretch (Do if capacity remains)

- Basic navigation prototype click-through refinement
- Early validation messages for profile/job forms

## 4. Acceptance Reference Map

- `AC-TA-01 ... AC-AI-02`: defined in `iteration1-user-stories.md`
- `NFR-AC-01`: all required fields have validation and user-facing messages
- `NFR-AC-02`: all core entities use agreed JSON structure and ID conventions
- `NFR-AC-03`: smoke test plus at least one positive and one negative test per critical service
- `NFR-AC-04`: setup/run instructions and key page screenshots exist in final manual

## 5. Risk Register (Iteration 1)

| Risk ID | Description | Likelihood | Impact | Mitigation |
|---|---|---|---|---|
| R-01 | Requirement ambiguity from stakeholders | Medium | High | Structured interviews + weekly backlog refinement |
| R-02 | Team estimate variance in first sprint | High | Medium | Use small tasks and daily sync |
| R-03 | Inconsistent JSON structure across modules | Medium | High | Shared data schema and code review checklist |
| R-04 | Demo instability due to partial integration | Medium | Medium | Freeze demo branch 24h before assessment |

## 6. Definition of Done (DoD)

1. Story acceptance criteria are testable and reviewed by at least one teammate.
2. Linked prototype screens exist for each committed story.
3. GitHub evidence exists (branch, commits, PR discussion, merge).
4. Documentation is updated and traceable (`stories -> backlog -> prototype -> report`).
