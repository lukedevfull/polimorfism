package employees.controller;
import employees.EmployeeModel;
import employees.Manager;
import employees.Saleman;

public class Main {
    public static void main(String[] args) {
        // Employee employee = new Employee();
        printEmployee(new Manager("Manager da silva",
                                "",
                                "M456", 
                                "", 
                                5000.00, 
                                "manager", 
                                "manager123", 
                                3));

        printEmployee(new Saleman("Saleman da silva",
                                "",
                                "S456", 
                                "", 
                                2000.00, 
                                1000.00f));
    }
    public static void printEmployee(EmployeeModel employee) {
        switch (employee) {
            case Manager manager ->  {


            System.out.printf("============%s============\n", employee.getClass().getCanonicalName());

            System.out.println("Code = " + manager.getCode());
            System.out.println("Name = " + manager.getName());
            System.out.println("Salary = " + manager.getSalary());
            System.out.println("Login = " + manager.getLogin());
            manager.setAutoCommission();
            System.out.printf("Comission = %.2f%%\n", (manager.getCommission()) * 100);
            manager.getFullSalary();
            System.out.println("============\n");


            }

            case Saleman saleman -> {

                System.out.printf("============%s============\n", employee.getClass().getCanonicalName());
                System.out.println("Code = " + saleman.getCode());
                System.out.println("Name = " + saleman.getName());
                System.out.println("Salary = " + saleman.getSalary());
                saleman.getFullSalary();
                System.out.println("============\n");
            }
        }
    }

}
