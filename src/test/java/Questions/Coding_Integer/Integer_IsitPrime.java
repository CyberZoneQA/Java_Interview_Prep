package Coding_Integer;

public class Integer_IsitPrime {
    public static void main(String[] args) {

        // PRIME NUMBERS (STARTING FROM 2) (divisible by itself and 1)

        int prime =17;
        int count =0;

        if(prime<=1){
            System.out.println("It is not a prime number");
        }else{
            for(int i=2; i<prime; i++) {
                if(prime%i==0){count++;}
            }
            System.out.println(count<1 ? "It is a prime number":"It is not a prime number");
        }

    }
}
