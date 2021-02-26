import static java.lang.System.out;

public class MainClass {

    public static void main(String[] args) {
        Car myCar= new Car();
       // myCar.color="white";
        myCar.start();
        myCar.printDescription();

       // System.out.println(myCar.color);
        Car car1,car2,car3;
        car1 = new Car("red" , "Sedan");
        car2 = new Car("blue" , "Station Wagon");
        car3 = new Car("white" , "Coupe");

        car1.printDescription();
        car2.printDescription();
        car3.printDescription();
        Car.resetCounter();
        //car3.printDescription();
        out.println(Car.carCount);

        //Modifies and prints the updated color and type
        car3.customize("YELLOW" , "PILOT");


        //Static members if assigned to null , won't throw nullPointer exception.
        Math m = null;
        double result = m.floor(28.15); // Confusing code, but it works.
        out.println(result);

        //Should be written as
        double result1=Math.floor(28.15);


        byte b = -128;
        out.println(b);





    }

    // The flow to initilize is
    // In - Line
    // Block
    // Constructor




}
