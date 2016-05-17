package parameters;

/**
 * Created by Dasha on 5/17/2016.
 */
public class Track {
    private String name;

    public Track(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("Track " + name + " playing");
    }
}
