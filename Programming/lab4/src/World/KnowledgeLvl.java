package World;

public enum KnowledgeLvl {
    All("Всё на свете"),
    NOT_ALL("Не всё на свете"),
    UNKNOWN("");

    private final String kLvl;

    KnowledgeLvl(String kLvl) {
        this.kLvl = kLvl;
    }
    public String getKLvl() {
        return kLvl;
    }
}
