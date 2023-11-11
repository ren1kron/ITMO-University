package pokemons;

import attacks.Physical.AerialAce;
import attacks.Physical.Tackle;
import attacks.Special.Thunder;
import attacks.Status.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Dedenne extends Pokemon {

    public Dedenne(String name, int lvl) {
        super(name, lvl);

        setType(Type.ELECTRIC, Type.FAIRY);
        setStats(67, 58, 57, 81,67,101);
        setMove(new AerialAce(), new Thunder(), new Tackle(), new ThunderWave());
    }
}
