package attacks.Special;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.1) {
            p.setMod(Stat.DEFENSE,-1);
        }
    }
    @Override
    protected String describe() {
        return "is applying Energy Ball!!";
    }
}
