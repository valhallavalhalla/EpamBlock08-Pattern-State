package examples.human;

/**
 * Context
 */
public class Human {

    private Activity activityState;

    public void setActivityState(Activity activityState) {
        this.activityState = activityState;
    }

    public void doSomething() {
        activityState.doSomething(this);
    }

}
