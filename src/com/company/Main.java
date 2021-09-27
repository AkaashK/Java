package com.company;

import inheritance.SportsCar;
import interfaceExample.IntefaceTest1;

class Employee {
    int empID;
    String name;
    String dept;

    public Employee(int empID, String name, String dept) {
        this.empID = empID;
        this.name = name;
        this.dept = dept;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", Dept='" + dept + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
	    Employee employee = new Employee(001, "Varun", "Business");

        System.out.println(employee.toString());

        SportsCar sportsCar = new SportsCar(1, 30, 20);
        System.out.println("speed = " + sportsCar.speed);

        sportsCar.applyBrake(2);

        System.out.println("speed after applying brake = " + sportsCar.speed);

        sportsCar.changeGear(2);

        System.out.println("Gear position = " + sportsCar.gearPosition);

        IntefaceTest1 intefaceTest1 = new IntefaceTest1();
    }
}
