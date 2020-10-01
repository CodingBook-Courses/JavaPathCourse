import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //Linear Data Structure (operations are performed in a particular order)

        //LIFO last-in-first-out
        //Top: Add new items on here
        //Base: The item that is added the first in the stack (Stays the longest in the stack)

        //push: adds an item to the top
        //pop: remove an item from the top
        //peek: return the Top element
        //empty: if empty, return true, otherwise return false
        //size: Gives you the size of the stack

        //Use cases: Stack of plates/books, Browser: Back button, Back button inside file,
        //reversing any structures.

        Stack<String> fileSystem = new Stack<>();

        //Push an element onto the stack
        fileSystem.push("Home");
        fileSystem.push("Desktop");
        fileSystem.push("job");
        fileSystem.push("codingbook");
        fileSystem.push("Java");
        fileSystem.push("Tutorials");

        System.out.println("Peek: " + fileSystem.peek());
        System.out.println("Is empty: " + fileSystem.empty());
        System.out.println("Size of the stack: " + fileSystem.size());
        System.out.println(fileSystem);

        fileSystem.pop();
        System.out.println("Peek " + fileSystem.peek());
        System.out.println("Is empty: " + fileSystem.empty());
        System.out.println("Size of the stack: " + fileSystem.size());
        System.out.println(fileSystem);

        System.out.println("Pop element: " + fileSystem.pop());
        fileSystem.pop();
        fileSystem.pop();
        fileSystem.pop();
        fileSystem.pop();
        System.out.println("Is empty: " + fileSystem.empty());
        System.out.println("Size of the stack: " + fileSystem.size());
        System.out.println(fileSystem);

        //Challenge:
        //Create a stack for back button for browser:
        //Push: google.com
        //Push: something to search on google.com
        //Push: Click on one of the link on seach results
        //Push: netflix.com
        //Print the stack
        //Print the size of the stack and check if it is empty
        //Print the peek item
        //Pop 2 elements
        //Print the stack
        //Print the size of the stack and check if it is empty
        //Print the peek item
        //Pop all elements
        //Print the stack
        //Check if it empty and the size of it
        Stack<String> stackBrowser = new Stack<>();
        stackBrowser.push("google.com");
        stackBrowser.push("stackoverflow.com how to add element in stack");
        stackBrowser.push("stackoverflow.com");
        stackBrowser.push("netflix.com");
        System.out.println(stackBrowser);
        System.out.println("Size is " + stackBrowser.size());
        System.out.println("Is it empty: " + stackBrowser.empty());
        System.out.println("I am currently at: " + stackBrowser.peek());
        stackBrowser.pop();
        stackBrowser.pop();
        System.out.println(stackBrowser);
        System.out.println("Size is " + stackBrowser.size());
        System.out.println("Is it empty: " + stackBrowser.empty());
        System.out.println("I am currently at: " + stackBrowser.peek());
        stackBrowser.pop();
        stackBrowser.pop();
        System.out.println(stackBrowser);
        System.out.println("Size is " + stackBrowser.size());
        System.out.println("Is it empty: " + stackBrowser.empty());
        if(!stackBrowser.isEmpty()) {
            System.out.println("I am currently at: " + stackBrowser.peek());
        }
    }
}
