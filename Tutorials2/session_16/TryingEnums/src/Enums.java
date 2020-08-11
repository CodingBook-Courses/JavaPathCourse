//Enums don't have types
enum color{
    ONE, TWO, THREE, BLUE, PINK;
}
public class Enums {
    //Ordered list of items that don't change in a collection
    static String[] colors = {"Blue", "Pink", "Red", "Black"};

    public static void main(String[] args){
        String word = "Pink";
        color word2 = color.PINK;

        //String ""
        //int 1
        //color BLUE PINK RED BLACK

        System.out.print(color.BLACK);
        System.out.print(colors[0]);
    }
}
