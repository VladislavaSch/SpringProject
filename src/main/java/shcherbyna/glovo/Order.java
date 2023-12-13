package shcherbyna.glovo;

import lombok.Getter;


import java.time.LocalDate;
import java.util.List;

@Getter
public class Order {
    private int id;
    private LocalDate date;
    private double cost;
    private List<Product> products;

    public Order(int id, LocalDate date, List<Product> products) {
        this.id = id;
        this.date = date;
        this.products = products;
        calculateOrderCost();
    }

    private void calculateOrderCost() {
        this.cost = products.stream().mapToDouble(Product::getCost).sum();
    }

    @Override
    public String toString() {
        return "Order ID: " + this.getId() + "\n Date: " + this.getDate() + "\n Cost: "
                + this.getCost() + "\n Product: " + this.getProducts();
    }
}
