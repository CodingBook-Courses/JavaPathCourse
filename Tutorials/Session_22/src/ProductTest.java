public class ProductTest {
    public static void main(String[] args) {
        Rating rating1 = new Rating(54066, 4.3, "This product is really good. I like the bass.");
        Rating rating2 = new Rating(5953, 4.4, "I like the sound quality, but not the bass.");
        Rating rating3 = new Rating(37301, 4.4, "I did not enjoy this product. But, good for this price.");

        Product tozoT10 = new TOZOT10("TOZO T10 Bluetooth 5.0 Wireless Earbuds", rating1, 34.99);
        Product samsungBuds = new SamsungGalaxyBuds("Samsung Galaxy Buds+ Plus, True Wireless", rating2, 149.00);
        Product cowin = new COWIN("COWIN E7 Active Noise Cancelling Headphone", rating3, 50.99);

        for(int i = 0; i < 3; i++) {
            switch(i) {
                case 0:
                    System.out.println(tozoT10.getName() + "\nTotal ratings are: " + tozoT10.getRating().getTotalRatings()
                    + "\nAverage star rating out of 5 is: " + tozoT10.getRating().getAverageRatings()
                    + "\nUser rating is: " + tozoT10.getRating().getUserRating()
                    + "The price is: " + tozoT10.getPrice() + "\n");
                    break;
                case 1:
                    System.out.println(samsungBuds.getName() + "\nTotal ratings are: " + samsungBuds.getRating().getTotalRatings()
                            + "\nAverage star rating out of 5 is: " + samsungBuds.getRating().getAverageRatings()
                            + "\nUser rating is: " + samsungBuds.getRating().getUserRating()
                            + "The price is: " + samsungBuds.getPrice() + "\n");
                    break;
                case 2:
                    System.out.println(cowin.getName() + "\nTotal ratings are: " + cowin.getRating().getTotalRatings()
                            + "\nAverage star rating out of 5 is: " + cowin.getRating().getAverageRatings()
                            + "\nUser rating is: " + cowin.getRating().getUserRating()
                            + "The price is: " + cowin.getPrice() + "\n");
                    break;
            }
        }
    }
}
