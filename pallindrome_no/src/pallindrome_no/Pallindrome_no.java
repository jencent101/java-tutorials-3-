
package pallindrome_no;
import java.io.*;

public class Pallindrome_no {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, rev = 0, m, ld;
        System.out.println("Enter a number: ");
        n = Integer.parseInt(br.readLine());
        m = n;
        do {
            ld = m % 10;
            m /= 10;
            rev = rev * 10 + ld;
        } while (m > 0);
        if (rev == n) {
            System.out.println("Pallindrome.");
        } else {
            System.out.println("Not Pallindrome.");
        }
    }
    
}
