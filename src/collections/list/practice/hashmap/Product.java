package collections.list.practice.hashmap;

import java.util.Objects;


public class Product {
    String typeToy;

    public Product (String typeToy) {
        this.typeToy =typeToy;
    }

    public String getHeightToy (String typeToy) {
        return typeToy;
    }

    public String toString () {
        return " Игрушка " + typeToy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(typeToy, product.typeToy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeToy);
    }
}
