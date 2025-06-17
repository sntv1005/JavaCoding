package com.example.JavaCodingPractice.EmployeeManagement;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeData {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Alice", "HR", 55000, LocalDate.of(2022, 1, 10)),
                new Employee(102, "Bob", "IT", 70000, LocalDate.of(2021, 3, 5)),
                new Employee(103, "Charlie", "IT", 65000, LocalDate.of(2023, 2, 12)),
                new Employee(104, "David", "Finance", 60000, LocalDate.of(2020, 7, 22)),
                new Employee(105, "Eve", "HR", 52000, LocalDate.of(2022, 11, 18))
        );
        //All Employees
        allEmployeeList(employeeList);
        sortBySalaryDescending(employeeList);
        sortBySalaryAscending(employeeList);
        filterSalary(employeeList);
        groupByDepartment(employeeList);
        averageSalaryByDepartment(employeeList);
        highestPaidEmployee(employeeList);
        sortEmployeesByName(employeeList);
        employeeWithHighestSalary(employeeList);
        countOfEmployeesInEachDepartment(employeeList);
        toatlSalaryOfAll(employeeList);
        totalAverageOfAll(employeeList);
        duplicateEmployeeNames(employeeList);
        secondHighestSalary(employeeList);
        filterBySalaryAndDpeartent(employeeList);
        employeeNamesAsCSV(employeeList);
        salaryThreshold(employeeList);


    }

    private static void salaryThreshold(List<Employee> employeeList) {
        Map<Boolean, List<Employee>> partitioned = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 60000));
        System.out.println("Employees with salary > " + 60000 + ": " + partitioned.get(true));
        System.out.println("Employees with salary <= " + 60000 + ": " + partitioned.get(false));
    }

    private static void employeeNamesAsCSV(List<Employee> employeeList) {
      String names =   employeeList.stream().map(Employee::getName).collect(Collectors.joining(" ,"));
      System.out.println("eployees as CSv : "+names);
    }

    private static void filterBySalaryAndDpeartent(List<Employee> employeeList) {
        List<Employee> ep = employeeList.stream().filter(e-> e.getDepartment().equals("IT") && e.getSalary()>60000).toList();
        System.out.println("filtered based on department and salary "+ep);
    }


    private static void secondHighestSalary(List<Employee> employeeList) {
        Employee ep  = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println("second highest salary is :" +ep);
    }

    private static void duplicateEmployeeNames(List<Employee> employeeList) {
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")"));

    }

    private static void totalAverageOfAll(List<Employee> employeeList) {
        Double totalAverage= employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("total average is : "+totalAverage);
    }

    private static void toatlSalaryOfAll(List<Employee> employeeList) {
        Double totalSalary = employeeList.stream().map(Employee::getSalary).reduce((a,b)-> a+b).get();
        System.out.println("total salary is : " +totalSalary);
    }

    private static void countOfEmployeesInEachDepartment(List<Employee> employeeList) {
        Map<String, Long> eachDepartentCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("each department employee count is : "+ eachDepartentCount);
    }

    private static void employeeWithHighestSalary(List<Employee> employeeList) {
       Employee emp =  employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
       System.out.println("employee who is getting more salary is : "+emp);
    }

    private static void sortEmployeesByName(List<Employee> employeeList) {
        List<Employee> sortByName = employeeList.stream().sorted(Comparator.comparing(Employee :: getName)).toList();
        System.out.println("EmployeeNae sorted :" +sortByName);
    }

    private static void sortBySalaryDescending(List<Employee> employeeList) {
        List<Employee> employeeListInDescendingOrder = employeeList.stream()
                                                            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                            .toList();
        System.out.print("employeeListInDescending order : "+employeeListInDescendingOrder);
        System.out.println();
    }

    private static void sortBySalaryAscending(List<Employee> employeeList) {
        List<Employee> empList = employeeList.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).collect(Collectors.toList());
        System.out.print("employee list in Acsending order : " +empList);
        System.out.println();
    }

    private static void filterSalary(List<Employee> employeeList) {
       List<Employee> employeeSalaryMorehan65000=  employeeList.stream().filter(e-> e.getSalary() > 65000).toList();
       System.out.print("employee who is getting more salary than 65000 : "+employeeSalaryMorehan65000);
       System.out.println();
    }

    private static void groupByDepartment(List<Employee> employeeList) {
        Map<String, List<Employee>> listOfEmployeesInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.toList()));
        System.out.println("employees in each department" +listOfEmployeesInEachDepartment);
        System.out.println();
    }

    private static void averageSalaryByDepartment(List<Employee> employeeList) {
        Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("average salary in each deprartment : "+averageSalary);
        System.out.println();
    }

    private static void highestPaidEmployee(List<Employee> employeeList) {
        Map<String, Optional<Employee>> maxSalaryInEachDepartment= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(maxSalaryInEachDepartment);
        System.out.println();
    }

    private static void allEmployeeList(List<Employee> employeeList) {
        employeeList.stream().forEach(System.out::println);
        System.out.println();
    }
}
