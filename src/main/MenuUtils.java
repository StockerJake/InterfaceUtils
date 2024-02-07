import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Designed to handle the menu system.
 * Can handle any menu size, and verifies a valid input.
 * 
 * Prints out in the following format:
 * 
 *  [Menu Title]
 *  1 - Option1
 *  2 - Option2
 *  3 - Option3
 *  
 *  0 - Exit
 * 
 *  Enter your choice: 
 * 
 */

public class MenuUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static int displayMenu(String menuTitle, String[] options) {
        
        int choice = -1;
        boolean validInput;

        do {
            System.out.println("\n" + menuTitle);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + " - " + options[i]);
            }
            System.out.println("\n0 - Exit\n");

            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                validInput = (choice >= 0 && choice <= options.length);

                if (!validInput) {
                    System.out.println("Invalid input, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a number.");
                validInput = false;
                scanner.next(); // Clear the buffer
            }
        } while (!validInput);

        return choice;
    }


    // Implementation for MenuUtils, remove if not needed
    public static void showMenu() {
        int choice;
        do {
            String[] options = { "Option 1", "Option 2", "Option 3", "Option 4", "Option 5" };
            choice = MenuUtils.displayMenu("My Menu Page Title", options);

            switch (choice) {
                case 1:
                    // method1();
                    break;
                case 2:
                    // method2();
                    break;
                case 3:
                    // method3();
                    break;
                case 4:
                    // method4();
                    break;
                case 5:
                    // method5();
                    break;
                // Add more cases as needed
            }
        } while (choice != 0);
    }
}
