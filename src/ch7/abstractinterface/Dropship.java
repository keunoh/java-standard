package ch7.abstractinterface;

public class Dropship extends AirUnit implements Repariable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }
}
