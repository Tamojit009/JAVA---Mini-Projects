import java.util.*;
class Contactbookv1 // This Version-1 of the contact book depends on the order of contacts given by the user.
{
    String name[] = new String [100];  // To take the names and store in a single dimension array.
    long number[] = new long [100];    // To take the numbers from the user and store in a single dimension array.
    String email[] = new String [100]; // To take the email from the user and store in a single dimension array.
    int count = 0; // A counter to take the choice of the user regarding searching of any contacts. 
    int num = 0;   //Takes the number of contacts that the user want to store.
    Scanner sc = new Scanner (System.in);

    void addcontact()
    {
        System.out.println (" Welcome, create your own contact book." +"\n"+ "If 'Yes' the write 'Yes', otherwise 'No'.");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("Yes"))
        {
            System.out.println (" Please enter the number total contacts you want to give. Maximum cpacity is 100");
             num = sc.nextInt();
             sc.nextLine(); // Clears the Enter Key.
            System.out.println (" Write the required information according the given instructions.");
            for (int i=0; i < num; i++)
            {
                System.out.println (" Enter the name of the person.");
                name [i]= sc.nextLine();
                System.out.println (" Enter the phone number of the person.");
                number [i]= sc.nextLong();
                sc.nextLine(); // Clears the enter key from the previous input and prevents the prgrqam from breaking.
                System.out.println (" Enter the email of the person.");
                email [i]= sc.nextLine(); 
            }
        }
        else 
        {
            System.out.println (" Thank you for using our Contact-Book.");
        }
    }
    void searchcontact (int search)
    {
        if (search > 0)
        {
            System.out.println (" Enter the position of the new contact you want to search in the given set of conatct within:" +num);
            int pos = sc.nextInt(); // To take the position of the new contact to be inserted.
            pos--;
            if ( pos >= 0 && pos < num)
            {
                for (int i= 0; i < num; i++)
                {
                    if ( i != pos )
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println (" Here is your contact:");
                        System.out.println ( name[i]);  // Prints the name of the person.
                        System.out.println ( number[i]); // Prints the phone number of the person. 
                        System.out.println ( email[i]); // Prints the eamil-id of the person.
                    }
                }
            }
            else 
            {
                System.out.println (" Invalid user input. ");
            }
        }
        else 
        {
            System.out.println (" Thank you for using our Contact Book.");
        }
    }
    void insertdata (int insert) // To insert a new contact at the end of the existing list.
    {
        if ( insert > 0)
        {
            System.out.println (" Enter how many contacts you want to insert. ");
            int more = sc.nextInt();
            sc.nextLine();
            int limit = num + more;
            for (int i = num; i < limit ; i++)
            {
            System.out.println (" Please enter the contact that you want to insert.");
            System.out.println (" Name:");
            name [i] = sc.nextLine();
            System.out.println (" Phone number:");
            number[i] = sc.nextLong();
            sc.nextLine();
            System.out.println (" Email:");
            email[i] = sc.nextLine();
            num++;
            System.out.println (" The total number of contacts right now." +num);
            }
        }
        else
        {
            System.out.println (" Thank you for using our Contact Book.");
        }
    }
    void deletedata (int delete)
    {
        if ( delete > 0)
        {
            System.out.println (" Please enter the position of the contact that you want to delete.");
            int position = sc.nextInt();
            if ( position >= 1 && position <= num )
            {
                position -= 1; // Becomes the index number of the contact that the user wants to delete.
                int reach = ( num - position - 1 ); // Becomes the number of times the loop needs to be executed. 
                while ( reach > 0)
                {
                    reach --; 
                    name [position] = name [position + 1]; // The name at the given position being overwritten by the next name at the next position.
                    number [position] = number [position + 1]; // The number at the given position is being overwritten by the next position's number.
                    email [position] = email [position + 1]; // The email at the given position is being overwritten by the next position' email.
                    position ++; // Position increases by 1 inorder to shift all the contacts to their new postion.
                }
                    name [num - 1] = null; // The duplicate value present at the end after the shift is also delted. Same for both of the following.
                    number [num - 1] = 0;
                    email [num - 1] = null;
                    num --; // The new value of the total number of contact present is being updated.
                    System.out.println (" The new set of contacts are: ");
            }
            else 
            {
                System.out.println (" Invalid input by user.");
            }
        }
    }
    void display ()
    {
        System.out.println (" Your contacts are:");
        for (int j = 0; j < num; j++)
        {
            System.out.println ( " Contact " +(j + 1));
            System.out.println (name [j]);
            System.out.println (number [j]);
            System.out.println (email [j]);
            System.out.println ("_______________________________");

        }
        System.out.println (" The total number of contacts present are: " +num);

    }
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        Contactbookv1 obj = new Contactbookv1 ();
        obj.addcontact();
        obj.display();
        while (true)
        {
        System.out.println (" Enter your choice according to the following option :");
        System.out.println (" 1 for searching contact. ");
        System.out.println (" 2 for insert contact. ");
        System.out.println (" 3 for delete contact. ");
        System.out.println (" 4 to exit the contactbook. ");
        int option = sc.nextInt ();
            if ( option == 1 )
            {
                obj.searchcontact (option);
            }
            else if ( option == 2)
            {
                obj.insertdata(option);
                obj.display();
            }
            else if ( option == 3)
            {
                obj.deletedata(option);
                obj.display();
            }
            else 
            {
                System.out.println (" Thanks for using our contact book. ");
                break;
            }
        }
    }
}
