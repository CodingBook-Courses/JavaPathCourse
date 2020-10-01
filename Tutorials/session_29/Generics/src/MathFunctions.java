public class MathFunctions<T extends Number> {
    T x;

    public MathFunctions(T x){
        this.x = x;
    }
    public double Square(){
        return x.doubleValue()*x.doubleValue();
    }
}
