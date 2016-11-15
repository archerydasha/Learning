package multiple;

/**
 * Created by Dasha on 11/15/2016.
 */
public interface ColdBloodAnimal extends Animal {
    @Override
    default String identifyMyself(){
        return "My blood is cold";
    }
}
