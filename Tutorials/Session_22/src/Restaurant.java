public class Restaurant {

    private String name;
    private String cuisine;
    private Rating rating;
    private Address address;

    public Restaurant(String name, String cuisine, Rating rating, Address address) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public Rating getRating() {
        return rating;
    }

    public Address getAddress() {
        return address;
    }
}
