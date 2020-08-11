public class Main {
    public static void main(String[] args){
        Parent p = new Parent();
        p.read();

        Parent p2 = new Child();
        p2.read();
    }
}
