package Mix.staticMethodOverriding;

public class StaticOverrideTester {

    public static void main(String[] args) {
        Father f=new Son();
        f.sayHi(); //INSTANCE : Hi from SON
        f.sayHello();  // STATIC : Hello from FATHER
    }
}
