package World;

import java.util.HashSet;
import java.util.Set;

public class River {
    Set<Character> river = new HashSet<Character>();
//    public River() {
//
//    }
    public void addPers(Character pers) {
        this.river.add(pers);
    }
//    @Override
//    public boolean isEmpty() {
//
//    }
    public boolean chk() {
        return river.isEmpty();
    }
}
