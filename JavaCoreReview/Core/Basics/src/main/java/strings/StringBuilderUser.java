package strings;

/**
 * Created by Dasha on 9/15/2016.
 */
public class StringBuilderUser {
    public void useStringBuilder(){
        String s1 = "abcd";
        String s2 = "efgh";
        String result = new StringBuilder().append(s1).append(s2).toString();
    }
}
