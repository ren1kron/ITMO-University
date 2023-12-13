package Actions;

import World.Character;
import World.Person;

public interface PhysicalActivity {
    void toDo(PhysicalActivityType way);
    void toDo(String sth);
    void goWith(Person pers);
}
