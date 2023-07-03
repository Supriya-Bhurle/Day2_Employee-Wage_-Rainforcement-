package com.bridgelabz;

public class EmployeeWage {
    //static int wagePerHr = 20;
    static int fullTimeHrs = 8;
    static int partTimeHrs = 4;
    //  static int totalWorkingDays = 20;
    //  static int totalWorkingHrs = 100;

    static void computeEmployeeWage(String company, int wagePerHr, int totalWorkingDays, int totalWorkingHrs){
        int totalHrs = 0;
        int days = 0;
        while (totalHrs < totalWorkingHrs && days < totalWorkingDays){
            days++;

            int isPresent = (int) Math.floor(Math.random()*10)%3;
            switch (isPresent){
                case 1:
                    totalHrs += fullTimeHrs;
                    break;
                case 2:
                    totalHrs += partTimeHrs;
                    break;
                default:
                    totalHrs += 0;

            }
        }
        System.out.println("Monthly wage for : " + company + " is " +totalHrs * wagePerHr);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage c1 = new EmployeeWage();
        c1.computeEmployeeWage("TCS",25, 20, 100);
        System.out.println("******************************************");
        c1.computeEmployeeWage("Infosys", 20, 25, 120);


    }

}