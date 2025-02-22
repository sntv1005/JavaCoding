package JavaPro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeData {
    

    public static void main(String[] args) {
        
        List<Employee> employeeList= new ArrayList<>();

        employeeList.add(new Employee("John Doe", 60000.0, "IT", 30, "Male", LocalDate.of(2019, 5, 15)));
        employeeList.add(new Employee("Jane Smith", 70000.0, "HR", 28, "Female", LocalDate.of(2020, 8, 22)));
        employeeList.add(new Employee("Robert Johnson", 80000.0, "Finance", 35, "Male", LocalDate.of(2018, 3, 10)));
        employeeList.add(new Employee("Emily Davis", 55000.0, "Marketing", 25, "Female", LocalDate.of(2021, 1, 5)));
        employeeList.add(new Employee("Michael Brown", 75000.0, "Engineering", 32, "Male", LocalDate.of(2017, 11, 18)));
        employeeList.add(new Employee("Alice Miller", 72000.0, "Sales", 29, "Female", LocalDate.of(2019, 9, 8)));
        employeeList.add(new Employee("David Wilson", 68000.0, "IT", 31, "Male", LocalDate.of(2020, 4, 30)));
        employeeList.add(new Employee("Sophia Davis", 85000.0, "Finance", 28, "Female", LocalDate.of(2018, 7, 12)));
        employeeList.add(new Employee("Henry Johnson", 60000.0, "Engineering", 27, "Male", LocalDate.of(2022, 2, 15)));
        employeeList.add(new Employee("Olivia Brown", 67000.0, "Marketing", 26, "Female", LocalDate.of(2021, 6, 25)));
        employeeList.add(new Employee("Ethan Smith", 78000.0, "Sales", 33, "Male", LocalDate.of(2017, 12, 5)));
        employeeList.add(new Employee("Ava Wilson", 59000.0, "HR", 24, "Female", LocalDate.of(2019, 10, 20)));
        employeeList.add(new Employee("Liam Davis", 71000.0, "Engineering", 30, "Male", LocalDate.of(2018, 1, 8)));
        employeeList.add(new Employee("Mia Johnson", 73000.0, "IT", 34, "Female", LocalDate.of(2020, 3, 22)));
        employeeList.add(new Employee("Noah Miller", 69000.0, "Finance", 32, "Male", LocalDate.of(2017, 8, 14)));
    
    
       long count =  employeeList.stream().count();
       System.out.println("total employees are :"+count);
       Map<String,Long> map = employeeList.stream()
                                .map(Employee::getGender)
                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println("Total emloyees based on gender "+map);

       Map<String,Optional<Employee>> maxx= employeeList.stream()
       .collect(Collectors.groupingBy(
           Employee::getGender, 
           Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
       ));
    //    System.out.println("MAximum salary based on gender : "+maxx);


      
    Optional<Employee> emp = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        // System.out.println("maximun salary is :"+emp);


        Map<Integer, List<Employee>>list = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        // System.out.println("grouping by for age :"+list);

        Map<String,Long> eachGenderCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        // System.out.println("count of each gender"+eachGenderCount);

        List<String> ll = employeeList.stream( ).map(Employee::getDept).collect(Collectors.toList());
        // System.out.println("list of departments: "+ll);
        Map<String, Map<String, Long>> genderCountByDept = employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDept, 
            Collectors.groupingBy(Employee::getGender, Collectors.counting())));

            // System.out.println(genderCountByDept);


            Map<String, Map<String,Long>> emmm= employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getDept,
                   Collectors.groupingBy(Employee::getGender, Collectors.counting())));

                //    System.out.println(emmm);


                Map<String,Optional<Employee>> ala= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors
                .maxBy(Comparator.comparingDouble(Employee::getSalary)) ));
                // System.out.println(ala);


                Map<String,Optional<Employee> >shs = employeeList.stream()
                .collect(Collectors
                .groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));

                // System.out.println(shs);
                Map<String,Double> abag =employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                 Collectors.averagingInt(Employee::getAge)));
                //  System.out.println("Vaergae age of employees based on gender :"+abag);

                Map<String, Long> mo = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
                // System.out.println("number of employees in each dept : "+mo);

                Employee empp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();

                // System.out.println("oldest employee"+empp);

                Map<String, Optional<Employee>> oldestInEachDept= employeeList.stream().collect(Collectors
                .groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
                // System.out.println("oldest employee in each dept: "+ oldestInEachDept);

                Map<String, Optional<Employee>> youngestInGender= employeeList.stream().collect(Collectors
                .groupingBy(Employee::getGender, Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
                // System.out.println("youngest based on gender:"+youngestInGender);

                Optional<Employee> youngestFemale = employeeList.stream().filter(e->e.getGender().equalsIgnoreCase("Female")).min(Comparator.comparingInt(Employee::getAge));
                System.out.println(youngestFemale);


    }


}
