//Ask the user to enter the name and age of three people, then display the name of the person who is the
//youngest.

import java.util.Arrays;
import java.util.Scanner;

public class EXERCISE3 {
    public static void getYounger() {
        //get user input and count;
        //check who is a younger
        Scanner input = new Scanner(System.in);

        int youngAge = Integer.MAX_VALUE;
        String youngName = "";

        for (int i = 0; i < 3; i++) {
            //ask user to enter name and age

            System.out.print("Enter name and age of person " + (i + 1) + ":");
            String store = input.nextLine();

            String[] part = store.split(","); //split string into part
            String name = part[0].trim();

            //trim white space
            int age = Integer.parseInt(part[1].trim());

            if (age < youngAge) {
                youngAge = age;
                youngName = name;
            }
        }
        System.out.println("The name of the youngest person is " + youngName + " " + youngAge);
    }
}