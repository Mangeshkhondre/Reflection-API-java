package Module1;
// //              ---  Class Methods for Locating Methods ---
////      Class API	        List of members?	Inherited members?	    Private members?
////  getMethod()	                no	                yes	                    no
//    getDeclaredMethod()	        no              	no                  	yes
////  getMethods()	                yes	                yes	                    no
////  getDeclaredMethods()	        yes	                no	                    yes


import java.lang.reflect.Method;

public class MethodDemo
{
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> c = Person.class;
        System.out.println("Local class : "+c);
        System.out.println("Super Class : "+c.getSuperclass());

        System.out.println("-----------------------------------------------------------");
        System.out.println("getMethod => only public from Both ");
        Method m1 = c.getMethod("setName",String.class);
        System.out.println(" m1 (local method )       : "+m1);
        Method m2 = c.getMethod("rotate");
        System.out.println(" m2 (superclass method )  : "+m2);

        System.out.println("-----------------------------------------------------------");
        System.out.println("getDeclaredMethod => All types from Local class");
        Method[] declaredMethod = c.getDeclaredMethods();
        System.out.println("declaredMethod[] : ");
        displayArray(declaredMethod);

        System.out.println("----------------------------------------------------------");
        System.out.println("getMethods =>  Only Public from all classes");
        Method[] methods = c.getMethods();
        System.out.println("methods[] : ");
        displayArray(methods);

        System.out.println("----------------------------------------------------------");
        System.out.println("getDeclaredMethods => All type but from local class");
        Method[] declaredMethods = c.getDeclaredMethods();
        System.out.println("declaredMethods[] : ");
        displayArray(declaredMethods);
    }

    static void displayArray(Method[] m)
    {
        for(Method m1 : m)
            System.out.println("\t\t\t\t  "+m1);
    }
}

