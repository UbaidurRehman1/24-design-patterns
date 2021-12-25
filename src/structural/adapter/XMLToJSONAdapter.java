package structural.adapter;

import structural.adapter.existingSDK.JSONFetcher;
import structural.adapter.existingSDK.datatype.JSON;
import structural.adapter.existingSDK.datatype.Product;
import structural.adapter.newsdk.XMLFetcher;
import structural.adapter.newsdk.datatype.XML;

public class XMLToJSONAdapter implements JSONFetcher {

    private final XMLFetcher xmlFetcher;

    public XMLToJSONAdapter(XMLFetcher xmlFetcher) {
        this.xmlFetcher = xmlFetcher;
    }

    @Override
    public JSON fetch() {
        
        //delegate to original service
        XML xml = xmlFetcher.fetchXML();
        //do conversion here (in this case, converting XML to JSON)
        JSON json = new Product(xml.getName(), xml.getPrice());
        System.out.printf("[%s]: converting xml response: %s to json resp %s\n", getClass().getSimpleName(), xml, json);
        return json;
    }
}
