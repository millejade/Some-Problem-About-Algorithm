import java.util.Scanner;

public class HarmonicSum {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double n = s.nextFloat();
        
        System.out.println(harmonic(n));
        
    }

    private static double harmonic(double n) {
       
        /* O(N log N)   
        //recursive method
        if(n<2) return 1;
        else return (1/n + harmonic(n-1));
        */
        
        // O(N)
        double i, s = 0.0;
         
        for (i = 1; i <= n; i++) s = s + 1/i;
        
        return s;

    }
    
}
