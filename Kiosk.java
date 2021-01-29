import java.util.Scanner;
import java.util.StringTokenizer;

public class Kiosk {

    public void run() {

        //Declare/Initialize variables
        int i = 0;
        int capacity = 10;
        String s = null;

        //Using Scanner for Getting input from user
        Scanner in = new Scanner(System.in);

        //QUESTION: Do I keep scanning until there is a Q command? How do I do this in JAVA?
        while (in.hasNext()) { //CHECK if this is right.
            s = in.nextLine();//nextLine reads the line after you press enter
            //TESTING PURPOSES
            System.out.println("You entered string " + s);

            String[] arrOfStr = s.split(",");
            for (String a: arrOfStr)
                System.out.println(a);

            /*StringTokenizer st = new StringTokenizer(s, ","); //Use StringTokenizer with comma as delimiter
            String[] tokens = new String[capacity]; //Array for storing tokens

            //Place tokens from string into tokens array
            while (st.hasMoreTokens()) {
                int count = st.countTokens();
                tokens[i] = st.nextToken();
                i++;
            }

            /*notes from office hours:
            //store the first line into buffer mechanism
            don't parse command until 2nd line is put into system
            for now assume every line is complete
            if the command line isn't complete -- output "invalid command"
            suggestion: have separate class for testcases and use in main


            //Check if the command(s) are stored. TESTING PURPOSES.
            System.out.print(tokens[0]);
            System.out.print(tokens[1]);
            System.out.print(tokens[2]);
             */

            //Place each command into a case and handle them from there
            i = 0; //do you mean like this?
            switch (arrOfStr[i]) {
                case "A":
                    //TODO insert add(Book book) method
                    System.out.println("added");
                    break;
                case "R":
                    //TODO insert remove(Book book) method
                    break;
                case "O":
                    //TODO insert checkOut(Book book) method
                    break;
                case "I":
                    //TODO insert returns(Book book) method
                    break;
                case "PA":
                    //TODO insert print() method
                    break;
                case "PD":
                    //TODO insert printByDate() method
                    break;
                case "PN":
                    //TODO insert printByNumber() method
                    break;
                case "Q":
                    //TODO fix error for this case. It does not print. NULLPOINTEREXCEPTION.
                    System.out.println("Kiosk session ended"); //QUESTION: can we use system here?
                    //QUESTION: How do we create the outputs without System.out.print()?
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("\n" + arrOfStr[i]); //TESTING
        }

    }
}
