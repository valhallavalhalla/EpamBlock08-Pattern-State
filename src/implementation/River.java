package implementation;

/**
 * Created by andrii on 26.05.16.
 */
public class River implements Location {

    @Override
    public void doAction(Human human) {
        System.out.println("Look at this big river!");
        System.out.println("Let's fish!");
        human.setLocation(new AnimalLair());
    }

}
