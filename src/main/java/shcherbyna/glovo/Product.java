package shcherbyna.glovo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private int id;
    private String name;
    private double cost;


    @Override
    public String toString() {
        return getName();
    }
}
