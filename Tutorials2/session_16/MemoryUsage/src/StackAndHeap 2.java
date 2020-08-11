public class StackAndHeap {
    //Stack -> method calls, local variables,
    // and reference variables

    //Heap -> Objects, instance variables
    public static void main(String[] args){
        int x = 5;
        method1(2);
    }
    public static void method1(int y){
        double g = 5.5;
        method2();
    }
    public static void method2(){
        Shoe s = new Shoe();
        //LIFO -> Last in first out

    }
}
