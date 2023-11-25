package World;

public class Sound {
    public String name;
    public Sound(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("*раздался " + name +"*");
    }
}
