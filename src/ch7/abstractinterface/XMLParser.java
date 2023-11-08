package ch7.abstractinterface;

public class XMLParser implements Parsable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completd.");
    }
}
