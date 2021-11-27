
package prime_no;
import java.util.Scanner;

public class Prime_no {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a no: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                continue;
            } else {
                System.out.print("Not Prime Number, it Composite Number\n");
                return;
            }
        }
        System.out.print("Prime\n");
    }
    
}
