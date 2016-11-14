package defaults;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by Dasha on 11/14/2016.
 */
public class UserDao {
    static Map<String, String> userEmails = ImmutableMap.of("yuki@gmail.com", "yuki");
    public static String getUserByEmail(String email) {
        return userEmails.get(email);
    }
}
