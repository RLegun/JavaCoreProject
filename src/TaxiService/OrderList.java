package TaxiService;

import java.util.ArrayList;

public class OrderList {
    private static ArrayList<Order> orders = new ArrayList<>();

    public static ArrayList<Order> getOrders() {
        return orders;
    }

    public static void setOrders(ArrayList<Order> orders) {
        OrderList.orders = orders;
    }

    public static void setOrders(Order order) {
        orders.add(order);
    }

    public static void showOrders() {

        if (orders.isEmpty())
            System.out.println("Не має виконаних замовлень!");
        else for (Order item:orders) System.out.println(item);
    }
}
