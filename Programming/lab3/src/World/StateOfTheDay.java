package World;

public enum StateOfTheDay {
    INSPIRING(""),
    WORKING("нужно что-то делать");
    private final String sDay;

    StateOfTheDay(String sDay) {
        this.sDay = sDay;
    }
    public String getsDay() {
        return sDay;
    }
}
