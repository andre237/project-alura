package solid.project_3;

public class Purchase {

    private final String productName;
    private final double productPrice;

    public Purchase(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
