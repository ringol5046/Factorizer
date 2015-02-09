
import static java.lang.System.in;
import static java.lang.reflect.Array.getLength;
import java.util.Scanner;


public class factorizer implements NewFactorizer{
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int length = (int)Math.ceil(Math.sqrt(number));
       int[] primes = new int [length];
        
    public int[] calculatePrime(int n) {
        
        int k=0;
        int [] primecandidates = new int[number];
        
        for(int i=2; i<=Math.sqrt(number);i++){
            
            boolean isPrime = true;
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                if(isPrime=true){
                    primes[k]=i;
                    k++;
                }
            }
        }
        
      return primecandidates;
    }
    public int[] mult(int[] a) {
     
        int[] factor = new int [length];
       
            for(int x=0; x<getLength(primes);x++ ){
                while(number%primes[x]==0){
                    number=number/primes[x];
                }
            }
        
        return factor;
    }
    
}
