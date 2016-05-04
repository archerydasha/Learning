package custom;

/**
 * Created by Dasha on 04.05.2016.
 */
public abstract class Dessert {
    private String name;

    protected Dessert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
