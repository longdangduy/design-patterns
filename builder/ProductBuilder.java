package builder;

public class ProductBuilder {

    // assumption we have Product class with attribute code, name and status
    private Product product;

    public ProductBuilder() {

        model = new Product();
        model.setCode("apple");
        model.setName("Apple");
        model.setStatus("active");
    }

    public ProductBuilder withCode(String code) {
        this.product.setCode(code);
        return this;
    }

    public ProductBuilder withName(String name) {
        this.product.setName(name);
        return this;
    }

    public ProductBuilder withStatus(String status) {
        this.product.setStatus(status);
        return this;
    }

    public Product build() {
        return new Product(product.getCode(), product.getName(), product.getStatus());
    }
}

// In using: 
// Product appleProduct = new ProductBuilder().build();
// Product lemonProduct = new ProductBuilder().withCode("lemon").withName("Lemon").withStatus("inactive");
