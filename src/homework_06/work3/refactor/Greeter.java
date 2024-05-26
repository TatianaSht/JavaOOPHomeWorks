package homework_06.work3.refactor;

public class Greeter {

    private Greet greet;

    public Greeter(Greet greet) {
        this.greet = greet;
    }

    public String phrases() {
        return this.greet.phrase();
    }
}
