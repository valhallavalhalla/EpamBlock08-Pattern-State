package examples.human;

public class Work implements Activity {

    @Override
    public void doSomething(Human human) {
        System.out.println("Working...");
        human.setActivityState(new Weekend());
    }

}
