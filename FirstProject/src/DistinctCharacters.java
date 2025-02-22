public class DistinctCharacters {

    public static void main(String[] args) {
        
        String str= "Geeks for Geeks";
        System.out.println(str);
        str= str.replace(" ", "");
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);


        int count =0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) != str.charAt(i+1)){
                 count++;
                 System.out.print(str.charAt(i));
                //  break;
            }
        }
        System.out.println(count);
    }
    
}
