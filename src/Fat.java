// TODO exception handling

import java.util.Scanner;

class Fat {
    private int totalFat;
    private int maxFat;
    private Scanner input = new Scanner(System.in);
    private Scanner max = new Scanner(System.in);
    private Scanner entry = new Scanner(System.in);
    // Allows user to enter daily fat limit, keep a running total, and notify if limit is exceeded
    void fatMenu() {
        do {
            System.out.println("*FAT*\n");
            System.out.println("Current Fat: " + totalFat + "g");
            System.out.println("Maximum Fat: " + maxFat + "g\n");
            System.out.println("1. Daily Fat Limit");
            System.out.println("2. New Fat Entry");
            System.out.println("3. Main Menu");
            int subMenuChoice = input.nextInt();
            switch (subMenuChoice) {
                case 1:
                    System.out.println("Enter daily fat limit in grams: ");
                    maxFat = max.nextInt();
                    break;
                case 2:
                    System.out.println("Enter fat consumed in grams: ");
                    int fatCount = entry.nextInt();
                    totalFat += fatCount;
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please enter valid menu option");
            }
        } while (totalFat < maxFat);
        System.out.println("You have reached your daily fat limit");
    }

    void resetFat() {
        totalFat = 0;
        maxFat = 0;
    }
}