package multiple;

/**
 * Created by Dasha on 11/15/2016.
 */
public interface Animal {
    default String identifyMyself(){
        return "I am an animal";
    }
}
