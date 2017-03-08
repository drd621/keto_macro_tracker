// TODO exception handling

import java.util.Scanner;

class Protein {
    private int totalProtein;
    private int maxProtein;
    private Scanner input = new Scanner(System.in);
    private Scanner max = new Scanner(System.in);
    private Scanner entry = new Scanner(System.in);
    // Allows user to enter daily protein limit, keep a running total, and notify if limit is exceeded
    void proteinMenu() {
        do {
            System.out.println("*PROTEIN*\n");
            System.out.println("Current Protein: " + totalProtein + "g");
            System.out.println("Maximum Protein: " + maxProtein + "g\n");
            System.out.println("1. Daily Protein Limit");
            System.out.println("2. New Protein Entry");
            System.out.println("3. Main Menu");
            int subMenuChoice = input.nextInt();
            switch (subMenuChoice) {
                case 1:
                    System.out.println("Enter daily protein limit in grams: ");
                    maxProtein = max.nextInt();
                    break;
                case 2:
                    System.out.println("Enter protein consumed in grams: ");
                    int proteinCount = entry.nextInt();
                    totalProtein += proteinCount;
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please enter valid menu option");
            }
        } while (totalProtein < maxProtein);
        System.out.println("You have reached your daily protein limit");
    }

    void resetProtein() {
        totalProtein = 0;
        maxProtein = 0;
    }
}
