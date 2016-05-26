package implementation;

public class Human {

    private Location location;

    public void doAction() {
        location.doAction(this);
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
