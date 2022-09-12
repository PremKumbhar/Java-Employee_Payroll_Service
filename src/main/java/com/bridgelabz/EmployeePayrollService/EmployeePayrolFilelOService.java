package com.bridgelabz.EmployeePayrollService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrolFilelOService {
    public static String PAYROLL_FILE_NAME = "C:\\Users\\Prathmesh\\IdeaProjects\\EmployeePayrollService\\src\\payroll-file.txt";

    public void writeDataToFile(List<EmployeePayroll> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
