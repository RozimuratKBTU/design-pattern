package Strategy;

public class Run {
    public static void main(String[] args) {
        Dev dev = new Dev();

        dev.setActivity(new Sleep());
        dev.executeActivity();

        dev.setActivity(new Training());
        dev.executeActivity();
    }
}
