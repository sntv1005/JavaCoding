public class Product {

    private String name;
    private Double salary;
    private String dept;
    private String id;

    public Product() {
    }

    public Product(String name, double salary, String dept, String id) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getDept() {
        return dept;
    }

    void setDept(String dept) {
        this.dept = dept;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    // Add toString method
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
