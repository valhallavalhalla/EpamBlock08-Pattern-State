package examples.human;

public class Weekend implements Activity {

    private int counter = 0;

    @Override
    public void doSomething(Human human) {
        if (counter < 3) {
            System.out.println("examples.human.Weekend...");
            counter++;
        } else {
            human.setActivityState(new Work());
            human.doSomething();
        }
    }

}
