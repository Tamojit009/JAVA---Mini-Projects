import java.util.*;
class Stringtool
{
    boolean password (String st) //method to check if password strong or not.
    {
        char ch; int c=0; int ca=0; int m=0; int ma=0;
        boolean x= false;
        for (int i=0; i<st.length() ; i++)
        {
            ch = st.charAt(i);
            if (Character.isLowerCase(ch)) //checks if the taken character is in lowercase.
            {
                c++;
            }
            else if (Character.isUpperCase(ch)) //checks if the taken character is in uppercase.
            {
                ca++;
            }
            else if (Character.isDigit(ch)) //checks if the taken character is digit.
            {
                m++;
            }
            else    //checks if the taken character is a special character.
            {
                ma++;
            }
        }
        if (c>0 && ca>0 && m>0 && ma>0)
        {
            x= true;
        }
        return (x);
    }
    boolean Username (String stt) // to validate if a username is correct or not.
    {
        boolean g;
        int l= stt.length();                                   // to take the length of the string.
        if (l>=5 && l<=15                                     // checks all the conditions like the length,
            && Character.isLetter(stt.charAt(0))             // no space should be there,
            && !stt.contains(" ")                          // no string should start and end with underscore. 
            && !stt.startsWith("_") && !stt.endsWith("_"))
            {
                g= true;
            }
        else 
        {
            g= false;
        }
        return (g);
    }
    String palindrome (String s)
    {
        char cha; String gs = "";
        for (int i=0; i< s.length(); i++)
        {
            cha = s.charAt(i);
            cha = Character.toUpperCase(cha);
             gs = cha + gs;
        }
        return (gs);
    }
    int words (String t)
    {
        t = t+" ";
        char kt; int count =0;
        for (int i=0; i< t.length(); i++)
        {
            kt = t.charAt(i);
            if (kt==' ')
                {
                    count ++;
                }
            else 
            {
                continue;
            }
        }
        return (count);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        Stringtool ob = new  Stringtool ();
        System.out.println ("Enter the valid number through which you want to access the function of your choice.");
        System.out.println (" 1 for Password validator. " +"\n"+ " 2 for Username validator. " +"\n"+ " 3 for a word to be in palindrome or not." +"\n"+ 
                               " 4 for counting number of words.");
        int o = sc.nextInt();
        sc.nextLine();
        switch(o)
        {
            case 1:
                {
                    System.out.println (" Enter you password.");
                    String pass = sc.nextLine ();
                    boolean col = ob.password(pass);
                    if (col==true)
                       {
                          System.out.println("Strong");
                        }
                    else 
                       {
                          System.out.println("Not strong");
                        }
                break;
                }
                
            case 2:
                {
                    System.out.println(" Enter your Username. It Shoould be between 5 to 15 characters.");
                    String use = sc.nextLine();
                    boolean usn = ob.Username(use);
                    if (usn == true)
                    {
                        System.out.println(" Valid Username.");
                    }
                    else 
                    {
                        System.out.println(" Invalid Username.");
                    }
                    break;
                }
            case 3:
                {
                    System.out.println(" Enter a word to check if palindrome or not.");
                    String pal = sc.nextLine();
                    String palc = ob.palindrome(pal);
                    if (palc.equalsIgnoreCase(pal))
                    {
                        System.out.println(" It is a palindrome word.");
                    }
                    else
                    {
                        System.out.println(" It is not a palindrome word.");
                    }
                    break;
                }
            case 4:
                {
                    System.out.println(" Enter a sentence to count number of words.");
                    String wor = sc.nextLine();
                    int x = ob.words(wor);
                    System.out.println(" The number of words are:" +x);
                    break;
                }
            default:
                {
                    System.out.println (" Invalid user input. ");
                }
        }
    }
}