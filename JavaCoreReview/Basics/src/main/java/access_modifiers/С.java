package access_modifiers;

/**
 * Created by Dasha on 9/15/2016.
 */
public class С {
    public void testAccess(){
        A a = new A();
        //field 1 not accessible
        System.out.println(a.field2);
        System.out.println(a.field3);
        System.out.println(a.field4);
    }
}
