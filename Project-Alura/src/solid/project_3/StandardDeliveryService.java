package solid.project_3;

public class StandardDeliveryService implements DeliveryService {

    @Override
    public double deliveryPriceTo(String city) {
        return city.equalsIgnoreCase("BRAZIL") ? 50 : 100;
    }
}
