***CREATED BY: JAKE STOCKER***

# Interface Utilities

These are two simple Java utilities I developed when designing interfaces.

## Menu Utils

As the name suggests, this streamlines the simple menu-creating process.
This handles printing and maintaining menu order.
Designed such that the layout of the menu and the functions they perform
are defined in the class itself. 

Prints out in the following format:

```

   [Menu Title]
   1 - Option1
   2 - Option2
   3 - Option3
   
   0 - Exit
  
   Enter your choice: 
 ```

### Usage:
This would be located in the class the menu is for:

```
public void showMenu() {
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
```

Invoke the menu from other menus with the following:

```
MyClass.showMenu();
```

## Input Utils

Handles and parses all inputs received given a string prompt input.
Verifies that the desired input is obtained, throwing an error if not.
Can also handle custom inputs according to specification.

Usage:

```
int tenantId = InputUtils.readInt("Enter Tenant ID: ");
Date visitDate = InputUtils.readDate("Enter Visit Date (yyyy-mm-dd): ");
String note = InputUtils.readString("Enter Note: ");
```
