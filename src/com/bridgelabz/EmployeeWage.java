package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    static final  int WORKING_HOURS_PER_MONTH = 100;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("welcome to Employee wage program");
        int totalWage = 0;
        int dayCount = 1;
        int workingHours = 0;

        while (dayCount <=WORKING_DAYS_PER_MONTH &&  workingHours < WORKING_HOURS_PER_MONTH  ) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            int dailyWage = 0;

            switch (employeeCheck) {
                case IS_PART_TIME:
                    dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
                    workingHours += PART_TIME_HOUR;
                    System.out.println("Employee is part time" + dailyWage);
                    break;
                case IS_FULL_TIME:
                    dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                    workingHours +=FULL_DAY_HOUR;
                    System.out.println("Employee is full time " + dailyWage);
                    break;
                default:
                    System.out.println("Employee is absent");
                    break;
            }
            dayCount++;
            totalWage = totalWage + dailyWage;
        }
        System.out.println("Total hours "+ workingHours);
        System.out.println("daily wage for month "+ totalWage);

    }
}
