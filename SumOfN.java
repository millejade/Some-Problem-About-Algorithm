import java.util.Scanner;

public class SumOfN {

 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int input = s.nextInt();
        
        System.out.println(sum(input));
    }
    
    public static int sum(int input){
    
        int sum = (input * (2 + (input - 1)))/2;
        
        return sum;
    }
    
}
