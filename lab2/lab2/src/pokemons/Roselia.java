package pokemons;

import attacks.Special.Absorb;
import attacks.Special.EnergyBall;
import attacks.Special.Venoshock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon {
    public Roselia(String name, int lvl) {
        super(name, lvl);

        setType(Type.GRASS, Type.POISON);
        setStats(50, 60, 45, 100, 80, 65);
        setMove(new Venoshock(), new EnergyBall(), new Absorb());
    }
}
