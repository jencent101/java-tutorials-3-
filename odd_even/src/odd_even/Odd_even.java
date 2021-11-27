
package odd_even;
import java.util.Scanner;

public class Odd_even {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if (n % 2 == 0){
            System.out.printf("%d is even.", n);
        } else {
            System.out.printf("%d is odd.", n);
        }
    }
    
}
