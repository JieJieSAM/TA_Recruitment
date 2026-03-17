# TA Recruitment System

Software Engineering group project for **EBU6304**.

## 1. Project Context

This project builds a Teaching Assistant recruitment system for BUPT International School.

Mandatory constraints from the handout:
- Java application (stand-alone or Servlet/JSP web app)
- No database
- Data stored in text formats (e.g., JSON/CSV/XML/TXT)

## 2. Recommended Tech Stack

- Java 17
- Maven
- Jakarta Servlet + JSP (Tomcat 10+)
- JSON files for persistent storage
- JUnit 5 for tests

Why this stack:
- Meets course constraints directly
- Supports clear multi-role workflows (TA/MO/Admin)
- Easy to demo incrementally in Agile iterations
- Simple for branch-based collaboration in a 6-person team

## 3. Core Modules (Iteration Scope)

- Account & Role Management (TA, MO, Admin)
- Applicant Profile & CV metadata
- Job Posting Management
- Job Search & Application Submission
- Application Status Tracking
- Candidate Selection (MO side)
- Workload Monitoring (Admin side)
- Optional AI-enhanced matching (rule-based explainable first)

## 4. Repository Structure

```text
TA_Recruitment/
├─ data/                          # JSON data files (no database)
├─ docs/                          # planning, analysis, agile artifacts
├─ src/
│  ├─ main/
│  │  ├─ java/com/bupt/tarecruitment/
│  │  │  ├─ domain/
│  │  │  ├─ repository/
│  │  │  ├─ service/
│  │  │  ├─ storage/
│  │  │  └─ web/
│  │  ├─ resources/
│  │  └─ webapp/
│  │     ├─ WEB-INF/
│  │     └─ pages/
│  └─ test/java/com/bupt/tarecruitment/
├─ .gitignore
├─ pom.xml
└─ README.md
```

## 5. Getting Started

### Prerequisites
- JDK 17
- Maven 3.9+

### Build

```bash
mvn clean package
```

### Run (Tomcat 10)

1. Build WAR:
```bash
mvn clean package
```
2. Deploy `target/ta-recruitment-system.war` to Tomcat 10.

## 6. Agile Delivery Plan (High Level)

- Iteration 1: backlog + prototype + project skeleton + basic navigation
- Iteration 2: core recruitment workflow (post/apply/select/status)
- Iteration 3: workload checks + validation + stronger test coverage
- Iteration 4: UX polishing + acceptance test prep + delivery materials

## 7. Current Status

Initial scaffold completed:
- Maven web project skeleton
- Layered package structure
- Placeholder health servlet and JSP home page
- JSON-based data directory
- Initial project documentation under `docs/`
