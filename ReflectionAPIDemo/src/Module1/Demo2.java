package Module1;// Methods that Return Classes

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Demo2
{
    public static void main(String[] args) throws NoSuchFieldException {
        // Class.getSuperclass() : Returns the super class for the given class.
        Class superClass1 = java.lang.String.class.getSuperclass();
        System.out.println("superClass1 : "+superClass1);

        // Class.getClasses()
        //Returns all the public classes, interfaces, and enums that are members of the class including inherited members.
        Class<?>[] classes1 = Character.class.getClasses();
        System.out.println("classes1 : "+ Arrays.toString(classes1));

        // Class.getDeclaredClasses()
        //Returns all of the classes interfaces, and enums that are explicitly declared in this class.
        Class<?>[] classes2 = Character.class.getDeclaredClasses();
        System.out.println("classes2 : "+ Arrays.toString(classes2));

        // Class.getDeclaringClass()
        //java.lang.reflect.Field.getDeclaringClass()
        //java.lang.reflect.Method.getDeclaringClass()
        //java.lang.reflect.Constructor.getDeclaringClass()
        //Returns the Class in which these members were declared.
        Field f = Thread.State.class.getField("NEW");
        Class c1 = f.getDeclaringClass();
        System.out.println("Declaring classes : "+c1);

        // Class.getEnclosingClass()
        //Returns the immediately enclosing class of the class.
        Class c2 = Thread.State.class.getEnclosingClass();
        System.out.println("Enclosing classes : "+c2);

    }
}


