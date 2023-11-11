package pokemons;

import attacks.Special.FocusBlast;


public class Noivern extends Noibat {
    public Noivern(String name, int lvl){
        super(name,lvl);
        setStats(85,70,80,97,80,123);
        setMove(new FocusBlast());
    }
}
