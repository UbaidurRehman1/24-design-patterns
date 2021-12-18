package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceProxy implements ProductService {

    ProductService productService;
    Map<Long, Product> productCache = new HashMap<>();

    public ProductServiceProxy() {
        this.productService = new ProductServiceImpl();
    }

    @Override
    public Product get(Long id) {
        System.out.println("Proxy: Getting Product of id " + id);
        if (productCache.containsKey(id)) {
            Product product =  productCache.get(id);
            System.out.printf("%s is present in cache\n", product);
            return product;
        } else {
            System.out.printf("Product of id %d is not present in cache\n", id);
        }
        Product product = productService.get(id);
        if (product == null) {
            throw new RuntimeException("No product is found by this id");
        }
        productCache.put(id, product);
        return product;
    }
}
