package structural.adapter.existingSDK.datatype;

public abstract class JSON {
    private String name;
    private Long price;

    public JSON(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
