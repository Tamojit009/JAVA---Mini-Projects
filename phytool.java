import java.util.*;
class phytool
{
    double ve, s, a; // ve= velocity, s= displacement, ti= time, a= acceleration
    double velocity (double se, double tii)
    {
        ve = (se/tii);
    return (ve);
    }
    double displacement (double u, double t, double ac)
    {
        s = ( (u*t) + (a*(Math.pow(t,2)))/2 ) ;
        return (s);
    }
    double acceleration (double v, double u1, double s2)
    {
        a = ((Math.pow(v,2)) - (Math.pow(u1,2))) / (2*s2);
        return (a);
    }
    public static void main(String args[])
    {
        phytool obj = new phytool ();
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter valid number to which formula you want to access.");
        System.out.println(" 1 for velocity." +"\n"+ "2 for displacement." +"\n"+ "3 for acceleration.");
        int d = sc.nextInt();
        switch (d)
        {
            case 1:
                {
                    System.out.println (" Enter displacement and time. ");
                    double de = sc.nextDouble ();
                    double t2 = sc.nextDouble();
                   double velo = obj.velocity (de,t2);
                    System.out.println("Object's velocity is:" +velo);
                    break;
                }
            case 2:
                {
                    System.out.println(" Enter initial velocity, time and accelration.");
                    double ut =sc.nextDouble();
                    double t4 =sc.nextDouble();
                    double ace =sc.nextDouble();
                   double disp = obj.displacement( ut, t4, ace );
                    System.out.println(" Object's Displacement is:" +disp );
                    break; 
                }
            case 3:
                {
                    System.out.println (" Enetr final velocity, initial velocity and displacement.");
                    double fv = sc.nextDouble();
                    double iu= sc.nextDouble();
                    double d4= sc.nextDouble();
                   double acceler= obj.acceleration ( fv, iu, d4 );
                    System.out.println(" Object's acceleration is:" +acceler);
                    break; 
                }    
        }
    }
}
