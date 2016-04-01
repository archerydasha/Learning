package mixing;

import mixing.brakes.Brakes;
import mixing.derailleur.Derailleur;
import mixing.frame.Frame;
import mixing.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 30.03.16.
 */
@Component
public class Bicycle {
    @Autowired
    OutputWriter writer;
    @Autowired
    Model model;
    @Autowired
    Brakes brakes;
    @Autowired @Qualifier("frontDerailleur")
    Derailleur smth;
    @Autowired
    Derailleur backDerailleur;
    @Autowired
    Frame frame;
    public void printMyself(){
        model.printMyself(writer);
        brakes.printMyself(writer);
        smth.printMyself(writer);
        backDerailleur.printMyself(writer);
        frame.printMyself(writer);
    }


    public OutputWriter getWriter() {
        return writer;
    }

    public void setWriter(OutputWriter writer) {
        this.writer = writer;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Derailleur getSmth() {
        return smth;
    }

    public void setSmth(Derailleur smth) {
        this.smth = smth;
    }

    public Derailleur getBackDerailleur() {
        return backDerailleur;
    }

    public void setBackDerailleur(Derailleur backDerailleur) {
        this.backDerailleur = backDerailleur;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}
