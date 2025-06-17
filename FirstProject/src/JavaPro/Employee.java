package JavaPro;

import java.time.LocalDate;

public class Employee {

    String name;
    int age;
    Double salary;
    String gender;
    String dept;
    LocalDate joiningdate;


    public Employee(String name, double salary, String dept, int age, String gender, LocalDate joiningdate) {

        this.name= name;
        this.salary= salary;
        this.dept=dept;
        this.age=age;
        this.gender=gender; 
        this.joiningdate=joiningdate;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getDept() {
        return dept;
    }


    public void setDept(String dept) {
        this.dept = dept;
    }


    public LocalDate getJoiningdate() {
        return joiningdate;
    }


    public void setJoiningdate(LocalDate joiningdate) {
        this.joiningdate = joiningdate;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + ", dept="
                + dept + ", joiningdate=" + joiningdate + "]";
    }


    
    
}
