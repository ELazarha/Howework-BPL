import java.util.Scanner;
import java.util.Arrays;

public class EXERCISE1 {
    //Check if an array is sorted in ascending order.
    public static void Checking() {
        Scanner input = new Scanner(System.in);
        // ask user to create a size array
        int sizeArray;
        System.out.println("Enter size of Array");
        sizeArray = input.nextInt();
        // creat variable to store data array
        int[] arr = new int[sizeArray];
        System.out.println("Enter element : ");
        // looping for an input array element
        for (int i = 0; i < sizeArray; i++) {
            arr[i] = input.nextInt();
        }
        // check if array is sort
        boolean sort = true;
        for (int i = 0 ; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sort = false;
                break;
            }
        }
        // print result
        if (sort) {
            System.out.println("array are  sort");
        } else
            System.out.println("Array not sort");
    }
}
