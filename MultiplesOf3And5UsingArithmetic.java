public class MultiplesOf3And5UsingArithmetic {

    public static void main(String[] args) {
        
        /*
        S = n/2 * (a1 + an) << formula of sum of arithmetic series
        */
        
        int sum = (333 * (3 + 999))/2;
        sum += (199 * (5 + 995))/2;
        int num = (66 * (15 + 990))/2;
        sum -= num;
        
        System.out.println(sum);
        
    }
    
}
