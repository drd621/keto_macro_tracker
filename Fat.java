// TODO create sub-menus for entering fat limit, fat consumed, and returning to main menu

import java.util.Scanner;

class Fat {
    private int totalFat;
    // Allows user to enter daily fat limit, keep a running total, and notify if limit is exceeded
    void displayFat() {
        Scanner max = new Scanner(System.in);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter daily fat limit in grams: ");
        int maxFat = max.nextInt();
        while(totalFat < maxFat) {
            System.out.println("Enter fat consumed in grams: ");
            int fatCount = entry.nextInt();
            totalFat += fatCount;
            System.out.println("Fat: " + totalFat + "g");
        }
        System.out.println("You have reached your daily fat limit");
    }
    void resetFat() {
        totalFat = 0;
    }
}
