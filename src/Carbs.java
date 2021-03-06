import java.util.InputMismatchException;
import java.util.Scanner;

class Carbs {
    private int totalCarbs;
    private int maxCarbs;
    private Scanner input = new Scanner(System.in);
    // Allows user to enter daily carb limit, keep a running total, and notify if limit is exceeded
    void carbMenu() {
        do {
            try {
                printMenu();
                int subMenuChoice = input.nextInt();
                switch (subMenuChoice) {
                    case 1:
                        System.out.println("Enter daily carb limit in grams: ");
                        maxCarbs = input.nextInt();
                        break;
                    case 2:
                        System.out.println("Enter carbs consumed in grams: ");
                        int carbCount = input.nextInt();
                        totalCarbs += carbCount;
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Please enter valid menu option");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid menu option");
                input.next();
            }
        } while (totalCarbs <= maxCarbs);
        System.out.println("You have exceeded your daily carb limit");
    }

    void printMenu() {
        System.out.println("*CARBS*\n");
        System.out.println("Current Carbs: " + totalCarbs + "g");
        System.out.println("Maximum Carbs: " + maxCarbs + "g\n");
        System.out.println("1. Daily Carb Limit");
        System.out.println("2. New Carb Entry");
        System.out.println("3. Main Menu");
    }

    void resetCarbs() {
        totalCarbs = 0;
        maxCarbs = 0;
    }
}