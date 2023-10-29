package pokemons;

import attacks.Special.Absorb;
import attacks.Special.DreamEater;
import attacks.Special.FocusBlast;
import attacks.Status.Screech;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Noivern extends Pokemon {
    public Noivern(String name, int lvl){
        super(name,lvl);

        setType(Type.FLYING,Type.DRAGON);
        setStats(85,70,80,97,80,123);
        setMove(new DreamEater(), new Screech(), new Absorb(), new FocusBlast());
    }
}
