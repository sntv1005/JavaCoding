public class SingleThread {

    public static void main(String[] args) {
        
        Thread t = Thread.currentThread();
        t.setPriority(1);
        t.setName("SIngle Thread");
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
    
}
