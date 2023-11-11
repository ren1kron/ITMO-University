package pokemons;

import attacks.Special.Venoshock;

public class Roserade extends Roselia {
    public Roserade(String name, int lvl) {
        super(name, lvl);
        setStats(60,70,65,125,105,90);
        setMove(new Venoshock());
    }
}

