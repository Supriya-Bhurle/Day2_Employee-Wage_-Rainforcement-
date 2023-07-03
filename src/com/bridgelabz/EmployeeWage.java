package com.bridgelabz;

public class EmployeeWage {
    static final int Wage_Per_Hour = 20;
    static final int Full_Time_Hour = 8;
    static final int Part_Time_Hour = 4;
    static final int Is_Part_Time_Hour = 1;
    static final int Is_Full_Time_Hour = 2;
    static final int Working_Days_Per_Month = 20;

    static int employeeAttendance() {
        int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
        return employeeAttendance;
    }

    static int switchCase() {
        int day = 1;
        int totalWage = 0;
        while (day <= Working_Days_Per_Month) {
            int dailyWage = 0;
            int employeeAttendanceCheck = employeeAttendance();
            System.out.println(employeeAttendanceCheck);
            switch (employeeAttendanceCheck) {
                case Is_Full_Time_Hour:
                    System.out.println("Employee is Present");
                    dailyWage = Wage_Per_Hour * Full_Time_Hour;
                    break;
                case Is_Part_Time_Hour:
                    dailyWage = Wage_Per_Hour * Part_Time_Hour;
                    System.out.println("Employee is Part Time");
                    break;
                default:
                    System.out.println("Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("daily Wage ==> " + day + " day => " + dailyWage);
            day++;
        }
        System.out.println("Total Wage => " + totalWage);
        return totalWage;
    }


    public static void main(String[] args) {
        int totalWage=switchCase();
        System.out.println(totalWage);
    }

}