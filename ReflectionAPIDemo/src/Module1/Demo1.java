package Module1;// Retrieving Class Objects

public class Demo1
{
    public static void main(String[] args) throws ClassNotFoundException {
        // Method 1 : Object.getClass()

        Class c1 = "String".getClass();
        Class<? extends String> strClass = "Hello".getClass();
        System.out.println("c1 : "+strClass);

        int[] ints = new int[1024];
        Class c2 = ints.getClass();
        System.out.println("c2 : "+c2);

        java.util.Set<String> set=new java.util.HashSet<>();
        Class c3 = set.getClass();
        System.out.println("c3 : "+c3);

        // Method 2 : Class.forName()

        Class c4 = Class.forName("java.lang.String");
        System.out.println("c4 : "+c4);

        // Method 3 : The .class Syntax
        // If the type is available but there is no instance then it is possible to obtain a Class by
        // appending ".class" to the name of the type.
        boolean b=false;
        Class c5 = boolean.class;
        System.out.println("c5 : "+c5);

        Class c6 = int[][][].class;
        System.out.println("c6 : "+c6);

        // Method 4 : TYPE Field for Primitive Type Wrappers
        Class c7 = Double.TYPE;  // equivalent to  c7=double.class
        System.out.println("c7 : "+c7);

    }
}
