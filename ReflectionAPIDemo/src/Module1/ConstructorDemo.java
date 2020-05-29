package Module1;//              ---  Class Methods for Locating Constructors ---
//      Class API	       `     List of members?	Inherited members?  	Private members?
//  getConstructor()	            no	                    N/A1	            no
//  getDeclaredConstructor()	    no	                    N/A1	            yes
//  getConstructors()	            yes	                    N/A1	            no
//  getDeclaredConstructors()	    yes	                    N/A1            	yes


import java.lang.reflect.Constructor;

public class ConstructorDemo
{
    public static void main(String[] args) throws NoSuchMethodException
    {
        Class<Person> c=Person.class;
        System.out.println("Local class : "+c);
        System.out.println("Super Class : "+c.getSuperclass());

        System.out.println("-----------------------------------------------------------");
        System.out.println("getConstructor => only public from only Local  ");
        Constructor<Person> con1 = c.getConstructor(String.class,int.class,String.class,String.class,int.class);
        System.out.println("con1  (local class) : "+con1);

        System.out.println("-----------------------------------------------------------");
        System.out.println("getDeclaredConstructor => All types from Local class");
        Constructor<Person> con2 = c.getDeclaredConstructor(String.class,int.class,String.class,int.class);
        System.out.println("con2  (local class) : "+con2);

        System.out.println("-----------------------------------------------------------");
        System.out.println("getConstructors =>  Only Public from local  class");
        Constructor[] cons = c.getConstructors();
        System.out.println("cons : ");
        for(int i=0;i<cons.length;i++)
            System.out.println("\t"+cons[i]);


        System.out.println("-----------------------------------------------------------");
        System.out.println("getDeclaredConstructors => All type but from local class");
        Constructor[] declCons = c.getDeclaredConstructors();
        for(int i=0;i<declCons.length;i++)
            System.out.println("\t"+declCons[i]);
    }
}
