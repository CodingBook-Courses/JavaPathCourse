public class Final {
    final double PI = 3.14;

    void changePi(double p){
        PI = p;
    }

    public static void main(String[] args){
        Final f = new Final();
        f.changePi(6);
        System.out.print(f.PI);
    }

}
