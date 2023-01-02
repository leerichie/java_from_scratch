package org.example.linkedIn_learning;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee empOne = new Employee("Lee Richie", 32, Employee.Location.OLSZTYN, 50000, Employee.Job.TEACHER, Employee.CurrencyCode.PLN);
        Employee empTwo = new Employee("Ani Jesi", 28, Employee.Location.TORUN, 80000, Employee.Job.DIRECTOR, Employee.CurrencyCode.GBP);

        System.out.println(empOne.getName() + " " + empOne.getSalary() + " " + empOne.getCurrencyCode()); // before raise
        empOne.announceSalary();
        empOne.raiseSalary();
        System.out.println(empOne.getName() + " " + empOne.getSalary() + " " + empOne.getCurrencyCode()); // after raise
        empOne.announceSalary();

        System.out.println(empTwo); // before raise
        empTwo.announceSalary();
        empTwo.raiseSalary();
        System.out.println(empTwo); // after raise
        empTwo.announceSalary();






    }
}
