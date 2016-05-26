package implementation;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.setLocation(new Forest());

        for (int i = 0; i < 10; i++) {
            human.doAction();
        }

    }

}
