public class Rating {
    private int totalRatings;
    private double averageRatings;
    private String userRating;

    public Rating(int totalRatings, double averageRatings, String userRating) {
        this.totalRatings = totalRatings;
        this.averageRatings = averageRatings;
        this.userRating = userRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public double getAverageRatings() {
        return averageRatings;
    }

    public String getUserRating() {
        return userRating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "totalRatings=" + totalRatings +
                ", averageRatings=" + averageRatings +
                ", userRating='" + userRating + '\'' +
                '}';
    }
}
