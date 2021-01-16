class Generics<A,B,C>
{
A object1;
B object2;
C object3;

Generics(A ob1,B ob2,C ob3)
{
object1=ob1;
object2=ob2;
object3=ob3;
}
void printname()
{
System.out.println("Type of  object 1 is "+object1.getClass().getName());
System.out.println("Type of  object 2 is "+object2.getClass().getName());
System.out.println("Type of object 3 is " +object3.getClass().getName());

}
A getob1()
{
return object1;
}
B getob2()
{
return object2;
}
C getob3()
{
    return object3;
}
}
public class Genericsm
{
public static void main(String args[])
{
Generics<String,Float,Boolean> G1= new Generics<String,Float,Boolean>("Yash",10f,true);
G1.printname();

String ST=G1.getob1();
System.out.println("The detail given  to object 1 is "+ST);
Float FL=G1.getob2();
System.out.println("The detail given  to object 2 is "+FL);
Boolean BL=G1.getob3();
System.out.println("The detail given  to object 3 is "+BL);

}
}