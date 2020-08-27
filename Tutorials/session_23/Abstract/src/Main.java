//Abstraction is hiding unnecessary details and showing the essentials
//Abstract class -> restricted class -> can't create an object of it
//the way you call it is that you inherit the abstract and access it from there

//Abstract methods -> can only have them in abstract classes
//they don't have bodies
//needs to be implemented in the child class
public class Main {

    public static void main(String[] args){
        Triangle triangle1 = new Triangle();
        triangle1.Sides();
        triangle1.printingPolygon();
        Square s = new Square();

        triangle1.setSides(5);
    }


}
