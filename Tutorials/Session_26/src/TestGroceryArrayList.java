import java.util.InputMismatchException;
import java.util.Scanner;

public class TestGroceryArrayList {
    public static Scanner scanner = new Scanner(System.in);
    public static GroceryArrayList groceryList = new GroceryArrayList("Chintan's grocery");

    public static void main(String[] args) {
        printListOfInstructions();
        boolean quit = false;
        while(!quit) {
            System.out.println("Please enter your option: (0 to exit, and 4 to list all options)");
            int optionSelected = 0;
            try {
                optionSelected = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("String input not allowed.");
            }
            switch(optionSelected) {
                case 1:
                    addGroceryItem();
                    break;
                case 2:
                    removeGroceryItem();
                    break;
                case 3:
                    editGroceryitem();
                    break;
                case 4:
                    printGroceryList();
                    break;
                case 5:
                    printListOfInstructions();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    private static void printGroceryList() {
        groceryList.printList();
    }

    private static void addGroceryItem() {
        System.out.println("Please enter your grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void removeGroceryItem() {
        System.out.println("Please enter the position of the item you want to remove: ");
        try {
            groceryList.removeGroceryItem(scanner.nextInt());
        } catch(InputMismatchException e) {
            System.out.println("Only enter Interger value here.");
        }
    }

    private static void editGroceryitem() {
        System.out.println("Please enter the position of the item you want to edit: ");
        try {
            int position = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please enter the new name for the item:");
            String newItem = scanner.nextLine();
            if(groceryList.editItem(position, newItem)) {
                System.out.println("Successfully edited an item. New name is: " + newItem);
            } else {
                System.out.println("Editing an item was not successful.");
            }
        } catch(InputMismatchException e) {
            System.out.println("Only enter Integer value here.");
        }
    }

    public static void printListOfInstructions() {
        System.out.println("Please select from below options: ");
        System.out.println("1. Add a grocery item");
        System.out.println("2. Remove a grocery item");
        System.out.println("3. Edit a grocery item");
        System.out.println("4. Print the items in grocery list");
        System.out.println("5. Print the list of options");
        System.out.println("6. Exit the program");
        System.out.println("Select your option: ");
    }
}
