package MediatorPattern;

public class Demo {
    public static void main(String[] args) {
        User doran = new User("Doran");
        User kugou = new User("kugou");
        doran.sendMessage("hi kugou");
        kugou.sendMessage("hi doran");
    }
}
