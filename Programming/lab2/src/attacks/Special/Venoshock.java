package attacks.Special;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON,65,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p,double damage) {
        if(p.getCondition()== Status.POISON) {
            p.setMod(Stat.HP, (int) Math.round(damage*2));
        }
        else {
            p.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
    @Override
    protected String describe() {
        return "is applying Venoshock!!";
    }
}
