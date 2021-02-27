package Mix.staticMethodOverriding;

import Mix.Mix;

public class Father {

    public static void sayHello(){
        System.out.println("STATIC : Hello from FATHER");
       }

       public void sayHi() {
           System.out.println("INSTANCE : Hi from Father");
       }
}
