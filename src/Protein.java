// TODO create sub-menus for entering protein limit, protein consumed, and returning to main menu

import java.util.Scanner;

class Protein {
    private int totalProtein;
    // Allows user to enter daily protein limit, keep a running total, and notify if limit is exceeded
    void displayProtein() {
        Scanner max = new Scanner(System.in);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter daily protein limit in grams: ");
        int maxProtein = max.nextInt();
        while(totalProtein < maxProtein) {
            System.out.println("Enter protein consumed in grams: ");
            int proteinCount = entry.nextInt();
            totalProtein += proteinCount;
            System.out.println("Protein: " + totalProtein + "g");
        }
        System.out.println("You have reached your daily protein limit");
    }
    void resetProtein() {
        totalProtein = 0;
    }
}
