package examples.human;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.setActivityState(new Work());

        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }

    }

}
