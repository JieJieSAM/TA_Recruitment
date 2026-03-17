# Product Backlog v1 (Iteration 1 Baseline)

This backlog is the first workable version for the first assessment on **22 March 2026**.

## Priority Legend

- P0: Must-have for core workflow demo
- P1: Should-have for better completeness
- P2: Could-have after core stability

## Team Owner Assumption

Owner names below use placeholders (`Member A` to `Member F`) and should be replaced by real team member names.

## Backlog Table

| Backlog ID | Story ID | Item | Priority | Story Points | Owner | Iteration | Status |
|---|---|---|---|---:|---|---|---|
| PB-01 | TA-01 | Create applicant profile | P0 | 5 | Member A | Iteration 1 | Planned |
| PB-02 | TA-02 | Upload CV metadata/reference | P1 | 3 | Member A | Iteration 1 | Planned |
| PB-03 | TA-03 | Search available jobs | P0 | 5 | Member B | Iteration 1 | Planned |
| PB-04 | TA-04 | Apply for a job | P0 | 8 | Member B | Iteration 2 | Planned |
| PB-05 | TA-05 | Track application status | P0 | 5 | Member C | Iteration 2 | Planned |
| PB-06 | MO-01 | Post job | P0 | 8 | Member D | Iteration 1 | Planned |
| PB-07 | MO-02 | Review applicants | P0 | 8 | Member D | Iteration 2 | Planned |
| PB-08 | MO-03 | Update application status | P0 | 5 | Member C | Iteration 2 | Planned |
| PB-09 | AD-01 | View workload dashboard | P1 | 8 | Member E | Iteration 3 | Planned |
| PB-10 | AD-02 | Export workload summary | P1 | 5 | Member E | Iteration 3 | Planned |
| PB-11 | NFR-01 | Input validation and error messages | P0 | 5 | Member F | Iteration 2 | Planned |
| PB-12 | NFR-02 | File storage consistency (JSON schema rules) | P0 | 5 | Member F | Iteration 2 | Planned |
| PB-13 | NFR-03 | Unit tests for service layer | P1 | 5 | Member C | Iteration 3 | Planned |
| PB-14 | NFR-04 | User manual draft with screenshots | P1 | 3 | Member A | Iteration 4 | Planned |
| PB-15 | AI-01 | Skill match recommendation (explainable) | P2 | 8 | Member B | Iteration 4 | Planned |
| PB-16 | AI-02 | Missing skills advice | P2 | 5 | Member E | Iteration 4 | Planned |

## Iteration 1 Commitment (First Assessment Focus)

Committed items for Iteration 1:
- PB-01, PB-02, PB-03, PB-06
- Deliverables: product backlog + prototype + brief report + initial GitHub evidence

Stretch items (if capacity allows):
- Prototype interaction refinement for TA apply flow
- Initial validation messages for profile/job forms

## Dependencies and Risks

1. PB-04 depends on PB-01 and PB-06.
2. PB-07 and PB-08 depend on PB-04.
3. AD module depends on stable status and assignment data format.
4. Risk: ambiguous requirement details from stakeholders.
5. Mitigation: conduct structured interviews and refine acceptance criteria in each sprint review.

## Definition of Done (DoD) for Iteration 1 Items

1. Story acceptance criteria are testable and reviewed.
2. Prototype screens exist for each committed user flow.
3. Work tracked via branch + PR + commits on GitHub.
4. Documentation updated in `docs/`.
