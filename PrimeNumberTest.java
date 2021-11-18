import java.util.Scanner;
public class PrimeNumberTest {
  
   public static void main(String[] args) {
        int temp;
	      boolean isPrime=true;
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter any number:");
            //capture the input in an integer
            num = scan.nextInt();
        }
	for(int i=2;i<=num/2;i++) //loop until n/2 and check if there's a factor
	{
           temp=num%i;
	   if(temp==0) //if yes, then it's not a prime number
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
    }
    
}
