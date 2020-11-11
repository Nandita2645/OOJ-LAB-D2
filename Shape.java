import java.util.*;

abstract class Shape {
    int d1,d2;

    Scanner input = new Scanner(System.in);

    abstract void printArea();

}

class Rectangle extends Shape {
    void printArea() {
        System.out.print("Enter length and breadth of rectangle: ");
        d1 = input.nextInt();
        d2 = input.nextInt();
        System.out.println("The area of Rectangle is: " + d1 * d2+"\n");
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.print("Enter Base And Height of triangle: ");
        d1 = input.nextInt();
        d2 = input.nextInt();
        System.out.println("The area of Triangle is: " + (d1*d2) / 2+"\n");
    }
}

class Cricle extends Shape {
    void printArea() {
        System.out.print("Enter Radius: ");
        d1 = input.nextInt();
        System.out.println("The area of Cricle is: " + 3.14f * d1 * d1+"\n");
    }
}

public class shapemain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.printArea();

        Triangle tri = new Triangle();
        tri.printArea();

        Cricle cri = new Cricle();
        cri.printArea();
    }
}