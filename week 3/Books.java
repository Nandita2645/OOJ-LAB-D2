import java.util.*;
class book{
	 String booktitle;
     String author;
     int no_of_pages;
     double price;
    Scanner sc = new Scanner(System.in);
    book()
    {
    	booktitle ="";
    	author = "";
    	no_of_pages= 0;
    	price = 0;
    }
    void getdetails(){
        System.out.print("Enter book title:");
        booktitle = sc.nextLine();
        System.out.print("Enter author name:");
        author = sc.nextLine();
        System.out.print("Enter price:");
        price = sc.nextDouble();
        System.out.print("Enter no of pages:");
        no_of_pages = sc.nextInt();
    }

    public String toString(){
        return("Book name ="+booktitle+"  Author ="+author+  "Price ="+price+" Pages ="+no_of_pages);
    }
}
class Books{
	public static void main(String[] args){
		int n,i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of books ");
        n = in.nextInt();
		book[] b = new book[n];
		for(i = 0;i < n;i++)
		{
			System.out.println("Enter details of Book "+(i+1));
			b[i] = new book();
			b[i].getdetails();
		}
		for(i = 0;i < n;i++)
		{
			System.out.println(b[i]);
		}
	}
}