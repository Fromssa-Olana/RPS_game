package com.TargetTechCohort;

import java.util.Random;
import java.util.Scanner;

public class Game {


    public int startGame() {
        Scanner scanner = new Scanner(System.in);

        //start game


        //create a variable to hold the user response using the Scanner object.
        int playerResponse = 0;

        // The response needs to be an integer between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors)
        boolean again;
        do {
            again = false;
            System.out.println("Please enter an integer number between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors) ");
            playerResponse = scanner.nextInt();
            if (!(playerResponse > 0 && playerResponse < 4)) {
                again = true;
                scanner.reset();
            }
        } while (again);


        // create a variable to hold the cpu response generated by the getCPUResponse() method.
        int cpuResponse = getCPUResponse();

        //compare user and cpu response with each other to decide the winner.
        if (cpuResponse > playerResponse) {
            return cpuResponse;
        } else if (cpuResponse < playerResponse) {
            return playerResponse;
        }
        // if we get to this point, it is tie
        return 0;

    }

    public int getCPUResponse() {
        // Generate random integers in range 1 to 3
        Random random = new Random();
        return random.nextInt(3) + 1; // added 1 to exclude 0
    }

}
