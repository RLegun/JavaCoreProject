package TaxiService;

import java.time.LocalDateTime;

public class CreateNewOrder {

    public static Order newOrder() {
        Order order = null;


        if (ClientList.getWaitingClient().getClientStatus() == OrderStatus.WAITING) {
            if (TaxiDriverList.getFreeTaxi().getCar().getStatus() == TaxiStatus.FREE){
              order  = new Order(LocalDateTime.now(), ClientList.getWaitingClient(), TaxiDriverList.getFreeTaxi(),
                        0, 0, CreateNewFeedBack.newFeedBack(),OrderStatus.COMPLETED);

                order.setOrderTime(LocalDateTime.now());

                Client client = ClientList.getWaitingClient();
                client.setClientStatus(OrderStatus.COMPLETED);
                order.setClient(client);

                TaxiDriver taxiDriver = TaxiDriverList.getFreeTaxi();
                taxiDriver.getCar().setStatus(TaxiStatus.RESERVED);
                order.setDriver(taxiDriver);

                order.setPayment(100);

                order.setDistance(100);

                FeedBack feedBack = FeedBackList.myFeedBack();
                order.setFeedBack(feedBack);

                order.setStatus(OrderStatus.COMPLETED);

                OrderList.setOrders(order);

                System.out.println("Машина відправлена...");
            }

            else System.out.println("В нас не має свобідних машин!!!");
        } else System.out.println("В нас не має клієнтів!!!");

        return order;
    }
}
