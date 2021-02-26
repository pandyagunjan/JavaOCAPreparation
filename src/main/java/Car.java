/**
 * Creates a car that is able to print out its descriptions
 * @author gunjanpandya
 *
 */

public class Car {
    /**
     * The color of the car
     */

    String color ="Green";
    String type = "In Line Inilitaization";
    int serialNumber;
    static int carCount;
// Regular initialization block
    {
        this.color = "INIT block color";
        this.type = "INIT block Type";
    }
    static{
        carCount = 0;
        resetCounter();
    }

    Car()
    {
//        this.color = "Constructor Color";
//        this.type = "Constructor Type";
        carCount++;
        this.serialNumber=carCount;

    }

    /**
     * This craetes a custom car
     * @param color
     * @param type
     */
    Car(String color,String type)
    {
        //Chaining the constructor
        this();
        this.color = color;
        this.type = type;


    }
    void start()
    {
        System.out.println("Get started");;
    }

    void printDescription()
    {
        System.out.println("This is a " + color + " " + type + " "+ serialNumber);
    }

    /**
     * Create a String that is the description of car
     * @return the generated string.
     */
    String  getDescription()
    {
        String desc= "This is a " + color + " " + type + " "+ serialNumber;
        return desc;
    }


    static void resetCounter()
    {
    carCount=0;
    }

    void customize(String color,String type)
    {
        this.color=color;
        this.type=type+ " " + this.type;
        System.out.println(getDescription());
    }

}
