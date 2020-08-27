//Polymorphism -> using methods in different ways
//Poly -> many
// 2 different ways you can use polymorphism
// 1) Dynamic polymorphism (Runtime polymorphism) -> Overriding
// 2) Static polymorphism (Compile time polymorphism) ->Overloading
// Overloading -> done in the same class with different parameters
// Overriding -> done in the child class, it implements the inherited
//method of the parent class in a different way

//Compile time -> when the code is converted into an executable
//Runtime-> when the executable code starts running
public class Polymorphism {
    public static void main(String args[]){
        //Dynamic polymorphism
        Child child1 = new Child();
        child1.myMethod();

        //Static polymorphism
        StaticP object1 = new StaticP();
        System.out.println(object1.add(2, 3));
        System.out.println(object1.add(2, 4, 7));
    }
}
