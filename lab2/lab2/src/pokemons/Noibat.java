package pokemons;

import attacks.Special.Absorb;
import attacks.Special.DreamEater;
import attacks.Status.Screech;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Noibat extends Pokemon {
    public Noibat(String name, int lvl){
        super(name,lvl);

        setType(Type.FLYING,Type.DRAGON);
        setStats(40,30,35,45,40,55);
        setMove(new DreamEater(), new Screech(), new Absorb());
    }
}
