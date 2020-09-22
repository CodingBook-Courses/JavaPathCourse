//Generics
public class Main {
    public static void main(String[] args){
          //T -> Type
          //E -> Element
          //K -> Key Map<K,V>
          //V -> Value

//        printInteger pI = new printInteger(7);
//        pI.printInt();
//
//        printString pS = new printString("Hello");
//        pS.printStr();
//
//        GenericsExample<Integer> gE = new GenericsExample<>(7);
//        gE.printT();
//        GenericsExample<Double> gE2 = new GenericsExample<>(4.8);
//        gE2.printT();
//        GenericsExample<String> gE3 = new GenericsExample<>("Hello");
//        gE3.printT();

//        GenericsExample<Integer, Integer, String> gE = new GenericsExample<>(7, 8, "Hello");
//        gE.printT();
//        GenericsExample<Double, Integer, Character> gE2 = new GenericsExample<>(7.2, 8, 'N');
//        gE2.printT();


        MathFunctions<Integer> mathF = new MathFunctions<>(7);
        //MathFunctions<String> mathF = new MathFunctions<>("Hello");
        //Gives an error because the datatype needs to be a number
        System.out.println(mathF.Square());

    }
}

//Create class that has a method(PrintElements) that takes an array as an argument and prints all its elements
//Main class -> It will have an Integer array, String array, Double array
// run the printElements method on all arrays
