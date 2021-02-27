package Mix;

import AcmeOrderSystem.com.acme.utils.MyDate;


public class PassByExperiment {

    public static void main(String[] args) {

        MyDate date = new MyDate(1,20,2008);
        System.out.println("Before passing an object " + date); passObject(date);
        System.out.println("After passing an object " + date);

     //   System.out.println("Before passing a primitive " + date.year); passPrimitive(date.year);
     //   System.out.println("After passing a primitive " + date.year);

        String x = date.toString();
        System.out.println("Before passing a String " + x);
        passString(x);
        System.out.println("After passing a String " + x);

        StringBuilder testSB = new StringBuilder();
        testSB.append(date.toString());
        System.out.println("Before passing a StringBuilder  " + testSB);
        passStringBuilder(testSB);
        System.out.println("After passing a StringBuilder " + testSB);

    }


    public static void passObject(MyDate d){
       // d.year=2009;
    }

    public static void passPrimitive(int i){
        i=2010;
    }

    public static void passString(String s){
        int yearSlash =s.lastIndexOf('/');
        s = s.substring(0, yearSlash+1);
        s += "2012";
        System.out.println("New date string: " + s);
    }

public static void passStringBuilder(StringBuilder sb)
{

    int yearSlash =sb.lastIndexOf("/");
    //sb = sb.substring(0,yearSlash+1) ;
    sb.append(sb.substring(0,yearSlash+1));
    sb.append("2012");
    System.out.println("New date string builder: " + sb.toString());

}

}
