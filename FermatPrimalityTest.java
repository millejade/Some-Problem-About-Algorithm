import java.util.Scanner;

public class FermatPrimalityTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        long i = n - 1;
        while(i > 0){
            long expo = (long) Math.pow(i, n);
            if(expo % n != i){
                System.out.println("Not prime!");
                break;
            }
            
            i--;
            
        }
        
        if(i == 0) System.out.println("Prime number");
        
    }
    
}
