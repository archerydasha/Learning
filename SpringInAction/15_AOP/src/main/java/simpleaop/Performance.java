package simpleaop;

/**
 * Created by Dasha on 5/16/2016.
 */
public abstract class Performance {
    private String name;

    public Performance(String name) {
        this.name = name;
    }

    public void perform() {
        System.out.println("Performance " + name + " " +
                "is going on!");
    }
}
