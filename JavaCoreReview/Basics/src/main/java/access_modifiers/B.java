package access_modifiers;

/**
 * Created by Dasha on 9/15/2016.
 */
public class B extends A{
    public void testAccess(){
        //field 1 not accessible
        System.out.println(field2);
        System.out.println(field3);
        System.out.println(field4);
    }
}
