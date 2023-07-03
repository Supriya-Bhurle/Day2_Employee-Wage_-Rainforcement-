package com.bridgelabz;

public class CompanyBuildWage {
    private int workingDaysPerMonth;
    private int workingHoursPerMonth;
    private int wagePerHour ;
    private  String companyName;
    private int totalWage;

//    public CompanyBuildWage(String companyName,int working_Days_Per_Month, int working_Hours_Per_Month, int wage_Per_Hour) {
//        this.workingDaysPerMonth = workingDaysPerMonth;
//        this.workingHoursPerMonth = workingHoursPerMonth;
//        this.wagePerHour = wagePerHour;
//        this.companyName = companyName;
//    }


    public CompanyBuildWage(int workingDaysPerMonth, int workingHoursPerMonth, int wagePerHour, String companyName) {
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.wagePerHour = wagePerHour;
        this.companyName = companyName;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    public void setWorkingDaysPerMonth(int workingDaysPerMonth) {
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    public int getWorkingHoursPerMonth() {
        return workingHoursPerMonth;
    }

    public void setWorkingHoursPerMonth(int workingHoursPerMonth) {
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}
