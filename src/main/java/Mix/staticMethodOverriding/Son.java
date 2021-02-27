package Mix.staticMethodOverriding;

public class Son extends Father{

    @Override
    public void sayHi() {
        System.out.println("INSTANCE : Hi from SON");
    }

    public static void sayHello()
    {

        System.out.println("STATIC : Hello from SON");
    }

}
