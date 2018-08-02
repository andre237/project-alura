package solid.project_3;

public class Test {

    public static void main(String[] args) {
        Purchase purchase = new Purchase("Electric car", 5300.00);

        PriceTable table = new StandardPriceTable();
        DeliveryService service = new StandardDeliveryService();

        PriceCalculator calculator = new PriceCalculator(table, service);

        System.out.println("Value of this purchase: " + calculator.calculatePrice(purchase));
    }

}
