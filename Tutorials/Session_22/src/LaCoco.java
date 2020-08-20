public class LaCoco extends PizzaRestaurant{
    public LaCoco(String name, String cuisine, Rating rating, Address address) {
        super(name, cuisine, rating, address);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getCuisine() {
        return super.getCuisine();
    }

    @Override
    public Rating getRating() {
        return super.getRating();
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }
}
