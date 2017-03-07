// TODO implement exception handling on menu
// TODO possible refactor of reset functionality

import java.util.Scanner;

class Launch {
    void launchApp() {
        Carbs carbs = new Carbs();
        Protein protein = new Protein();
        Fat fat = new Fat();
        Scanner input = new Scanner(System.in);
        // TODO implement start/stop
        while(true) {
            System.out.println("*MENU*\n");
            System.out.println("1. Carbs\n2. Protein\n3. Fat\n4. Reset");
            int menuChoice = input.nextInt();
            switch (menuChoice) {
                case 1:
                    carbs.carbMenu();
                    break;
                case 2:
                    protein.proteinMenu();
                    break;
                case 3:
                    fat.fatMenu();
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
}
