
import java.util.Scanner;

public class EXERCISE2 {
    public static void intersection() {
        Scanner input = new Scanner(System.in);
        int sizeArray1;
        int sizeArray2;

        System.out.println("Please enter size of array1");
        sizeArray1 = input.nextInt();

        System.out.println("Please enter Array 1 ");
        String[] array1 = new String[sizeArray1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.next();
        }

        System.out.println("Please enter size of array2");
        sizeArray2 = input.nextInt();

        System.out.println("Please enter Array 2 ");
        String[] array2 = new String[sizeArray2];
        for (int j = 0; j < array2.length; j++) {
            array2[j] = input.next();
        }
        int i;
        int j;
        System.out.print("Intersection: ");
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                    if (array1[i].equals(array2[j])) {
                        System.out.print(array1[i] + "  ");
                }
            }
        }
    }
}
