public class Recap {
    public static void main(String[] args) {
        //Interface: Blueprints. You can create an object of interface. Another class has to implement
                //this interface to implement those methods.
        Math math = new MathImplement();
        System.out.println("Adding two numbers: " + math.add(10, 30));
        System.out.println("Subtracting two numbers: " + math.subtract(30, 5));
        System.out.println("Dividing two numbers: " + math.divide(100, 5));
        Math math2 = new MathImplement();
    }
}

class MathImplement implements Math {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public int divide(int num, int den) {
        if(den == 0) {
            return -1;
        }
        return num/den;
    }
}

interface Math {
    int add(int x, int y);
    int subtract(int x, int y);
    int divide(int num, int den);
}

abstract class Science {
    public void exploration() {
        System.out.println("Default exploration for any topics.");
    }
}

class Biology extends Science{

}
