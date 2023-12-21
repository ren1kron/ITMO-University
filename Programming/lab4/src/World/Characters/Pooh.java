package World.Characters;

import World.Person;

public class Pooh extends Person {
    public Pooh(String name) {
        super(name);
    }
    
//    public String headContent() {
//        return ""
//    }
    public static class Head {
        private static final String content = "Опилки";
        public static String getContent() {
            return "Медведь с предметом " + content + " в голове ";
        }

//    public static void setContent(String content) {
//        Head.content = content;
//    }
}
}
