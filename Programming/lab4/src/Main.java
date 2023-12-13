import Actions.*;
import World.*;
import World.Characters.Pooh;

public class Main {
    public static void main(String[] args) {
        Person donkey = new Person("Иа") {
            @Override
            public void answer(String speech) {
                System.out.println(getName() + " хотел ответить: \"" + speech + "\". Но не успел");
            }
        };
        Person tiger = new Person("Тигра");
        Person boy = new Person("Кристофер Робин");
        Pooh bear = new Pooh("Пух");

        Person they = new Person("Они"){
            @Override
            public void toDo(String sth) {
                System.out.println(getName() + " сделали: " + sth);
            }
        };
        Person ru = new Person("Крошка Ру");
        Person kenga = new Person("Кенга");
        Person rabbit = new Person("Кролик");
        Person pig = new Person("Пятачок");


        Sound crackle = () -> System.out.println("*раздался треск*");

        River river = new River();
        river.addPers(donkey);
        river.addPers(tiger);
        river.addPers(boy);
        river.addPers(bear);

        bear.takingComfort();
        Narrator.suggesting();
        donkey.toDo(PhysicalActivityType.BE_IN_RIVER);
        donkey.toDo(PhysicalActivityType.BE_NOT_IN_RIVER);
        bear.toDo("ничего плохого");


        System.out.println();

//        String donkeyThoughts = "ответить";
        String donkeyAnswer = "что-то";
        donkey.answer(donkeyAnswer);
        crackle.makeSound();
        tiger.toDo(PhysicalActivityType.OUT_OF_REEDS);
        System.out.println();

        boy.toDo(PhysicalActivityType.ON_PATH_IN_GOOD_MOOD);

        boy.dream(() -> {
            boy.toDo(PhysicalActivityType.STAND_ON_BRIDGE);
            boy.toDo(PhysicalActivityType.LEAN_OVER_THE_RIVER);
            boy.chgLvl(KnowledgeLvl.All); // если закоментить эту строчку, то сработает exception
            bear.extractLvl(boy);
        });

        boy.toDo(PhysicalActivityType.COME_UP_TO_BRIDGE);
        boy.see(river);
        boy.setState(StateOfTheDay.WORKING);

//        Так они и сделали
        they.toDo("именно это");
        donkey.win();
        ru.toDo(PhysicalActivityType.FALL_IN_RIVER_ACCIDENTALY);
        kenga.toDo(PhysicalActivityType.OUT_OF_FOREST);
        ru.understand("придётся идти спать");
        ru.toDo(PhysicalActivityType.FALL_IN_RIVER_ON_PURPOSE);
        rabbit.tell(() -> rabbit.goWith(ru));
        donkey.explain("как играть в пустяки", tiger);
        tiger.goWith(donkey);
        boy.toDo(PhysicalActivityType.STAY_ON_BRIDGE);
        bear.toDo(PhysicalActivityType.STAY_ON_BRIDGE);
        pig.toDo(PhysicalActivityType.STAY_ON_BRIDGE);
    }
}