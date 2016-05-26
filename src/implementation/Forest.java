package implementation;

public class Forest implements Location {

    @Override
    public void doAction(Human human) {
        System.out.println("What a beautiful forest!");
        System.out.println("Let's seek for mushrooms!");
        human.setLocation(new River());
    }

}
