package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int studentnumber = 0;
        String userWants;
        String answer = "y";

        Scanner scan = new Scanner(System.in);

        String[] classNames = {"Mo", "Tresa", "David"};
        String[] highshool = {" Mass ", " TechTown ", " Davidson "};
        String[] favColor = {"mauve", "taupe", "darkbrown"};

        System.out.println("Welcome to TechHire 2017");
        do {
            try {
                System.out.println("Please enter a student number to learn more (1-3)");
                studentnumber = scan.nextInt();
                scan.nextLine();

                System.out.println("Your student is:" + classNames[studentnumber]);
                System.out.println("What would you like to learn about us? Enter 'high school' or 'favorite color': ");
                userWants = scan.nextLine();

                if (userWants.contains("school")) {
                    System.out.println("Your student attended" + highshool[studentnumber - 1] + "high school");
                } else if (userWants.contains("color")) {
                    System.out.println("Your student attended" + favColor[studentnumber - 1] + "high school");
                }

        System.out.println("Would you like to learn more about another student? (Y/N)");
        answer = scan.nextLine();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You have entered an invalid number please try again ");
            }

        } while (answer.equalsIgnoreCase("y"));

    }
}
