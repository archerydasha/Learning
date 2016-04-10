package javaconfig;

import java.util.List;

/**
 * Created by Dasha on 09.04.16.
 */
public class CatCafe {
    Menu menu;
    List<Cat> inhabitants;

    public CatCafe(Menu menu, List<Cat> inhabitants) {
        this.menu = menu;
        this.inhabitants = inhabitants;
    }

    public String printGreetings(){

        String result = "Hello! " +
                "This is a cat cafe with " + inhabitants.size() + " cats" +
                ". Here they are:\n";
        for(Cat cat : inhabitants){
            result += cat.meow();
        }
        result += "P.S. We now have " + menu.printMyself() + ". Enjoy!\n";
        return result;
    }
}
