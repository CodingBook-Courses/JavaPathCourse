public class Cat {
    String name;
    Owner owner;
    //Inheritance
    // Animal -> parent "is-a relationship"
    // Cat -> child
    // Cat is an Animal

    //Composition
    // "has-a relationship"
    // Cat has an Owner

    public Cat(String n, Owner o){
        this.name = n;
        this.owner = o;
    }

    public String toString(){
        return "The cat's name is: " + this.name + "  \nThe owner information: " + this.owner;
    }


}
