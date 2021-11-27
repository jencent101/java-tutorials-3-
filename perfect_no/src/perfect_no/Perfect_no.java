
package perfect_no;
import java.util.Scanner;

public class Perfect_no {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int ld, m = n, sum = 0;
        while (m > 0) {
            ld = m % 10;
            sum += ld;
            m /= 10;
        } if (n == sum) {
            System.out.printf("%d is perfect no.\n", n);
        } else {
            System.out.printf("%d is not perfect no.\n", n);
        }
    }
    
}
