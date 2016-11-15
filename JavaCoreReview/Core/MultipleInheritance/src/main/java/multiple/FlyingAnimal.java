package multiple;

/**
 * Created by Dasha on 11/15/2016.
 */
public interface FlyingAnimal extends Animal {
    @Override
    default String identifyMyself(){
        return "I am an animal and I can fly";
    }
}
