import java.util.Scanner;

public class CensoredString {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String censored = s.nextLine();
        String missingVowels = s.nextLine();
        
        System.out.println(uncensoring(censored, missingVowels));
    }

    private static StringBuilder uncensoring(String censored, String missingVowels) {
        
        StringBuilder out = new StringBuilder();
        
        char vowels[] = missingVowels.toCharArray();
        char str[] = censored.toCharArray();
        int j = 0;
        for(int i = 0; i < censored.length(); i++){
            
            if(str[i] == '*'){
                str[i] = vowels[j];
                out.append(str[i]);
                j++;
            }else out.append(str[i]);
            
        }
        
        return out;
    }
    
}
