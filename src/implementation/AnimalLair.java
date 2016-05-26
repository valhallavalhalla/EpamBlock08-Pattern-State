package implementation;

public class AnimalLair implements Location {

    @Override
    public void doAction(Human human) {
        System.out.println("I see the animal!");
        System.out.println("Let's hunt!");
        human.setLocation(new Forest());
    }

}
