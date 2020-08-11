public class Eagle extends Bird{

    public Eagle(String n, int a){
        super(n, a);
    }
    @Override
    public void eat(){
        System.out.println("The eagle ate a big food");
    }
    public void see(){
        System.out.println("The bird is able to see far away");
    }
}
