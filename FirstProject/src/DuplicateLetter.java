public class DuplicateLetter {
    
    public static void main(String[] args) {
        
        String str ="Srihgaath";
duplicateLetter(str);

    }
    static void duplicateLetter(String str){

        
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                char ch[] = str.toCharArray();
                if(ch[i]== ch[j]){
                    System.out.println(ch[i]);
                }
                
            }
        }
    }
}
