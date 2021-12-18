package structural.proxy;

import java.util.Random;
import java.util.stream.LongStream;

public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        long startTime = System.nanoTime();
        ProductService productService = new ProductServiceImpl();
        LongStream.range(0, 20).forEach(i -> productService.get(random.nextLong(5) + 1));
        long endTime = System.nanoTime();
        System.out.println("----------------------------------------Total Time without proxy: " + ((endTime - startTime)/1000000) + " ms");

        startTime = System.nanoTime();
        ProductService proxyProductService = new ProductServiceProxy();
        LongStream.range(0, 20).forEach(i -> proxyProductService.get(random.nextLong(5) + 1));
        endTime = System.nanoTime();
        System.out.println("----------------------------------------Total Time with proxy: " + ((endTime - startTime)/1000000) + " ms");
    }
}
