package pokemons;

import attacks.Special.Absorb;
import attacks.Special.EnergyBall;
import attacks.Special.Venoshock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Pokemon {
    public Roserade(String name, int lvl) {
        super(name, lvl);

        setType(Type.GRASS, Type.POISON);
        setStats(60,70,65,125,105,90);
        setMove(new Venoshock(), new EnergyBall(), new Absorb(),new Venoshock());
    }
}

