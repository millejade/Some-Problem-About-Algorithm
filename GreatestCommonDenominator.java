import java.util.Scanner;

public class GreatestCommonDenominator {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        int numA = Math.max(num1, num2);
        int numB = Math.min(num1, num2);
        
        while(numA % numB != 0){
            int temp = numB;
            numB = numA % numB;
            numA = temp;
        }
        
        System.out.println(numB);
    }
    
}
