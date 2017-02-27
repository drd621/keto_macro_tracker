// TODO create sub-menus for entering carb limit, carbs consumed, and returning to main menu

import java.util.Scanner;

class Carbs {
    private int totalCarbs;
    // Allows user to enter daily carb limit, keep a running total, and notify if limit is exceeded
    void displayCarbs() {
        Scanner max = new Scanner(System.in);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter daily carb limit in grams: ");
        int maxCarbs = max.nextInt();
        while(totalCarbs < maxCarbs) {
            System.out.println("Enter carbs consumed in grams: ");
            int carbCount = entry.nextInt();
            totalCarbs += carbCount;
            System.out.println("Carbs: " + totalCarbs + "g");
        }
        System.out.println("You have reached your daily carb limit");
    }
    void resetCarbs() {
        totalCarbs = 0;
    }
}
