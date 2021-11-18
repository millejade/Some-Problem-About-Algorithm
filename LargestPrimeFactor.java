public class LargestPrimeFactor {

    public static void main(String[] args) {
   
        long n = 600851475143L;
        int factor;
        int lastFactor;
        
        //If the number is EVEN:
        if(n % 2 == 0){
        
            n /= 2;
            lastFactor = 2;
            
            while(n % 2 == 0){
            
                n /= 2;
            }      
        }else{
            
            lastFactor = 1;
        }
        
        factor = 3;
        
        while(n > 1){
        
            //If the number is ODD
            if(n % factor == 0){
            
                n /= factor;
                lastFactor = factor;
                
                while(n % factor == 0){
                
                    n /= factor;
                }
            }
            factor += 2;
        }
        
        System.out.println(lastFactor);
    }
    
}
