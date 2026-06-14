import java.util.*;
class phytoolt
{
     Scanner sc = new Scanner(System.in);
     void projectilemh ()
    {
        double T, R, V;
        double g= 98/10;
        System.out.println ("Enter the valid number through which you want to access the formula of your choice.");
        System.out.println (" 1 for Time. " +"\n"+ " 2 for Range. " +"\n"+ " 3 for instantenous velocity. ");
        int ob = sc.nextInt();
        switch (ob)
        {
            case 1:
                {
                    System.out.println (" Enter the the height of the object.");
                    double H = sc.nextDouble ();
                      T = Math.sqrt (( 2*H )/g );
                    System.out.println (" The time taken by object:" +T );
                     break;
                }
            case 2:
                {
                    System.out.println (" Enter the height of the object.");
                    double he = sc.nextDouble();
                    System.out.println (" Enter the initital velocity of the object.");
                    double u = sc.nextDouble();
                      R = ( u * (Math.sqrt ( (2*he)/g )));
                    System.out.println (" The range of the motion:" +R);
                    break;
                }
            case 3:
                {
                    System.out.println (" Enter the cordinates of x and y.");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println (" Enter the average velocity.");
                    double v = sc.nextDouble();
                      V = Math.sqrt( (v*x*x) + (v*y*y) ); //For cleaner syntax Math.pow was not used.
                    System.out.println (" The instantenous velocity of the object at x and y:" +V);
                    break;
                }
        }        
    }
     void projectilegd ()
     {
        double Time, Ra, He;
        double g= 98/10;
        System.out.println ("Enter the valid number through which you want to access the formula of your choice.");
        System.out.println (" 1 for Time. " +"\n"+ " 2 for Range. " +"\n"+ " 3 for Height. ");
        int o = sc.nextInt();
        switch(o)
        {
            case 1:
                {
                    System.out.println ("Enter the initial velocity.");
                    double uv = sc.nextDouble();
                    System.out.println ("Enter the angle value in degrees.");
                    double d = sc.nextDouble();
                     double de = Math.toRadians (d);
                        Time = ( ((2*uv)* (Math.sin(de)/g)) );
                     System.out.println (" The time taken by object:" +Time );
                     break;
                }
            case 2:
                {
                    System.out.println(" Enter the intial velocity of the object.");
                    double nu = sc.nextDouble();
                    System.out.println(" Enter the the angle value in degrees. ");
                    double di = sc.nextDouble();
                    double rad = Math.toRadians(di);
                        Ra = (((nu*nu) * ( Math.sin(2*rad)))/g);
                     System.out.println(" The range of the motion:" +Ra);
                     break;
                }
            case 3:
                {
                    System.out.println(" Enter the intial velocity of the object.");
                    double un = sc.nextDouble();
                    System.out.println(" Enter the the angle value in degrees. ");
                    double dg = sc.nextDouble();
                    double ra = Math.toRadians(dg);
                        He = ((( un*un ) * (Math.pow (Math.sin(ra),2)))/(2*g));
                     System.out.println(" The Height of the object at that angle and velocity." +He);
                     break;
                }
        }
     }
    
      public static void main (String[]args)
     {
         Scanner sc = new Scanner(System.in);
        phytoolt obj = new phytoolt ();
        System.out.println (" Choose to access Projectile motion in Horizontal (PRESS 1)" +"\n"+
         "Or Projectile motion with an angle with the ground (PRESS 2)");
         int ob= sc.nextInt();
         switch (ob)
         {
            case 1:
                {
                    obj.projectilemh();
                    break;
                }
            case 2:
                {
                    obj.projectilegd();
                    break;
                }
         }

     }
}