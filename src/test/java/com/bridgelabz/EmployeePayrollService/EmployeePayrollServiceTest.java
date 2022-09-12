package com.bridgelabz.EmployeePayrollService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFile_shouldMatchEmployeeEntries(){
        EmployeePayrolFilelOService fileIo = new EmployeePayrolFilelOService();
            List<EmployeePayroll> list = new ArrayList<>();
             list.add(new EmployeePayroll(10,"abc",10000));
             list.add(new EmployeePayroll(20,"pqr",20000));
             list.add(new EmployeePayroll(30,"xyz",30000));

             fileIo.writeDataToFile(list);
             Assertions.assertEquals(3,fileIo.countEntries());

    }
}
