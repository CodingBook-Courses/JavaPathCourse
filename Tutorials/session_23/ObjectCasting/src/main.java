import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args){
//        double myDouble = 8.9;
//        int myInt = (int)myDouble;
        Animal animal1 = new Animal(); //eat //parent
        Cat cat1 = new Cat(); //eat, play //child
        Dog dog1 = new Dog(); //eat //child

//        animal1.eat();
//        cat1.eat();
//        cat1.play();
//        dog1.eat();

       // Animal animal2 = cat1; //Converting a cat object into an Animal object
        //animal1.eat();
        //animal2.eat(); //Overwritten method


        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Animal animal2 = cat2;
        Animal animal3 = cat3;
        Animal animal4 = dog2;
        Animal animal5 = dog3;
        Animal animal6 = dog4;

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal2); //upcasting
        animalList.add(animal3); //upcasting
        animalList.add(animal4); //upcasting
        animalList.add(animal5); //upcasting
        animalList.add(animal6); //upcasting
        feed(animalList);

        //Downcasting
        Animal animalObject = new Cat();
        if(animalObject instanceof Cat){
            ((Cat)animalObject).play();
        }

    }
    public static void feed(List<Animal> animal){ //The animals could be cat or a dog
        for(int i=0; i<animal.size(); i++){
            if(animal.get(i) instanceof Dog){ //you know Dog is an Animal, but you don't know if the animal is a dog
                ((Dog)animal.get(i)).eat();
            }
            else{
                ((Cat)animal.get(i)).play();
            }

        }
    }
}

//    Cat c = new Cat();
//    Animal a = c; //Upcasting
//    Animal animal = new Cat();
//    Animal animal2 = new Animal();
//animal2.play();
//a.play();
//a.play();
//a.eat();
