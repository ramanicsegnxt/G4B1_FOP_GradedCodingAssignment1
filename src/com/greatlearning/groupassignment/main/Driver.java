package com.greatlearning.groupassignment.main;

import com.greatlearning.groupassignment.departments.AdminDepartment;
import com.greatlearning.groupassignment.departments.HRDepartment;
import com.greatlearning.groupassignment.departments.SuperDepartment;
import com.greatlearning.groupassignment.departments.TechDepartment;

public class Driver {

    /**
     * Displays department information.
     *
     * @param dept - instance of department class
     */
    public static void displayDepartmentDetails(SuperDepartment dept) {
        System.out.println("Welcome to " +  dept.departmentName());
        if (dept.getClass() == HRDepartment.class) {
            System.out.println(((HRDepartment) dept).doActivity());
        }
        System.out.println(dept.getTodaysWork());
        System.out.println(dept.getWorkDeadline());
        if (dept.getClass() == TechDepartment.class) {
            System.out.println(((TechDepartment) dept).getTechStackInformation());
        }
        System.out.println(dept.isTodayAHoliday());
        System.out.println();
    }

    public static void main(String[] args) {
        // creating instance of admin department class
        AdminDepartment admin = new AdminDepartment();

        // creating instance of hr department class
        HRDepartment hr = new HRDepartment();

        // creating instance of tech department class
        TechDepartment tech = new TechDepartment();

        // calling methods to display department details
        displayDepartmentDetails(admin);
        displayDepartmentDetails(hr);
        displayDepartmentDetails(tech);
    }
}
