package org.example.apps.crud_scan_collection;

import javax.persistence.*;

@Entity
@Table(name= "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idNum;

    private String name;
    private String profession;
    private int salary;

    public Employee() {
    }

    public Employee(int idNum, String name, String profession, int salary) {
        this.idNum = idNum;
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee -> " +
                "ID: " + idNum +
                ", Name: " + name +
                ", Profession: " + profession +
                ", Salary: " + salary;
    }
}
