// Public class primesInrange{
// import java.util.*;
 public class primesInrange {
    public static void primesInrange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();

    }

    // Public static void main(String args[]) {
    //     primesInrange(n);
    }
