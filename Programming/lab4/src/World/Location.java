package World;

import java.util.HashSet;
import java.util.Set;

public class Location {
    Set<Character> location = new HashSet<>();
//    public River() {
//
//    }
    public void addPers(Character pers) {
        this.location.add(pers);
    }
//    @Override
//    public boolean isEmpty() {
//
//    }
    public boolean chk() {
        return location.isEmpty();
    }
//    class Inside {
//        private Character pers;
//        public Inside(Character pers) {
//            this.pers = pers;
//        }
//        public void clearRiver() {
//            this.pers = null;
//        }
//        public void getPersInRiver() {
//            System.out.println(this.pers.getName());
//        }
//    }
    public class Event {
        private String name;
        public Event(String name) {
            this.name = name;
//            System.out.println("Нанается " + name);
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void startEvent() {
            System.out.println("Начинается " + this.getName());
        }
    }
}
