package com.greatlearning.groupassignment.departments;

public class TechDepartment extends SuperDepartment {
    final private String techStackInfo;

    // default constructor
    public TechDepartment() {
        // calls super class constructor i.e. Super Department
        super("Tech Department", "Complete coding of module 1",
                "Complete by EOD");
        this.techStackInfo = "Core Java";
    }

    @Override
    public String departmentName() {
        return super.departmentName();
    }

    @Override
    public String getTodaysWork() {
        return super.getTodaysWork();
    }

    @Override
    public String getWorkDeadline() {
        return super.getWorkDeadline();
    }

    /**
     * Method to return tech stack information
     *
     * @return tech stack information
     */
    public String getTechStackInformation() {
        return techStackInfo;
    }
}
