package solid.project_3;

public class PriceCalculator {

    private final PriceTable table;
    private final DeliveryService service;

    /** PriceCalculator depende apenas das abstrações de PriceTable e DeliveryService e não de suas implementações,
     * podendo entao aceitar qualquer objeto que os implemente (Dependency Injection eh usado para menor acoplamento).
     * Isso permite que as classes permaneçam ABERTAS para expansão, pois eu poderia criar novas implementações de
     * PriceTable ou DeliveryService, e FECHADA para modificações, pois cada implementação tem sua regra e nao eh necessario modifica-las**/

    public PriceCalculator(PriceTable table, DeliveryService service) {
        this.table = table;
        this.service = service;
    }

    public double calculatePrice(Purchase purchase) {
        double discount = table.discountTo(purchase.getProductPrice());
        double freight = service.deliveryPriceTo("USA");

        return purchase.getProductPrice() * (1 - discount) + freight;
    }
}
