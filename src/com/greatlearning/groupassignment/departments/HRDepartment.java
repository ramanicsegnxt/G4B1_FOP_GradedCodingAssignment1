package com.greatlearning.groupassignment.departments;

public class HRDepartment extends SuperDepartment {
    final private String activity;

    // default constructor
    public HRDepartment() {
        // calls super class constructor i.e. Super Department
        super("Hr Department", "Fill today’s timesheet and mark your attendance",
                "Complete by EOD");
        this.activity = "team Lunch";
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
     * Method to return activity of hr department
     *
     * @return activity
     */
    public String doActivity() {
        return activity;
    }
}
