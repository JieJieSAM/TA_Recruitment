# Prototype Specification v1 (Iteration 1)

## 1. Purpose

This prototype communicates the intended user workflow and UI structure before full implementation.

It supports first assessment goals:
- demonstrate functionality coverage at low/medium fidelity
- collect early user feedback
- validate backlog priority and story scope

## 2. Fidelity and Format

- Fidelity: low to medium
- Suggested tools: Figma, Balsamiq, or draw.io
- Submission artifact: `Prototype_groupXXX.pdf`

## 3. Constraints Reflected in Prototype

1. Roles: TA, MO, Admin
2. Java Servlet/JSP style page navigation (simple forms/tables)
3. File-based data concept (no database management screens)
4. Focus on core flow over visual polish

## 4. Screen List (Minimum)

### Shared
1. Login / Role selection page
2. Home dashboard (role-based links)

### TA Screens
1. TA profile form
2. CV upload/reference form
3. Job list + search/filter
4. Job application confirmation
5. Application status list

### MO Screens
1. Job posting form
2. Job management list
3. Applicant list per job
4. Status update action panel

### Admin Screens
1. Workload summary dashboard
2. Export summary action page

## 5. Key User Flows

### Flow A: TA Applies for a Job
1. TA logs in
2. TA completes profile and CV reference
3. TA browses job list
4. TA opens job details and submits application
5. TA checks status page

### Flow B: MO Processes Applications
1. MO logs in
2. MO creates job posting
3. MO opens applicant list
4. MO updates status (SHORTLISTED/REJECTED/OFFERED)

### Flow C: Admin Reviews Workload
1. Admin logs in
2. Admin opens workload dashboard
3. Admin reviews over-threshold flags
4. Admin exports CSV/JSON summary

## 6. Prototype Validation Checklist

1. Every P0 story has at least one corresponding screen.
2. Navigation between screens is clear and testable.
3. Error states are shown for missing required input.
4. Role permissions are visible in UI behavior.
5. Status updates are reflected in TA-facing views.

## 7. Planned Feedback Collection

Stakeholder feedback questions:
1. Are the role workflows complete for real recruitment tasks?
2. Are form fields sufficient and understandable?
3. Is status naming clear to both TA and MO?
4. Is workload summary useful for admin decisions?

Output from feedback:
- prioritized change list
- revised backlog items
- updates to acceptance criteria

## 8. Out-of-Scope for Iteration 1 Prototype

1. Advanced UI styling and animation
2. Complex AI recommendation details
3. Full reporting/export customization
4. Performance tuning and security hardening
