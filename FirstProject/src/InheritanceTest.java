public class InheritanceTest extends Inheritance{

    String name= "Srinath";

    public void image(){
        System.out.println("image method");
    }
    public void video(){
        System.out.println("video method");
    }

    public static void main(String[] args) {
        Inheritance inheritance= new Inheritance();
        inheritance.setNum(26);
        System.out.println("num is: "+inheritance.getNum());
        inheritance.call();
        inheritance.calculateSalary();

    }
}