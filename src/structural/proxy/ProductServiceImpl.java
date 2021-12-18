package structural.proxy;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductServiceImpl implements ProductService {
    
    private final Random random = new Random();

    @Override
    public Product get(Long id) {
        System.out.println("Getting Product of id " + id);
        try {
            networkExp();
            Product product = generateProduct(id);
            System.out.printf("Got %s of id %d\n", product, id);
            return product;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private void networkExp() throws InterruptedException {
        Thread.sleep(1000);
    }
    
    
    private Product generateProduct(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setCategory(generateRandomString());
        product.setTitle(generateRandomString());
        product.setDescription(generateRandomString() + generateRandomString() + generateRandomString());
        product.setPrice(random.nextDouble(50));
        Rating rating = new Rating();
        rating.setRate(random.nextFloat(5));
        rating.setCount(random.nextLong(200));
        product.setRating(rating);
        return product;
    }
    
    private String generateRandomString() {
        String alphabet = "abcde fghijkl mnopqrs tuvwxyz";
        return IntStream.range(0, 10)
            .mapToObj(counter -> {
                int index = random.nextInt(alphabet.length());
                return alphabet.substring(index, index + 1).trim();
            })
            .collect(Collectors.joining());
    }
}
