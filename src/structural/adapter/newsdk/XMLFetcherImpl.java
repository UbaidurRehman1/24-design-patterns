package structural.adapter.newsdk;

import structural.adapter.newsdk.datatype.Product;
import structural.adapter.newsdk.datatype.XML;

public class XMLFetcherImpl implements XMLFetcher {

    @Override
    public XML fetchXML() {
        XML resp = new Product("Product 1", 100L);
        System.out.printf("[%s]: fetched xml response: %s\n", getClass().getSimpleName(), resp);
        return resp;
    }
}
