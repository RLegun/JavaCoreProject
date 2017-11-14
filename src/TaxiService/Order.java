package TaxiService;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private LocalDateTime orderTime;
    private Client client;
    private TaxiDriver driver;
    private double payment;
    private double distance;
    private FeedBack feedBack;
    private OrderStatus status;

    public Order(LocalDateTime orderTime, Client client, TaxiDriver driver, double payment, double distance,
                 FeedBack feedBack, OrderStatus status) {
        this.id = OrderList.getOrders().size()+1;
        this.orderTime = orderTime;
        this.client = client;
        this.driver = driver;
        this.payment = payment;
        this.distance = distance;
        this.feedBack = feedBack;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TaxiDriver getDriver() {
        return driver;
    }

    public void setDriver(TaxiDriver driver) {
        this.driver = driver;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public FeedBack getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(FeedBack feedBack) {
        this.feedBack = feedBack;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Замовлення{" +
                "id=" + id +
                ", час відправлення=" + orderTime +
                ", клієнт=" + getClient().getName() +
                ", статус-клієнта=" + getClient().getClientStatus() +
                ", таксі=" + getDriver().getCar().getId() +
                ", статус-замовлення=" + status +
                '}';
    }
}
