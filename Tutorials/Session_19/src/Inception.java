public class Inception extends Movie{

    private String actor3;
    private String actor4;

    public Inception(String name, String plot, String director, String producer, String actor1, String actor2, String actor3, String actor4) {
        super(name, plot, director, producer, actor1, actor2);
        this.actor3 = actor3;
        this.actor4 = actor4;
    }

    public Inception(String name, String plot, String director, String producer, String actor1, String actor2, String actor3) {
        this(name, plot, director, producer, actor1, actor2, actor3, "Leonardo Decaprio");
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    public void setActor4(String actor4) {
        this.actor4 = actor4;
    }

    @Override
    public void getPlot() {
        super.getPlot();
        System.out.println("This movie was mind blowing!");
    }

    private void getPlot(int timesIWatched) {
        super.getPlot();
        System.out.println("I watched this movie " + timesIWatched + " times.");
    }
}
