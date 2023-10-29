package pokemons;


import attacks.Special.EnergyBall;
import attacks.Special.Venoshock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int lvl){
        super(name,lvl);

        setType(Type.GRASS,Type.POISON);
        setStats(40,30,35,50,70,55);
        setMove(new Venoshock(), new EnergyBall());
    }
}
