package defaults;

import java.util.List;

/**
 * Created by Dasha on 11/14/2016.
 */
public interface TaskPlanner {
    void planTasks(List<Task> tasks);
    void planTasksForUserName(List<Task> tasks, String username);
    default void planTasksForUserEmail(List<Task> tasks, String email){
        String username = UserDao.getUserByEmail(email);
        planTasksForUserName(tasks, username);
    }
    default String dummyMethod(){
        return "I really can't think why this may be needed, but will still make an example to remember it better";
    }
}
