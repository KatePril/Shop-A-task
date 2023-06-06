package app.models;

public class OrderB extends Order{

    private double delivery;

    public OrderB(String code, double delivery) {
        super(code);
        this.delivery = delivery;
    }

    public double getOrderCost(double quantity, double price) {
        return quantity * price + delivery;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }
}
