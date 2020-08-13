public class Movie {
    private String name;
    private String plot;
    private String director;
    private String producer;
    private String actor1;
    private String actor2;

    public Movie(String name, String plot, String director, String producer, String actor1, String actor2) {
        this.name = name;
        this.plot = plot;
        this.director = director;
        this.producer = producer;
        this.actor1 = actor1;
        this.actor2 = actor2;
    }

    public String getName() {
        return name;
    }

    public void getPlot() {
        System.out.println("The plot is: " + this.plot);;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getActor1() {
        return actor1;
    }

    public String getActor2() {
        return actor2;
    }
}
