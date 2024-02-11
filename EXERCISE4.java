import java.util.Scanner;

//(Assign grades) Ask the user to enter five scores separated by a space in one line, and then assigns
//grades based on the following scheme:
//The grade is A if score is >= 90.
//The grade is B if 90 > score >= 80.
//The grade is C if 80 > score >= 70.
//The grade is D of 70 > score >= 60.
//The grade is F otherwise.
public class EXERCISE4 {
    public static void GetAssinggrade() {
        Scanner input = new Scanner(System.in);
        int[] score = new int[5];
        System.out.print("Enter score: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (score[i] >= 90) {
                System.out.println("Score is: " + score[i] + " Grade: A");
            } else if (score[i] >= 80) {
                System.out.println("score is: " + score[i] + " Grade: B");
            } else if (score[i] >= 70) {
                System.out.println("Score is: " + score[i] + " Grade: C");
            } else if (score[i] >= 60) {
                System.out.println("Score is: " + score[i] + " Grade: D");
            } else {
                System.out.println("Score is: " + score[i] + " Grade: F");
            }
        }


    }
}
