package Mix.enumsDemo;

public class EnumDemoClass {
    public static void main(String[] args) {
        Days today = Days.FRIDAY;
        String response = "";

        String theDay=Days.FRIDAY.name();
        Days theUsersDay=Days.valueOf("TUESDAY");
        System.out.println(theDay);
        System.out.println(theUsersDay);
        switch(today)
        {
            case MONDAY :
                response= "Get to Work!";
                break;
            case FRIDAY:
                response= "Time to relax!";
                break;
             default :
                response= "Practice Java!";
                break;
        }
        System.out.println(response);


    }


}
