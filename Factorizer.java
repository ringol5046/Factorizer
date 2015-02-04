
import static java.lang.reflect.Array.getLength;


public class Factorizer {

    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args [0]);
        int nPrimeCandidates = (int)Math.ceil(Math.sqrt(n));
        int [] primes = new int [nPrimeCandidates];
        int [] multiplicities = new int [nPrimeCandidates];
        primes = primeCandidate(nPrimeCandidates);
        multiplicities = calculateMultiplicities(primes, nPrimeCandidates);
        System.out.println(primes);
        System.out.println(multiplicities);
    }
    
    public static int [] primeCandidate (int n)
    {
        int[] primeCandidates = new int [n+1];
        for(int i=2; i<=n; i++)
        {
            for(int j = 2; j<=i; j++)
            {
                if(j==i)
                {
                    primeCandidates[i]= i;
                }
                
                if(i%j==0)
                {
                    break;
                }
            }
        }
        
        return primeCandidates;          
    }

    private static int[] calculateMultiplicities(int[] primes, int n) {
        
        int counter = 0;
        int[] mult = new int [n+1];
        for (int i=1; i<=getLength(primes); i++)
        {
            while(n%primes[i]==0)
            {
                counter++;
                mult[i]= counter;
            }       
        }
        
        return mult;       
    }
    
}

