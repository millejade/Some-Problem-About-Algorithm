import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       System.out.println(palindrome(str));
       
        
    }
    
    public static String removeNonAlpha(String str){
        
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        return str;

    }
    
    public static boolean palindrome(String str){
        
        str = removeNonAlpha(str);
        
            int i = 0;
            
            for(int j = str.length() - 1; j >= 0; j--){
                if(str.charAt(i) == str.charAt(j)) i++;
                else return false;
            }
            
        return true;
    
    }
    
}
