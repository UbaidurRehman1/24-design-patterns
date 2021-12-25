package structural.adapter.newsdk.datatype;

public abstract class XML {
    private String name;
    private Long price;

    public XML(String name, Long price) {
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
        return """
                    \n
                    <product>
                        <name>%s</name>
                        <price>%d</price>
                    </product>
               """.formatted(getName(), getPrice());
    }
}
