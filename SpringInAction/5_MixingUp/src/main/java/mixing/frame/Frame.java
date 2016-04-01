package mixing.frame;

import mixing.OutputWriter;

/**
 * Created by Dasha on 30.03.16.
 */
public abstract class Frame {
    protected int size;
    protected String name;

    protected Frame(int size) {
        this.size = size;
    }

    public void printMyself(OutputWriter writer) {
        writer.print("Frame " + name + ", size " + size + " inches");
    }
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
