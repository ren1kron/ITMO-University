package Actions;

import World.Func;
import World.Person;
import World.Location;
import World.StateOfTheDay;

public interface Sapience {
    void thinking(String thoughts);
    void dream(Func func);
    void see(Location location);
    void setState(StateOfTheDay state);
    void answer(String answer);
    void understand(String und);
    void tell(Func call);
    void explain(String thing, Person pers);
    default void findOut(String sth) {
        System.out.println("Вы обнаруживаете, что " + sth);
    }
}
