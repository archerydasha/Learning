package equals_and_hashcode.impl1;

import java.util.Objects;

/**
 * Created by Dasha on 9/15/2016.
 */
public class A {
    private String field1;

    public A(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof A)) return false;
        return Objects.equals(field1, ((A) o).field1);
    }
}
