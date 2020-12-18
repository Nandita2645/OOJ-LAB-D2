package CIE;
import java.util.Scanner;
public class Internals extends Student
{
 pub lic double ciem[];
public int i;
 public void read()
 {
     ciem=new double[5];
     Scanner t=new Scanner(System.in);
     for(i=0;i<5;i++)
{
     System.out.println("CIE marks for"+(i+1)+ "subjects: ");
     ciem[i]=t.nextDouble();
}
 }
}