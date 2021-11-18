public class SumOfEvenFibonacciSequence2 {

    public static void main(String[] args) {
        int limit = 4000000;
        
        /*
        
        EVEN value is observe after every 3 terms
        1, 1, 2, 3, 5, 8, 13, 21, 34, .....
        _  _  2  _  _  8  __  __  34 ......
        
        */
        
        int sum = 0;
        int dp1 = 1;
        int dp2 = 1;
        int dp3 = dp1 + dp2;
        while(dp3 < limit){
            
            sum += dp3;
            
            dp1 = dp2 + dp3;
            dp2 = dp3 + dp1;
            dp3 = dp1 + dp2;
            
        }
        
        System.out.println(sum);
    }
    
}
