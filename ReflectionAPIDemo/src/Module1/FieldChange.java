package Module1;

import java.lang.reflect.Field;

public class FieldChange
{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p1 = new Person("Asia",1000,"Mangesh","Male",22);
        Class cls1 = p1.getClass();
        Field fld = cls1.getDeclaredField("age");

        System.out.println("old age : "+fld.getInt(p1));
        fld.setInt(p1,40);
        System.out.println("new age : "+fld.getInt(p1));

        Field fld_gen = cls1.getDeclaredField("gender");
        fld_gen.setAccessible(true);
        //if you comment above line, it will cause exception, as gen is PRIVATE
        fld_gen.set(p1,"aus");
        System.out.println("new gen : "+fld_gen.get(p1));

    }
}
