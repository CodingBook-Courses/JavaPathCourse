public class Order {
    {
        System.out.println("Inside Instance Initializer Block");
    }
    static{
        System.out.println("Inside Static Block");
    }
    Order(){
        System.out.println("Inside Constructor");
    }
    {
        System.out.println("Inside the second Instance Initializer Block");
    }
    static{
        System.out.println("Inside the second Static Block");
    }
    public static void main(String[] args){
        Order o = new Order();
    }
}
