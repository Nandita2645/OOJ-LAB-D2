import java.util.*;
import java.lang.*;
class quad
{
    public static void main(String[]args)
    {
        double a,b,c,r1=0,r2=0;
        System.out.println("enter coefficients a,b and c of quadratic equation");
        Scanner in=new Scanner(System.in);
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        double d=(b*b)-(4*a*c);
        if(d==0)
        {
            System.out.println("two equal and real roots");
            r1=-b/2*a;
            r2=r1;
        }
        else if (d>0)
        {
            System.out.println("two distinct real roots");
            r1=-b+Math.sqrt(d)/2*a;
            r2=-b+Math.sqrt(d)/2*a;
        }
        else
        {
            System.out.println("no real roots");
            System.exit(0);
        }
        System.out.println("the roots of quadratic equation are r1="+r1+" and r2="+r2);
    }
}
