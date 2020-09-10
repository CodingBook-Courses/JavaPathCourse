public class ArrayListVsArrays {
    private static int[] intArray = new int[10];
    public static void main(String[] args) {
        //Change size in an Array, how to add an element in an array.
        generateArray();
        printArray(intArray);
        resizeArray();
        generateArray();
        printArray(intArray);
    }

    public static void generateArray() {
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
        }
    }

    public static void printArray(int[] intArray) {
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    public static void resizeArray() {
        int[] newIntArray = new int[intArray.length];
        newIntArray = intArray;
        intArray = new int[14];
        for(int i = 0; i < newIntArray.length; i++) {
            intArray[i] = newIntArray[i];
        }
    }
}
