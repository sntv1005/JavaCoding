package com.example.JavaCodingPractice.EmployeeManagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

        private int id;
        private String name;
        private String department;
        private double salary;
        private LocalDate joiningDate;

    }
