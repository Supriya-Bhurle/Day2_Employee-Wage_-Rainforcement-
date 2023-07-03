package com.bridgelabz;

public class EmployeeWage {
    private int Wage_Per_Hour ;
    static final int Full_Time_Hour = 8;
    static final int Part_Time_Hour = 4;
    static final int Is_Part_Time_Hour = 1;
    static final int Is_Full_Time_Hour = 2;
    private int Working_Days_Per_Month;
    private int Working_Hours_Per_Month;

    public EmployeeWage(int wage_Per_Hour, int working_Days_Per_Month, int working_Hours_Per_Month) {
        Wage_Per_Hour = wage_Per_Hour;
        Working_Days_Per_Month = working_Days_Per_Month;
        Working_Hours_Per_Month = working_Hours_Per_Month;
    }

    public int calculateWage(){
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
        System.out.println("Total Wage Of Employee for Month is => "+totalWage);
        System.out.println("Total Wage Of Employee for day is => "+day);
        System.out.println("Total Working hour  for Month is => "+workingHours);
        return totalWage;
    }


    public static void main(String[] args) {
        EmployeeWage Company1=new EmployeeWage(40,26,120);
        int TCS=Company1.calculateWage();
        System.out.println("Total Wage For TCS Company is: "+ TCS);
        EmployeeWage Company2=new EmployeeWage(90,28,145);
        int Tata =Company2.calculateWage();
        System.out.println("Total Wage For Tata Company is: "+ Tata);
    }

}