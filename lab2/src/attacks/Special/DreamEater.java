package attacks.Special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC,100,100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double dmg) {
//        super.applyOppDamage(def, dmg);
        if (def.getCondition() == Status.SLEEP) {
            super.applyOppDamage(def, dmg);
        }
    }
    @Override
    protected void applySelfDamage(Pokemon att, double dmg) {
        att.setMod(Stat.HP, (int) -(power / 2));
    }
    @Override
    protected String describe() {
        return "is applying Dream Eater!!";
    }
}
