package builder;

public class Product {
    
    private String name;
    private String code;
    private String status;

    public Product(String name, String code, String status) {
        this.name = name;
        this.code = code;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
