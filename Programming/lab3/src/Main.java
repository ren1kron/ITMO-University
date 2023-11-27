import Actions.*;
import World.*;

public class Main {
    public static void main(String[] args) {
        Person donkey = new Person("Иа");
        Person tiger = new Person("Тигра");
        Person boy = new Person("Кристофер Робин");
        Person bear = new Person("Пух");
        Sound crackle = new Sound("треск");

        River river = new River();
        river.addPers(donkey);
        river.addPers(tiger);
        river.addPers(boy);
        river.addPers(bear);

        String donkeyThoughts = "ответить";
        donkey.thinking(donkeyThoughts);
        crackle.makeSound();
        tiger.go(Going.OUT_OF_REEDS);
        System.out.println();

        boy.go(Going.ON_PATH_IN_GOOD_MOOD);
        boy.dream();
        System.out.print("\t");
        boy.go(Going.STAND_ON_BRIDGE);
        System.out.print("\t");
        boy.go(Going.LEAN_OVER_THE_RIVER);
        System.out.print("\t");
        boy.chgLvl(KnowledgeLvl.All);
        System.out.print("\t");
        bear.extractLvl(boy); // поменять нейминг

        boy.go(Going.COME_UP_TO_BRIDGE);
        boy.see(river);
        boy.setState(StateOfTheDay.WORKING);
    }
}