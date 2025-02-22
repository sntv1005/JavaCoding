public class ThreeNumbers {
    
    public static void main(String[] args) {
        int arr[]={10,20,30,40,400,12,13};
        int frst= Integer.MIN_VALUE;
        int sec= Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;

      for( int x: arr){
        if(x>frst){
            third= sec;
            sec=frst;
            frst=x;
        }
        else if(x >sec && x!= frst){
            third=sec;
            sec=x;
        }else if (x > third && x != frst && x != sec){
            third=x;
        }
      }
      System.out.println(frst+"  "+sec+"  "+third);
    }
}
