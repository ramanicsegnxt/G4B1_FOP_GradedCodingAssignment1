package com.greatlearning.groupassignment.departments;

// parent class
public class SuperDepartment {
    final private String name;
    final private String todayWork;
    final private String workDeadline;
    final static private String holidayInfo = "Today is not a holiday";

    // default constructor
    public SuperDepartment() {
        this.name = "Super Department";
        this.todayWork = "No Work as of now";
        this.workDeadline = "Nil";
    }

    /**
     * Parametrized Constructor
     *
     * @param name - name of the department
     * @param todayWork - today's work details
     * @param workDeadline - work deadline information
     */
    protected SuperDepartment(String name, String todayWork, String workDeadline) {
        this.name = name;
        this.todayWork = todayWork;
        this.workDeadline = workDeadline;
    }

    /**
     * Method to return department name
     *
     * @return department name
     */
    public String departmentName() {
        return name;
    }

    /**
     * Method to return Today's Work
     *
     * @return today's work details
     */
    public String getTodaysWork() {
        return todayWork;
    }

    /**
     * Method to return Work Deadline
     *
     * @return work deadline info
     */
    public String getWorkDeadline() {
        return workDeadline;
    }

    /**
     * Method to return holiday information
     *
     * @return holiday information
     */
    public String isTodayAHoliday() {
        return holidayInfo;
    }
}
