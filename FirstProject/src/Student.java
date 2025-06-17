import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {

    public static void main(String[] args) {
        
        List<School> students= new ArrayList<>();  
    
        students.add(new School ( "Srinath", 101, "Male", 38.75, 10));
        students.add(new School ( "Radha", 103, "Female", 48.25, 10));
        students.add(new School ( "Ram", 108, "Male", 38.75, 10));
        students.add(new School ( "Srinath", 101, "Male", 38.75, 10));
        students.add(new School ( "Radha", 103, "Female", 48.25, 10));
        students.add(new School ( "Sich", 102, "Female", 38.75, 10));


       School stu = students.stream().max((a,b)-> Double.compare(a.getMarks(), b.getMarks())).get();
       System.out.println("The max marks of test By : "+stu.getStudentName() + " and marks scored is : "+stu.getMarks());

       List<School> stuList = students.stream().filter(a-> a.getGender().equals("Male")).collect(Collectors.toList());
       System.out.println(stuList);

      School maxMarksFemale=  students.stream().filter(a-> a.getGender().equals("Female")).distinct().max((a,b)-> Double.compare(a.getMarks(), b.getMarks())).get();
      System.out.println(maxMarksFemale);
   
    }

}