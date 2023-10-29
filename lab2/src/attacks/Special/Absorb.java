package attacks.Special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS,20,100);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double dmg) {
        att.setMod(Stat.HP, (int) -(power / 2));
    }
    @Override
    protected String describe() {
        return "is applying Absorb!!";
    }
}
