package Java8;

import java.util.*;

public class collectionsFramework {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();
        v.add(1);;
        v.add(2);
        v.add(3);
        System.out.println(v);

        v.remove(1);
        System.out.println(v);
        

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Sri");
        map.put(1, "Srinu");
        map.put(null, "null");
        map.put(12, "Ano");
        map.put(null, "null");
        map.put(122, null);
        map.put(1222, null);
        System.out.println(map);
    
    }
    
}
