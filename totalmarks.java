import CIE.*;
import SEE.*;
import java.util.Scanner;

class totalmarks
{
    public static void main(String args[])
    {
        int i,j,n;
        Double total[]=new Double[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        CIE.Student s[]=new CIE.Student[n];
        CIE.Internals ci[]= new CIE.Internals[n];
	    SEE.Externals se[]=new SEE.Externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("ENTER STUDENT"+(i+1)+" DETAILS");
            s[i]=new CIE.Student();
            s[i].read();
            ci[i]=new CIE.Internals();
            ci[i].read();
            se[i]=new SEE.Externals();
            se[i].read();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("DETAILS OF STUDENT "+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+(se[i].seem[j]/2);
                System.out.println("Total marks in subject"+(j+1)+" is "+total[j]);
            }
        }
    }
}