package com.bupt.tarecruitment.domain;

public class JobPosting {
    private String id;
    private String moduleCode;
    private String title;
    private int hoursPerWeek;

    public JobPosting() {
    }

    public JobPosting(String id, String moduleCode, String title, int hoursPerWeek) {
        this.id = id;
        this.moduleCode = moduleCode;
        this.title = title;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
