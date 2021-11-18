public class SumOfEvenFibonacci {

    public static void main(String[] args) {
        System.out.println(fib(33)); //terms with value not over 4 million
    }
    
    public static int fib(int n) {
        
        int term = 1;
        int firstTerm = 0; //F(0)
        int secondTerm = 1; //F(1)
        int sum = 0;
        if(n == 0) return 0;
        
        for(int i = 2; i <= n; i++){
        
            term = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = term;
            
            if(term % 2 == 0){
                sum += term; //sum of even fib(n)
            }
            
        }
        
        return sum;
        
    }
    
}
