import java.util.Scanner;

public class CaesarCipher {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        int shift =  s.nextInt();
        
        System.out.println(shifter(str, shift));
        
        
        
    }

    @SuppressWarnings("empty-statement")
    private static StringBuilder shifter(String str, int shift) {
 
        StringBuilder out = new StringBuilder();
        int start = 97;
        for(int i = 0; i < str.length(); i++){

            char c;
            int ascii = str.charAt(i); //decimal number in ASCII
            //System.out.println(ascii);
            
            if(ascii >= 122 - shift){ //if shifting the character will result to out of bounds
                ascii = start++;
                c = (char) (ascii);
                out.append(c);
            }else if(ascii == 32){ //if the character is a  'space'
                out.append(" ");
            }else{
                c = (char)(ascii + 4);
                out.append(c);
            }
   
        }

        return out;
        
    }
    
}
