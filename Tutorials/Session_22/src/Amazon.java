import java.util.ArrayList;

public class Amazon {
    private String name;
    private ArrayList<Product> products;
    private String ceoName;
    private double stockPrice;

    public Amazon(String ceoName, double stockPrice) {
        this.name = "Amazon";
        this.ceoName = ceoName;
        this.stockPrice = stockPrice;
        this.products = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getCeoName() {
        return ceoName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
