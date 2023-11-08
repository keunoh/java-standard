package ch7.abstractinterface;

public class ParserTest {
    public static void main(String[] args) {
        Parsable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
        parser = ParserManager.getParser("HIDDEN");
        parser.parse("document3.png");
    }
}
