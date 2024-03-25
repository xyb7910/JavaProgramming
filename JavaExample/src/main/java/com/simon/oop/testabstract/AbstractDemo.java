package com.simon.oop.testabstract;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("Alice", "Shanghai", 100000);
        Employee employee = new Salary("Bob", "Beijing", 100000);

        System.out.println(salary.computePay());
        employee.maikCheck();
    }
}
