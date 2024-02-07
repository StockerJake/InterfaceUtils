public class InterfaceUtilities {
    public static void main(String[] args) {
        String answer  = InputUtils.readString("Run test program (Y/N)? ");
        if (answer.equals("Y")) {
            int choice;
            do {
                String[] mainMenuOptions = { "Input Utils", "Menu Utils" };
                choice = MenuUtils.displayMenu("[Select Interface]", mainMenuOptions);

                switch (choice) {
                    case 1:
                        InputUtils.showMenu();
                        break;
                    case 2:
                        MenuUtils.showMenu();
                        break;
                    default:
                        if (choice != 0) {
                            System.out.println("\nInvalid option, please try again.");
                        }
                        break;
                }
            } while (choice != 0);
        }
    }
}
