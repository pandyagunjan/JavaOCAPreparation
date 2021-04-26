package Mix.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Demo
{
    public static void main(String args[]) throws Exception
    {
        // Creating object whose property is to be checked
        ReflectionDemo obj = new ReflectionDemo();

        // Creating class object from the object using
        // getclass method
        Class cls = obj.getClass();
        System.out.println("The name of class is " +
                cls.getName());

        // The modifier of the class
        int classModifier = cls.getModifiers();
        System.out.println("The modifier of the class is : " + classModifier);
        System.out.println("The modifier is public : " + Modifier.isPublic(classModifier));

        //Interface used by Class
        Class[] interfaces = cls.getInterfaces();
        System.out.println("Interfaces implemented " + interfaces.length);

        for(Class eachItem :interfaces)
        {
            System.out.println("Interfaces implemented :" + eachItem);

        }
        //Super class
        Class classSuper = cls.getSuperclass();
        System.out.println("Super class name is : " + classSuper.getName());

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                constructor.getName());

        System.out.println("The PUBLIC methods of class are : ");

        // Getting methods of the class through the object
        // of the class by using getMethods
        Method[] methods = cls.getMethods();

        // Printing method names
        for (Method method:methods)
            System.out.println(method.getName());

        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
        Method methodcall1 = cls.getDeclaredMethod("method2",
                int.class);

        // invokes the method at runtime
        methodcall1.invoke(obj, 19);

        // creates object of the desired field by providing
        // the name of field as argument to the 
        // getDeclaredField method
        Field field = cls.getDeclaredField("s");

        // allows the object to access the field irrespective
        // of the access specifier used with the field
        field.setAccessible(true);

        // takes object and the new value to be assigned
        // to the field as arguments
        field.set(obj, "JAVA");

        // Creates object of desired method by providing the
        // method name as argument to the getDeclaredMethod
        Method methodcall2 = cls.getDeclaredMethod("method1");

        // invokes the method at runtime
        methodcall2.invoke(obj);

        // Creates object of the desired method by providing
        // the name of method as argument to the 
        // getDeclaredMethod method
        Method methodcall3 = cls.getDeclaredMethod("method3");

        // allows the object to access the method irrespective 
        // of the access specifier used with the method
        methodcall3.setAccessible(true);

        // invokes the method at runtime
        methodcall3.invoke(obj);

        for(int i=0 ; i<10; i++)
        {
            i=i++;
            System.out.println("Hello World!");
        }


        int count =0;
        ROW_LOOP : for(int row=1;row<=3;row++)
        {
            for(int col=1;col<=2;col++)
            {
                if(row*col%2 ==0 ) continue ROW_LOOP;
                count++;

            }


        }

        System.out.println(count);
    }
}