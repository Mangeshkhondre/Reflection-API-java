package Module1;//               ---  Class Methods for Locating Fields ---
//      Class API	       List of members? 	Inherited members?	  Private members?
//  getField()	            no	                    yes	                 no
//  getDeclaredField()    	no	                    no	                 yes
//  getFields()	            yes	                    yes	                 no
//  getDeclaredFields()	    yes	                    no          	     yes
// Declared provide access to private,protected,public fields
// non-declared provide only public
import java.lang.reflect.Field;
import java.util.Arrays;

public class FieldsDemo
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException
    {
        Class<?> cls1 = Person.class;
        System.out.println("Local class : "+cls1);
        System.out.println("Super Class : "+cls1.getSuperclass());
        System.out.println("----------------------------------");
        System.out.println("getField => only public from Both");
        Field f1 = cls1.getField("name");  // successful as name is public
        System.out.println("f1 ( local field )       : "+f1);
        System.out.println("f1.getName()             : "+f1.getName());
        System.out.println("f1.getDeclaringClass()   : "+f1.getDeclaringClass());
        Field f= cls1.getField("population");
        System.out.println("f ( inherited field)     : "+f);
        // Field f = cls1.getField("gender");  // unsuccessful as gender is private

        System.out.println("----------------------------------");
        System.out.println("getDeclaredField => All types from Local class");
        Field f2 = cls1.getDeclaredField("gender");  // successful as it access all modifier fields , private too.
        System.out.println("f2 ( local field )       : "+f2);
        System.out.println("f2.getName()             : "+f2.getName());

        System.out.println("----------------------------------");
        System.out.println("getFields =>  Only Public from all classes");
        Field[] fs1 = cls1.getFields();
        System.out.println("fs1[]                    :"+ Arrays.toString(fs1));

        System.out.println("----------------------------------");
        System.out.println("getDeclaredFields => All type but from local class");
        Field[] fs2 = cls1.getDeclaredFields();
        System.out.println("fs2[]                    :"+ Arrays.toString(fs2));

    }
}

/*
OUTPUT :-

class Module1.Person
class Module1.Person
----------------------------------
getField =>
f1                       : public java.lang.String Module1.Person.name
f1.getName()             : name
f1.getDeclaringClass()   : class Module1.Person
----------------------------------
getDeclaredField =>
f2                       : private java.lang.String Module1.Person.gender
f2.getName()             : gender
----------------------------------
getFields =>
fs1[]                    :[public java.lang.String Module1.Person.name]
----------------------------------
getDeclaredFields =>
fs2[]                    :[public java.lang.String Module1.Person.name, private java.lang.String Module1.Person.gender, private int Module1.Person.age]

*/
