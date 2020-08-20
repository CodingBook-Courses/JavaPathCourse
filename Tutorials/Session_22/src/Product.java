public class Product {
    private String name;
    private Rating rating;
    private double price;

    public Product(String name, Rating rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Rating getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
