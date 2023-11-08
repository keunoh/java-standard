package ch7.abstractinterface;

public class DefaultParser implements Parsable{
    @Override
    public void parse(String fileName) {
        System.out.println("DefaultParser.parse");
    }
}
