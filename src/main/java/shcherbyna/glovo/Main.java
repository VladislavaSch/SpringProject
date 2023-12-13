package shcherbyna.glovo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Pen",23);
        Product product2 = new Product(2,"book", 250);
        Product product3 = new Product(3,"magazine", 45);

        List <Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        List <Product> productsUp = new ArrayList<>();
        productsUp.add(product2);

        Order order1 = new Order(1, LocalDate.now(), products);
        Order orderUp = new Order(2,LocalDate.now(),productsUp);

        OrderService orderService = new OrderService();

        orderService.addOrder(order1);

        System.out.println("Test all orders");
        System.out.println(orderService.getAllOrders());

        System.out.println("Test order by id");
        System.out.println(orderService.getOrder(1));

        orderService.editOrder(1,orderUp);

        System.out.println("Test edit order");
        System.out.println(orderService.getAllOrders());

        orderService.deleteOrder(2);

        System.out.println("Test delete");
        System.out.println(orderService.getAllOrders());

    }
}
