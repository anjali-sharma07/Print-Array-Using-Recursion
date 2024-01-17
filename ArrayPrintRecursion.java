import java.util.Scanner;
public class ArrayPrintRecursion {

    static void printArray(int[] arr, int ind) {
        if (ind == 0) {
            System.out.println(arr[0]);
            return;
        }
        printArray(arr,ind-1);
        System.out.println(arr[ind]);
        return;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            printArray(arr, n-1);
        }

}
