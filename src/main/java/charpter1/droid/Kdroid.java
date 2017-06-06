package charpter1.droid;

/**
 * Created by qingyuan on 6/6/17.
 */
public class Kdroid {

    private String name;

    private DriveTask driveTask;

    public Kdroid(String name) {
        this.name = name;
        driveTask = new DriveTask();
    }

    public String workOnTadk() {
        return driveTask.doing();
    }
}
