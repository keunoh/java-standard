package ch7.abstractinterface;

public class SCV extends GroundUnit implements Repariable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repariable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println("Job Done!");
        }
    }
}
