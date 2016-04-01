package jconf;
/**
 * Created by Dasha on 18.03.16.
 */
public class CDPlayer {
    private CD disc;

    public CDPlayer(CD disc) {
        this.disc = disc;
    }
    public void turnOn(){
        disc.play();
    }
}
