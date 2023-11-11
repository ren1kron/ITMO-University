package pokemons;

import attacks.Special.Absorb;

public class Roselia extends Budew {
    public Roselia(String name, int lvl) {
        super(name, lvl);
        setStats(50, 60, 45, 100, 80, 65);
        setMove(new Absorb());
    }
}
