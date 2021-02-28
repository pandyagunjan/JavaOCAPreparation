package Mix;

import static java.lang.System.out;

public class Mix {


    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);


        outer_label:
        while(true)
        {
            int z=0;
            while(true)
            {
                if(z>=10)
                {
                    break outer_label;
                }
                else
                    out.println(z++);;
            }
        }

        // Prints the addition of ASCII so 418
        out.println('j'+'a'+'v'+'a');


        // Use constants within switch
        final char A_GRADE = 'A';
        final char B_GRADE = 'B';
        char studentGrade = 'A';
        switch (studentGrade) {
            case A_GRADE:
                System.out.println("Student received an A");
                break;
            case B_GRADE:
                System.out.println("Student received a B");
                break;
            default:
                System.out.println("Student received a C or lower");
        }
    }


}
