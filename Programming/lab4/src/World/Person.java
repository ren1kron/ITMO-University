package World;

import Actions.PhysicalActivityType;
public class Person extends Character {
//    private KnowledgeLvl kLvl = KnowledgeLvl.UNKNOWN;
    private KnowledgeLvl kLvl = null;
    public Person(String name) {
        super(name);
    }
    public StateOfTheDay state;
    @Override
    public void toDo(PhysicalActivityType way) {
        System.out.print(getName());
        switch (way) {
            case ON_PATH_IN_GOOD_MOOD:
                System.out.println(" идёт по лесной дорожке в солнечном и безоблачном настроении, думая, что дважды девятнадцать – это пустяки.");
                break;
            case OUT_OF_REEDS:
                System.out.println(" появился из камышей");
                break;
            case LEAN_OVER_THE_RIVER:
                System.out.println(" наклоняется над рекой");
                break;
            case STAND_ON_BRIDGE:
                System.out.println(" встаёт на нижнюю перекладину перил моста");
                break;
            case COME_UP_TO_BRIDGE:
                System.out.println(" подошёл к мосту");
                break;
            case BE_IN_RIVER:
                System.out.println(" был в реке");
                break;
            case BE_NOT_IN_RIVER:
                System.out.println(" уже не в реке");
                break;
            case FALL_IN_RIVER_ACCIDENTALY:
                System.out.println(" свалился в реку случайно");
                break;
            case FALL_IN_RIVER_ON_PURPOSE:
                System.out.println(" свалился в реку нарочно");
                break;
            case OUT_OF_FOREST:
                System.out.println(" вышел из леса");
                break;
            case STAY_ON_BRIDGE:
                System.out.println(" остался на мосту");
                break;
        }
    }

    @Override
    public void toDo(String sth) {
        System.out.println(getName() + " сделал: " + sth);
    }

    @Override
    public void goWith(Person pers) {
        System.out.println(getName() + " идёт с " + pers);
    }

    @Override
    public void understand(String und) {
        System.out.println(getName() + " понял, что " + und);
    }
    @Override
    public void tell(Func func) {
        System.out.println(getName() + " сказал, что");
        System.out.print("\t");
        func.call();
    }

    @Override
    public void explain(String thing, Person pers) {
        System.out.println(getName() + " объясняет персонажу " + pers.getName() +": "+ thing);
    }

    @Override
    public void answer(String speech) {
        System.out.println(getName() + " ответил: \"" + speech + "\"");
    }
    @Override
    public void thinking(String thoughts) {
        System.out.println(getName() + " подумал " + thoughts);
    }

    @Override
    public void dream(Func func) {
        System.out.println("–––" + getName() + " воображает:");
        func.call();
        System.out.println("–––"+ getName() + " закончил воображать\n");
    }
    @Override
    public void see(River river) {
        if (!river.chk()) {
            System.out.println(getName() + " увидел своих друзей");
        }
    }

    public void chgLvl(KnowledgeLvl kLvl) {
        this.kLvl = kLvl;
        System.out.println(getName() + " теперь знает " + kLvl.getKLvl());
    }
    public void extractLvl(Person person) {
        try {
            this.kLvl = person.kLvl;
            System.out.println(person.getName() + " передал персонажу " + getName() + " свои знания и теперь уровень знаний персонажа " + getName() + ": " + kLvl.getKLvl());
        } catch (NullPointerException npe) { // unchecked (runtimeException)
            System.out.println(person.getName() + " ничего не понимает и попытался что-то объяснить персонажу " +
                    getName() + " и теперь они вдвоём ничего не понимают");
        }
    }

    public void setState(StateOfTheDay state) {
        this.state = state;
        System.out.println(getName() + " понял, что сегодня день, когда " + state.getsDay());
    }
    public void win() {
        System.out.println(getName() + " выигрывает чаще всех");
    }
}

