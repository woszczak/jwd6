import java.util.Objects;

public class Product {

    public String name;
    private double price;

    //alt ins constructor:
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

//alt ins --> equals and haash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

}
