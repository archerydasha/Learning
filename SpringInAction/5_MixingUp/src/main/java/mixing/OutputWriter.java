package mixing;

import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * Created by Dasha on 30.03.16.
 */
public class OutputWriter {
    PrintStream out;
    public void print(String value){
        out.println(value);
    }

    public OutputWriter(PrintStream out) {
        this.out = out;
    }
}
