public class Triangle extends Polygon{
    @Override
    public void Sides() {
        System.out.println("Has 3 sides");
    }

    @Override
    public void setSides(int sides) {
        super.sides = sides;
    }
}
