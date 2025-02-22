import java.util.ArrayList;
import java.util.List;

public class ReverseStringg {

    public static void main(String[] args) {
        
        String str= "Srinatha";
        // StringBuilder sb = new StringBuilder(str);
        // System.out.println(sb.reverse());

        // for(int i=str.length();i<0;i--){
        //     System.out.println(str.charAt(i));
        // }

        int[] nums= {1,2,3,4,5,6,7,8};
        int max =0; int secondMax=0; int thirdMax=0;

        for(int x: nums){
            if(x>max){
                secondMax= max;
                thirdMax=secondMax;
                max=x;
 }
 if(x> secondMax && x!= max){
    thirdMax= secondMax;
    secondMax= x;

 }
 if(x != max && x!= secondMax && x>thirdMax){
    thirdMax= x;
 }
        }
        System.out.println(max);
        List<Integer> list = new ArrayList<>();
        list.add(max);
        list.add(secondMax);
        list.add(thirdMax);
        System.out.println(list);
    }
    
}
