package Actions;

import World.Character;
import World.River;
import World.StateOfTheDay;

import java.lang.reflect.Array;
import java.util.Set;

public interface Sapience {
    void thinking(String thoughts);
//    public void dream(String string, String result);
    void dream(String sting);
    void see(River river);
    void setState(StateOfTheDay state);
}
