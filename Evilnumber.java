import java.util.*;
class Evilnumber
{
    String evil = ""; // To store the Binary Sequence of the number given by the user.
    int num;          // To store the number given by the user.
    int count;        // To count the number of 1's present in the Binary Sequence.
    void accept ()
     {
        Scanner sc = new Scanner (System.in);
        System.out.println (" Please, enter a positive whole number.");
        num = sc.nextInt();
     }
    boolean calculate ()
    {
        while ( num > 0 ) // Loop used to find out the remainder and quotient.
        {
            if ( num % 2 == 1) // Checks if the remainder is 1.
            {
                evil = "1" + evil;
                count ++;
            }
            else               // Checks if the remainder is 0.   
            {
                evil = "0" + evil;
            }
            num = num / 2;   // Divides the number for further iterations.
        }
        if ( count % 2 == 0 ) // Checks if the number of 1's present is even.
        {
            return (true);
        }
        else                  // To give result if the number of 1's present is odd.
        {
            return (false);
        }
    }
    void display ()
    {
        if (calculate()) // Checks if the condition for Evil Number satisfies. [condition = number of 1's should be Even in Binary.]
                   // ^- Object calculate() is being called. Therefore no object (calculate ()) is called in void ma.in
        {
            System.out.println (" Since Even number of 1's is present." + "\n" + " It is an Evil Number." );
            System.out.println (" The Binary sequence of the number is: " +evil );
            System.out.println (" The number of 1's is present is: " +count);
        }
        else  // Gives the result of the condition does not satisfy.
        {
            System.out.println (" Since there is an Odd number of 1's present." + "\n" + " It is not an Evil Number." );
            System.out.println (" The Binary sequence of the number is: " +evil );
            System.out.println (" The number of 1's is present is: " +count);
        }
    }
    public static void main (String args [])
    {
        Evilnumber obj = new Evilnumber (); // Creates Objects to call the methods.
        obj.accept();
        obj.display();
    }

}