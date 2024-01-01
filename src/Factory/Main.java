package Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Chess().createChess(3);
        factory.getName();
    }
}
