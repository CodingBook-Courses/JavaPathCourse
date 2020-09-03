public class Main {
    public static void main(String[] args) {
        //Three types of errors in java:
        //Compile Time error: (Syntax error) : Grammatical errors that stops the program from running
            //E.g. missing brackets, variable not initialized, missing semicolon
            //Compiler detects this error (editor helps finding this error) and it occurs while compiling the program
            //Easy to find & fix (compiler, editor helps)
        //Run time error: Occurs during the execution of the program
            //Compiler and editor have no idea about it
            //E.g. users enters invalid value, try to reference null values, divide by 0, array out of bound
            //program stops executing & JVM (Java Virtual Machine). It's going to put this error on stack trace.
            //Fix this errors using Exception Handling
        //Logical error: (Bug or Semantic Errors) : Program runs normally, but there are logical errors or incorrect
        //results occur than the one you expected out of the program (because of faulty programming)
            //Compiler nor JVM can detect it.
            //E.g., Trying to add the sum of 10 numbers, but only adds 9 numbers.

        double x = 10;
        double y = 15;

        System.out.println(x/y);

    }
}
