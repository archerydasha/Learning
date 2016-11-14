package defaults;

import java.util.List;

/**
 * Created by Dasha on 11/14/2016.
 */
public class MyTaskPlanner implements TaskPlanner {
    @Override
    public void planTasks(List<Task> tasks) {
        System.out.println("Tasks are being planned for current user");
    }

    @Override
    public void planTasksForUserName(List<Task> tasks, String username) {
        System.out.println("Tasks are being planned for user " + username);
    }
}
