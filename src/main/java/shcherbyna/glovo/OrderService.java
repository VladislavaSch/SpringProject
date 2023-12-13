package shcherbyna.glovo;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class OrderService {
    List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }

    public Order getOrder(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void editOrder(int orderId, Order newOrderData) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == orderId) {
                orders.set(i, newOrderData);
                break;
            }
        }
    }

    public void deleteOrder(int orderId) {
        orders.removeIf(order -> order.getId() == orderId);
    }

}
