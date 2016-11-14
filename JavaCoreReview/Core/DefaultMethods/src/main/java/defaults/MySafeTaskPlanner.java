package defaults;

import java.util.List;

/**
 * Created by Dasha on 11/14/2016.
 */
public class MySafeTaskPlanner implements SafeTaskPlanner {
    @Override
    public void planTasks(List<Task> tasks) {
        System.out.println("Tasks are being planned extremely safely for default user");
    }

    @Override
    public void planTasksForUserName(List<Task> tasks, String username) {
        System.out.println("Tasks are being planned extremely safely for user" + username);
    }

    @Override
    public String dummyMethod() {
        return "Had to implement this since it was redeclared to be abstract";
    }
}
