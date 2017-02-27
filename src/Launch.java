// TODO implement exception handling on menu

import java.util.Scanner;

class Launch {
    void launchApp() {
        Carbs carbs = new Carbs();
        Protein protein = new Protein();
        Fat fat = new Fat();
        Scanner input = new Scanner(System.in);
        System.out.println("*MENU*\n");
        System.out.println("1. Carbs\n2. Protein\n3. Fat\n4. Reset");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                carbs.displayCarbs();
                break;
            case 2:
                protein.displayProtein();
                break;
            case 3:
                fat.displayFat();
                break;
            case 4:
                carbs.resetCarbs();
                protein.resetProtein();
                fat.resetFat();
                System.out.println("Macros Reset");
                break;
            default:
                System.out.println("Please enter valid menu option");
        }
    }
}
