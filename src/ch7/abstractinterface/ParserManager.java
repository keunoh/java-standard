package ch7.abstractinterface;

public class ParserManager {
    // 리턴 타입이 Parsable 인터페이스이다.
    public static Parsable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        }
        else if (type.equals("HTML")){
            Parsable p = new HTMLParser();
            return p;
        }
        else {
            return new DefaultParser();
        }
    }
}
