public class ReverseString {

    public static void main(String[] args) {
        
        String str= "srinath";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    
}
