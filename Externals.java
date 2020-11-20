package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends CIE.Student
{
    public Double seem[];
public int i;
    public void read()
    {
        seem=new Double[5];
        Scanner sc=new Scanner(System.in);
        for(  i=0;i<5;i++)
        {
        System.out.println("SEE marks for"+(i+1)+ " subjects: ");
        seem[i]=sc.nextDouble();
        }
    }
}