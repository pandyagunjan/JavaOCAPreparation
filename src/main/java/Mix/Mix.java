package Mix;

import static java.lang.System.out;

public class Mix {


    public static void main(String[] args) {
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


    }


}
