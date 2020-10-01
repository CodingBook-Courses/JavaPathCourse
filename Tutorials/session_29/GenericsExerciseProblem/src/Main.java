public class Main {
    public static void main(String[] args){
        Integer[] intArray = {1, 2, 4};
        Double[] doubleArray = {1.1, 2.2, 5.5};
        String[] stringArray = {"Hello", "World", "!"};

        PrintingArray<Integer> printIntArray = new PrintingArray<>();
        printIntArray.printElements(intArray);

        PrintingArray<Double> printDoubleArray = new PrintingArray<>();
        printDoubleArray.printElements(doubleArray);

        PrintingArray<String> printStringArray = new PrintingArray<>();
        printStringArray.printElements(stringArray);

    }
}
