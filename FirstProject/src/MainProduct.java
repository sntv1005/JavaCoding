import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainProduct {
    

    public static void main(String[] args) {
        
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Srinath",12000.00,"HR","EMP001"));
        productList.add(new Product("Sinchiu",24560.00,"Manager","EMP003"));

        productList.add(new Product("Antony",36940.00,"FE","EMP023"));

        productList.add(new Product("Sharath",27362.00,"Manager","EMP024"));

        productList.add(new Product("Ram",83892.00,"TeamLead","EMP014"));
        productList.add(new Product("Radha",28193.00,"HR","EMP0023"));


        List<Product> list = productList.stream().filter(salary->salary.getSalary()<25000.00).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("The Person who is getting more salary is : ");

        Product maxSalary= productList.stream().max( (a,b)-> Double.compare(a.getSalary(), b.getSalary())).get();
        System.out.println(maxSalary.getName());

        Product minsalary = productList.stream().min((a,b)-> Double.compare(a.getSalary(), b.getSalary())).get();
        System.out.println("The person who is getting less salary is : "+minsalary.getName());
    }
}
