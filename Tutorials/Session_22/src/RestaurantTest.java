public class RestaurantTest {
    public static void main(String[] args) {
        Address address1 = new Address("3350 W 47th St", "Chicago", "IL", 60632);
        Address address2 = new Address("9718 Grand Ave", "Franklin Park", "IL", 60131);
        Address address3 = new Address("6627 Roosevelt Rd", "Berwyn", "IL", 60402);

        Rating rating1 = new Rating(3805, 89, "Fast delivery, great pizza.");
        Rating rating2 = new Rating(1024, 95, "Extra thin just as I asked. Pizza was great.");
        Rating rating3 = new Rating(2994, 92, "Thin crust pizza is amazing.");

        Restaurant laCoco = new LaCoco("La Coco's Pizza & Pasta", "Pizza", rating1, address1);
        Restaurant grandStand = new GrandStand("Grand Stand Pizza", "Pizza", rating2, address2);
        Restaurant diNico = new DiNico("DiNico's Pizza", "Pizza", rating3, address3);

        for(int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println(laCoco.getName() + "\n"
                    + laCoco.getRating() + "\n"
                    + laCoco.getAddress() + "\n");
                    break;
                case 1:
                    System.out.println(grandStand.getName() + "\n"
                            + grandStand.getRating() + "\n"
                            + grandStand.getAddress() + "\n");
                    break;
                case 2:
                    System.out.println(diNico.getName() + "\n"
                            + diNico.getRating() + "\n"
                            + diNico.getAddress() + "\n");
                    break;
            }
        }

    }
}
