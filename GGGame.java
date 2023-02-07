import java.util.Scanner;

import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int pguessNum;

    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        pguessNum = sc.nextInt();
        return pguessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser G = new Guesser();
        numFromGuesser = G.guessNumber();
    }

    public void collectNumFromPlayer() {
        Player P1 = new Player();
        Player P2 = new Player();
        Player P3 = new Player();
        numFromPlayer1 = P1.guessNumber();
        numFromPlayer2 = P1.guessNumber();
        numFromPlayer3 = P1.guessNumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Game tied all three players guessed correctly");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won ");
            } else {

                System.out.println("Player 1 won the game");
            }
        }

        else if (numFromGuesser == numFromPlayer2) {

            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }
        }

        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost! try again");
        }
    }
}

public class GGGame {
    public static void main(String[] args) {
        Umpire U = new Umpire();
        U.collectNumFromGuesser();
        U.collectNumFromPlayer();
        U.compare();
    }
}
