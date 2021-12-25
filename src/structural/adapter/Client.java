package structural.adapter;

import structural.adapter.existingSDK.JSONFetcher;
import structural.adapter.existingSDK.JSONFetcherImpl;
import structural.adapter.newsdk.XMLFetcher;
import structural.adapter.newsdk.XMLFetcherImpl;
import structural.adapter.thirdpartylib.Analyzer;
import structural.adapter.thirdpartylib.AnalyzerImpl;

public class Client {

    Analyzer analyzer;
    JSONFetcher jsonFetcher;
    XMLFetcher xmlFetcher;
    
    JSONFetcher xmlToJSONAdapter;
    
    public static void main(String[] args) {
        new Client().app();
    }
    
    public void app() {
        // existing requirement
        analyzer = new AnalyzerImpl();
        jsonFetcher = new JSONFetcherImpl();
        analyzer.analyze(jsonFetcher.fetch());
        
        // new requirement
        xmlFetcher = new XMLFetcherImpl();
        //analyzer.analyze(xmlFetcher.fetchXML()); will not work as analyzer want JSON (not xml)
        
        // here adapter comes
        // here we are targeting JSONFetcher while adapting XMLFetcher
        
        xmlToJSONAdapter = new XMLToJSONAdapter(xmlFetcher);
        analyzer.analyze(xmlToJSONAdapter.fetch());
        
    }
}
