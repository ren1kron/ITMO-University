package World;

import Actions.Going;
public class Person extends Character {
    private KnowledgeLvl kLvl = KnowledgeLvl.UNKNOWN;
    public Person(String name) {
        super(name);
    }
    public StateOfTheDay state;
    @Override
    public void go(Going way) {
        System.out.print(getName());
        switch (way) {
            case ON_PATH_IN_GOOD_MOOD:
//                Кристофер Робин шел по лесной дорожке в таком солнечном и безоблачном настроении, как будто бы,
//                например, дважды девятнадцать-- это пустяки, и думал о том, что, если он в такой день встанет на
//                нижнюю перекладину перил моста и наклонится над рекой, он вдруг узнает все-все на свете и тогда
//                он расскажет все это Пуху, который пока еще знает не все на свете.
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
        }
    }

    @Override
    public void thinking(String thoughts) {
        System.out.println(getName() + " подумал " + thoughts);
    }
//    @Override
//    public void dream(String requirement, String result) {
//        System.out.println(getName() + " представляет, что если сегодня " + requirement + ", то " + result);
//    }
    @Override
    public void dream(String func) {
        System.out.println(getName() + " воображает:");
        System.out.println(func);
        System.out.println("Наваждение прошло");
//        if start_end.equals("начало наваждения") {
//            System.out.println("В воображении " + getName());
//        }
//        if start_end.equals("конец наваждения") {
//
//        }
    }
    @Override
    public void see(River river) {
        if (!river.chk()) {
            System.out.println(getName() + " увидел своих друзей");
        }
    }

    public void chgLvl(KnowledgeLvl kLvl) {
        this.kLvl = kLvl;
        System.out.println(getName() + " теперь знает " + kLvl.getkLvl());
    }
    public void extractLvl(Person person) {
        KnowledgeLvl Know = person.kLvl;
        this.kLvl = Know;
        System.out.println(person.getName() + " передал персонажу " + getName() + " свои знания и теперь уровень знаний персонажа " + getName() + ": " + kLvl.getkLvl());
    }

    public void setState(StateOfTheDay state) {
        this.state = state;
        System.out.println(getName() + " понял, что сегодня день, когда " + state.getsDay());
    }
}

