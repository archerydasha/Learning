package defaults;

import java.util.List;

/**
 * Created by Dasha on 11/14/2016.
 */
public interface SafeTaskPlanner extends TaskPlanner{
    default void planTasksForUserEmail(List<Task> tasks, String email){
        String username = UserDao.getUserByEmail(email);
        if(username == null){
            username = "anonymous";
        }
        planTasksForUserName(tasks, username);
    }

    String dummyMethod();
}
