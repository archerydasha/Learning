package javaconfig;

/**
 * Created by Dasha on 09.04.16.
 */
public class DomesticCat implements Cat{
    String name;

    public DomesticCat(String name) {
        this.name = name;
    }

    @Override
    public String meow() {
        return "Meow, I\'m " + name + ", I\'m fluffy and domestic\n";
    }
}
