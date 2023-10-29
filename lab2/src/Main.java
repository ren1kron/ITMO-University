import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Noibat("aka мыш", 1);
        Pokemon p2 = new Dedenne("aka деденя:)", 1);
        Pokemon p3 = new Noivern("aka мыш побольше",1);
        Pokemon p4 = new Budew("aka крип", 1);
        Pokemon p5 = new Roselia("aka роза",1);
        Pokemon p6 = new Roserade("aka роза побольше",1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}