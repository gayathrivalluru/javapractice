package com.acro.emp;

public class Employee {

    String name;
    int age;
    float salary;
    String gender;


    public void save() {

    }

    public void display(){
        System.out.println("hello");

    }

    public float getSalary(){

        return this.salary;
    }



    public static void main(String[] args){
        Employee employee = new Employee();
        employee.display();
    }
}
