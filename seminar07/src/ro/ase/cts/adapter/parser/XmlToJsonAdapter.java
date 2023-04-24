package ro.ase.cts.adapter.parser;

public class XmlToJsonAdapter extends XmlParser implements JsonParser {
//    private XmlParser xmlParser;

//    public XmlToJsonAdapter(XmlParser xmlParser) {
//        this.xmlParser = xmlParser;
//    }

    @Override
    public void parseJson(String json) {
        String xml = convertJsonToXml(json);
        this.parseXml(xml);
    }

    private String convertJsonToXml(String json) {
        // code to convert JSON to XML

        return "";
    }
}
