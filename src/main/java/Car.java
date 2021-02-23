public class Car {

    String color ="Green";
    String type = "In Line Inilitaization";
    {
        this.color = "INIT block color";
        this.type = "INIT block Type";
    }

//    Car()
//    {
//        this.color = "Constructor Color";
//        this.type = "Constructor Type";
//
//    }
    void start()
    {
        System.out.println("Get started");;
    }

    void printDescription()
    {
        System.out.println("This is a " + color + " " + type);
    }

}
