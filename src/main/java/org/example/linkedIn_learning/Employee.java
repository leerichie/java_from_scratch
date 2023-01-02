package org.example.linkedIn_learning;

public class Employee {
    private String name;
    private int age;
    private Location location;
    private double salary;
    private Job job;
    private CurrencyCode currencyCode;

    public enum Job{
        TEACHER,
        PROGRAMMER,
        LIBRARIAN,
        DIRECTOR,
        TECHNICIAN,
        ENGINEER,
        COURIER,
        INSTRUCTOR;
    }

    public enum Location{
        OLSZTYN,
        GDANSK,
        WARSAW,
        WROCLAW,
        TORUN,
        BIALYSTOK;
    }
    public enum CurrencyCode{
        GBP,
        PLN,
        USD,
        EUR;
    }

    public Employee(String name, int age, Location location, double salary, Job job, CurrencyCode currencyCode) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.salary = salary;
        this.job = job;
        this.currencyCode = currencyCode;
    }
    public void raiseSalary(){
        this.salary = salary * 1.5;
    }
    public void announceSalary(){
        if (salary <= 50000){
            System.out.println("Low salary");
        } else if (salary > 50000 && salary <= 75000){
            System.out.println("Average salary");
        } else if (salary > 75000 && salary < 100000){
            System.out.println("High salary");
        } else {
            System.out.println("You're a millionaire!");
        }
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Location getLocation() {
        return location;
    }

    public Job getJob() {
        return job;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                ", salary=" + salary +
                ", job=" + job +
                ", currencyCode=" + currencyCode +
                '}';
    }
}
