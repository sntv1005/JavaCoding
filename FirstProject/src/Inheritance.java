public class Inheritance {

    private int num;
    private String salary;
    public Inheritance(){}
    
    void setNum(int num){

        this.num=num;
    }
    public int getNum(){
        return num;
    }

    void setSalary(String salary){
        this.salary=salary;
    }
    String getSalary(){
        return salary;
    }
    public void call(){
        System.out.println("this is call method");
    }
    public void message(){
        System.out.println("this is message method");
    }

    public void calculateSalary(){
        String sal= "123455";
        System.out.println("Salary is :"+sal);
    }
}

