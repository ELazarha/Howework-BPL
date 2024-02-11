import java.util.Arrays;

import java.util.Scanner;

//Reads 10 integers between 1 and 100 separated by a space in one line, and counts the occurrences of
//each. Here is the sample run:
public class EXERCISE5 {
    public static void Occur() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 integers between 1 and 100 separated by a space: ");
        String inputLine = scanner.nextLine();

        String[] inputArray = inputLine.split(" ");
        int[] occurrences = new int[100]; // Assuming integers are between 1 and 100

        for (String strNum : inputArray) {

            int num = Integer.parseInt(strNum);
            occurrences[num]++;
        }

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                if (occurrences[i] == 1) {
                    System.out.println("Number " + (i + 1) + " occurs " + occurrences[i] + " time.");
                } else {
                    System.out.println("Number " + (i + 1) + " occurs " + occurrences[i] + " times.");
                }
            }
        }
    }
}
