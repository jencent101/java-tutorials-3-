
package passbyreference;

public class PassByReference {
    int OnetoZero (int arg[]) {
        int count = 0;
        
        for (int i= 0; i < arg.length; i++) {
            if (arg[i] == 1) {
                count++;
                arg[i] = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 1, 1, 7};
        PassByReference test = new PassByReference();
        int numOnes;
        
        System.out.println("Values of the array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("]");
        
        numOnes = test.OnetoZero(arr);
        System.out.println("Number of Ones = " + numOnes);
        System.out.println("New values of the array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("]");
    }
}
