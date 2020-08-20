import java.util.ArrayList;

public class Grubhub {
    private String name;
    private ArrayList<Restaurant> restaurants;
    private String ceoName;
    private double stockPrice;

    public Grubhub(String ceoName, double stockPrice) {
        this.name = "Grubhub";
        this.restaurants = new ArrayList<Restaurant>();
        this.ceoName = ceoName;
        this.stockPrice = stockPrice;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public String getCeoName() {
        return ceoName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }
}
