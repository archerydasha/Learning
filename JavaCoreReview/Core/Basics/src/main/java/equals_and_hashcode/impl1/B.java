package equals_and_hashcode.impl1;

import java.util.Objects;

/**
 * Created by Dasha on 9/15/2016.
 */
public class B extends A {
    private Integer field2;

    public B(String field1, Integer field2) {
        super(field1);
        this.field2 = field2;
    }

    public Integer getField2() {
        return field2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof B)){
            if (o.getClass().isAssignableFrom(this.getClass())){
               return o.equals(this);
          }
        }
        return super.equals(o) && Objects.equals(field2, ((B)o).field2);
    }
}
