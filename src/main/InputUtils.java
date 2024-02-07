import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.text.ParseException;

/*
 * Designed to handle the following inputs:
 * 
 * String
 * Int
 * Double
 * Float
 * Long
 * Boolean
 * Date
 * 
 * Usage:
 * int myInt = InputUtils.readInt("Enter myInt: ");
 */
public class InputUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid double.");
            }
        }
    }

    public static float readFloat(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid float.");
            }
        }
    }

    public static long readLong(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Long.parseLong(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid long.");
            }
        }
    }

    public static boolean readBoolean(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true") || input.equals("yes")) {
                return true;
            } else if (input.equals("false") || input.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'true'/'yes' or 'false'/'no'.");
            }
        }
    }

    public static Date readDate(String prompt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        while (true) {
            try {
                System.out.print(prompt);
                java.util.Date parsedDate = dateFormat.parse(scanner.nextLine());
                return new Date(parsedDate.getTime());
            } catch (ParseException e) {
                System.out.println("Invalid date. Please enter a date in the format YYYY-MM-DD.");
            }
        }
    }



    // Implementation for MenuUtils, remove if not needed
    public static void showMenu() {
        int choice;
        do {
            String[] options = { "String", "Int", "Double", "Float", "Long", "Boolean", "Date" };
            choice = MenuUtils.displayMenu("InputUtils", options);
            switch (choice) {
                case 1:
                    readString("Enter a string: ");
                    break;
                case 2:
                    readInt("Enter an int: ");
                    break;
                case 3:
                    readDouble("Enter a double: ");
                    break;
                case 4:
                    readFloat("Enter a float: ");
                    break;
                case 5:
                    readLong("Enter a long: ");
                    break;
                case 6:
                    readBoolean("Enter a boolean: ");
                    break;
                case 7:
                    readDate("Enter a date (yyyy-mm-dd): ");
                // Add more cases as needed
            }
        } while (choice != 0);
    }
}