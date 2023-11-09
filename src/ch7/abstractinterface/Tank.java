package ch7.abstractinterface;

public class Tank extends GroundUnit implements Repariable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

}
