public class GenericsExample<T, V, X> {
    T x;
    V y;
    X z;
    //String, Integer...

    public GenericsExample(T x, V y, X z){
        this.y = y;
        this.z = z;
        this.x = x;
    }

    public void printT(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
