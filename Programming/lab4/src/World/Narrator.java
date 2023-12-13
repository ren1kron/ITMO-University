package World;

import World.Characters.Pooh;
import World.Characters.Pooh.Head;

public class Narrator {
//    Head head = new Pooh.Head();

    public static void suggesting() {
//        System.out.print("Рассказчик отмечает, что если Вы – ");
        System.out.println("*рассказчик отмечает*");
        System.out.print("---Если вы: ");
        class ChkHead {
            public static void getHeadContent() {
                System.out.print(Head.getContent());
            }
        }
        ChkHead.getHeadContent();
        Person you = new Person("Вы") {
            @Override
            public void thinking(String thoughts) {
                System.out.println("и " + getName() + " думаете " + thoughts);
            }
        };
        you.thinking("о делах");
        you.findOut(" мысль, которую вы счтали дельной, оказывается совсем не такой, когда на неё смотрят другие");
//"то вы иногда с огорчением обнаруживаете, что мысль, которая казалась вам очень дельной, пока она была у вас в голове,
// оказывается совсем не такой, когда она выходит наружу и на нее смотрят другие\n"
//        System.out.println("то вы иногда с огорчением обнаруживаете, что мысль, которая казалась вам очень дельной, пока она была у вас в голове, оказывается совсем не такой, когда она выходит наружу и на нее смотрят другие\n");
    }
}
