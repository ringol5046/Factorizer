public class Factorizer {
    
    public static void main(String [] args){
        int n=Integer.parseInt(args[0]);
        calculatePrimeFactors(n);
    }
    
    public static void calculatePrimeFactors (int n){
        for(int i=2; i<=(Math.sqrt(n));i++){
            System.out.println("i = "+i+ " number= "+n);
            while(n%i==0){
                n=n/i;
                System.out.println("factor: "+i);
            }
        }
        if(n>1){
            System.out.println("factor: "+n);
        }
        System.out.println();
    }
}