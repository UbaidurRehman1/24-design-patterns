package structural.adapter.thirdpartylib;

import structural.adapter.existingSDK.datatype.JSON;

public class AnalyzerImpl implements Analyzer {

    @Override
    public void analyze(JSON json) {
        System.out.printf("[%s]: analyzing resp: %s\n", getClass().getSimpleName(), json);
    }
}
