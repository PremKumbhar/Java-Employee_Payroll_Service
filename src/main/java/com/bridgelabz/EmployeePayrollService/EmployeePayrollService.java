package com.bridgelabz.EmployeePayrollService;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    private ArrayList<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService()
    {
        employeePayrollList = new ArrayList<EmployeePayroll>();
    }

    public static void main(String[] args) {
        System.out.println("Employee payroll service program");
        ArrayList<EmployeePayroll> employeePayrollsList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmployeePayrollData();
        employeePayrollService.writeEmployeePayrollData();
    }

    public void readEmployeePayrollData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id :");
        int id = sc.nextInt();
        System.out.println("Enter employee name : ");
        String name = sc.next();
        System.out.println("Enter employee salary : ");
        double salary = sc.nextDouble();
        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }
    public void writeEmployeePayrollData(){
        System.out.println("writing employee payroll data on console :");
        System.out.println(employeePayrollList);
    }
    public static boolean deleteFiles(File contentsToDelete) {
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null){
            for (File file : allContents){
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }

}
