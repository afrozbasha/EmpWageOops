package com.EmpWageOps;
import java.util.Random;


class EmpWage {
    private static final int FULLDAYHR = 8, PARTTIMEHR = 4;
    private static int totalMonthWage = 0;
    static int checkEmp;
    static int totalHrCount = 0;

    private int wageHr;
    private int workDaysLimit;
    private int hrLimit;

    public void setVariables(int x, int y, int z){
        this.wageHr = x;
        this.workDaysLimit = y;
        this.hrLimit = z;
    }

    public static void setCheckEmp(){
        Random rdm = new Random();
        int rd = rdm.nextInt(3);
        checkEmp = rd;
    }

    public void  setTotalMonthWage(){
        int day=0;
        while (workDaysLimit>0){
            setCheckEmp();
            switch (checkEmp){
                case 1:
                    totalMonthWage = totalMonthWage + (wageHr * FULLDAYHR);
                    totalHrCount +=  FULLDAYHR;
                    workDaysLimit--;
                    day++;
                    System.out.println("Day:"+day+"  Wage : "+totalMonthWage+" Working Hrs : "+totalHrCount);
                    break;
                case 2:
                    totalMonthWage = totalMonthWage + (wageHr * PARTTIMEHR);
                    totalHrCount += PARTTIMEHR;
                    workDaysLimit--;
                    day++;
                    System.out.println("Day:"+day+"  Wage : "+totalMonthWage+" Working Hrs : "+totalHrCount);
                case 3:
                    workDaysLimit--;
                    day++;
                    System.out.print("Day:"+day+"  Wage : "+totalMonthWage+" Working Hrs : "+totalHrCount);
                    System.out.println("<---Employee was Absent");
                default:
                    if (totalHrCount == hrLimit)
                        break;

            }

        }
        System.out.println("\nTotal Wage of the Month : "+totalMonthWage);
        System.out.println("Total Hrs of the Employee : "+totalHrCount);

    }
}

public class Emp {

    public static void main(String[] args) {

        EmpWage ibm = new EmpWage();
        System.out.println("Employee Wage for 'IBM': ");
        ibm.setVariables(450, 25, 150);
        ibm.setTotalMonthWage();

        EmpWage tcs = new EmpWage();
        System.out.println("Employee Wage for 'TCS': ");
        tcs.setVariables(380, 23, 150);
        tcs.setTotalMonthWage();

        EmpWage hcl = new EmpWage();
        System.out.println("Employee Wage for 'HCL': ");
        hcl.setVariables(320, 20, 150);
        hcl.setTotalMonthWage();
    }
}
