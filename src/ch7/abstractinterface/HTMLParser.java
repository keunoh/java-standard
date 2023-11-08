package ch7.abstractinterface;

public class HTMLParser implements Parsable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML parsing completed.");
    }
}
