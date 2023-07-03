package com.bridgelabz;

public class EmployeeWage {
    CompanyBuildWage [] record;
    static final int Full_Time_Hour = 8;
    static final int Part_Time_Hour = 4;
    static final int Is_Part_Time_Hour = 1;
    static final int Is_Full_Time_Hour = 2;
    int noOfCompany;
    public EmployeeWage() {
        record = new CompanyBuildWage[5];
    }
    public void addCompany(int workingDaysPerMonth, int workingHoursPerMonth, int wagePerHour, String companyName){
        CompanyBuildWage empWage=new CompanyBuildWage(  workingDaysPerMonth, workingHoursPerMonth, wagePerHour, companyName);
        empWage.setTotalWage(calculateWage( workingDaysPerMonth, workingHoursPerMonth, wagePerHour));
        record[noOfCompany]=empWage;
        noOfCompany++;
    }
    public int calculateWage(int Wage_Per_Hour, int Working_Days_Per_Month, int Working_Hours_Per_Month){
        int day = 1;
        int totalWage = 0;
        int workingHours=0;
        while (day < Working_Days_Per_Month && workingHours<Working_Hours_Per_Month) {
            int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeAttendance);
            int dailyWage=0;
            switch (employeeAttendance) {

                case Is_Full_Time_Hour:
                    System.out.println("Employee is Present");
                    dailyWage = Wage_Per_Hour * Full_Time_Hour;
                    workingHours+=Full_Time_Hour;
                    System.out.println("Employee Daily Wage Is " + dailyWage);
                    break;
                case Is_Part_Time_Hour:
                    dailyWage = Wage_Per_Hour * Part_Time_Hour;
                    workingHours+=Part_Time_Hour;
                    System.out.println("Employee is Part Time");
                    System.out.println("Employee Daily Wage Is " + dailyWage);
                    break;
                default:
                    System.out.println("Absent");
            }
            totalWage= totalWage + dailyWage;
            day++;
        }
        System.out.println("Total Wage Of Employe for Month is => "+totalWage);
        System.out.println("Total Wage Of Employe for day is => "+day);
        System.out.println("Total Working hour  for Month is => "+workingHours);
        return totalWage;
    }


    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompany(20, 200, 70, "TAta");
        employeeWage.addCompany(26, 200, 60, "TCS");
        for (int i = 0; i < employeeWage.noOfCompany; i++) {
            System.out.println(employeeWage.record[i].getCompanyName() + " : " + employeeWage.record[i].getTotalWage());

        }
    }}