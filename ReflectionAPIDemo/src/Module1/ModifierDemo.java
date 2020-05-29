package Module1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifierDemo
{
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class cls = Person.class;

        // For Field "name"
        Field fld = cls.getField("name");
        int modf = fld.getModifiers();
        System.out.println("is name public ? : "+ Modifier.isPublic(modf));
        System.out.println("is name final ? :"+Modifier.isFinal(modf));

        Field fld2 = cls.getField("country");
        int modf2 = fld2.getModifiers();
        System.out.println(" \"country\" is : "+Modifier.toString(modf2));

        // for Mathod "sayHello"
        Method mtd = cls.getMethod("SayHello",null);
        int modf_mth = mtd.getModifiers();
        System.out.println("is sayHello() protected? : "+Modifier.isProtected(modf_mth) );
        System.out.println("is sayHello() final ? : "+Modifier.isStatic(modf_mth) );

        Method mtd2 = cls.getMethod("getName",null);
        int modf_mtd2 = mtd2.getModifiers();
        System.out.println("getName() is : "+Modifier.toString(modf_mtd2));

    }
}
