import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n\t\t\t ===== Welcome to Number Guessing game! =====");
        System.out.println("\t\t\t\t\tDeveloped by Anay Gupta");
        System.out.println("\nYou have to guess a number between 1 and 100. " +
                "You'll have limited choices based on the " +
                "level you choose. Good Luck!\n");

        while (true) {
            System.out.println("\nEnter the difficulty level: \n");
            System.out.println("1 for Easy!\t");
            System.out.println("2 for Medium!\t");
            System.out.println("3 for Difficult!\t");
            System.out.println("0 for Ending the game!\n");

            // select the level of difficulty
            System.out.print("Enter the number : ");
            int difficultyChoice = scanner.nextInt();

            // generating the secret number
            int secretNumber = 1 + random.nextInt(100);
            int playerChoice;

            // Difficulty Level: Easy
            if (difficultyChoice == 1) {
                System.out.println("\nYou have 10 choices for finding the secret number between 1 and 100.");
                int choicesLeft = 10;
                for (int i = 1; i <= 10; i++) {
                    System.out.print("\n\nEnter the number: ");
                    playerChoice = scanner.nextInt();

                    if (playerChoice == secretNumber) {
                        System.out.println("Well played! You won, " + playerChoice + " is the secret number");
                        System.out.println("\t\t\t Thanks for playing....");
                        System.out.println("Play the game again with us!!\n");
                        break;
                    } else {
                        System.out.println("Nope, " + playerChoice + " is not the right number");
                        if (playerChoice > secretNumber) {
                            System.out.println("The secret number is smaller than the number you have chosen");
                        } else {
                            System.out.println("The secret number is greater than the number you have chosen");
                        }
                        choicesLeft--;
                        System.out.println(choicesLeft + " choices left.");
                        if (choicesLeft == 0) {
                            System.out.println("You couldn't find the secret number, it was " + secretNumber + ", You lose!!\n");
                            System.out.println("Play the game again to win!!!\n");
                        }
                    }
                }
            }
            // Difficulty Level: Medium
            else if (difficultyChoice == 2) {
                System.out.println("\nYou have 7 choices for finding the secret number between 1 and 100.");
                int choicesLeft = 7;
                for (int i = 1; i <= 7; i++) {
                    System.out.print("\n\nEnter the number: ");
                    playerChoice = scanner.nextInt();

                    if (playerChoice == secretNumber) {
                        System.out.println("Well played! You won, " + playerChoice + " is the secret number");
                        System.out.println("\t\t\t Thanks for playing....");
                        System.out.println("Play the game again with us!!\n");
                        break;
                    } else {
                        System.out.println("Nope, " + playerChoice + " is not the right number");
                        if (playerChoice > secretNumber) {
                            System.out.println("The secret number is smaller than the number you have chosen");
                        } else {
                            System.out.println("The secret number is greater than the number you have chosen");
                        }
                        choicesLeft--;
                        System.out.println(choicesLeft + " choices left.");
                        if (choicesLeft == 0) {
                            System.out.println("You couldn't find the secret number, it was " + secretNumber + ", You lose!!\n");
                            System.out.println("Play the game again to win!!!\n");
                        }
                    }
                }
            }
            // Difficulty Level: Hard
            else if (difficultyChoice == 3) {
                System.out.println("\nYou have 5 choices for finding the secret number between 1 and 100.");
                int choicesLeft = 5;
                for (int i = 1; i <= 5; i++) {
                    System.out.print("\n\nEnter the number: ");
                    playerChoice = scanner.nextInt();

                    if (playerChoice == secretNumber) {
                        System.out.println("Well played! You won, " + playerChoice + " is the secret number");
                        System.out.println("\t\t\t Thanks for playing....");
                        System.out.println("Play the game again with us!!\n");
                        break;
                    } else {
                        System.out.println("Nope, " + playerChoice + " is not the right number");
                        if (playerChoice > secretNumber) {
                            System.out.println("The secret number is smaller than the number you have chosen");
                        } else {
                            System.out.println("The secret number is greater than the number you have chosen");
                        }
                        choicesLeft--;
                        System.out.println(choicesLeft + " choices left.");
                        if (choicesLeft == 0) {
                            System.out.println("You couldn't find the secret number, it was " + secretNumber + ", You lose!!\n");
                            System.out.println("Play the game again to win!!!\n");
                        }
                    }
                }
            }
            // To end the game
            else if (difficultyChoice == 0) {
                System.exit(0);
            }
            else {
                System.out.println("Wrong choice, Enter valid choice to play the game! (0,1,2,3)");
            }
        }
    }
}

