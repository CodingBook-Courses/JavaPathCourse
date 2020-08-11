public class Shoe {
    private double size;
    private String color;
    private String brand;

    Shoe(double s, String c, String b){ //s = 40, c = white
        this.size = s;
        this.color = c;
        this.brand = b;
    }
    public double getSize(){
        return size;
    }
    public void setSize(double s){
        this.size = s;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c;
    }
}
