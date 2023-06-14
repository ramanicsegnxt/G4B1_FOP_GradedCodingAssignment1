package com.greatlearning.groupassignment.departments;

public class AdminDepartment extends SuperDepartment {
    // default constructor
    public AdminDepartment() {
        // calls super class constructor i.e. Super Department
        super("Admin Department", "Complete your documents Submission",
                "Complete by EOD");
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
}
