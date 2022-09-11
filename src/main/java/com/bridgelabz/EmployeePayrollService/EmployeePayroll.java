package com.bridgelabz.EmployeePayrollService;

public class EmployeePayroll {
    private int id;
    private String name;
    private double salary;

    //construtor to get values
    public EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //toString method to read object o/p as string
    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

