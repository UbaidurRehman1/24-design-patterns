package structural.adapter.existingSDK;

import structural.adapter.existingSDK.datatype.JSON;
import structural.adapter.existingSDK.datatype.Product;

public class JSONFetcherImpl implements JSONFetcher {

    @Override
    public JSON fetch() {
        JSON resp = new Product("product2", 200L);
        System.out.printf("[%s]: fetched json response: %s\n", getClass().getSimpleName(), resp);
        return resp;
    }
}
