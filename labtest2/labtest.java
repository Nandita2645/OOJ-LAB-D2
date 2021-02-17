import java.util.*;
import java.lang.*;


class labtest{
	public static void main(String[] args) {
		try{
			employee e = new employee();
			
		} catch(notpossible n) {
			System.out.println(n);
		}
	}
}

class notpossible extends Exception {
	
	notpossible(String s, int n) {
		
		System.out.println("invalid age" );
	}

	public String toString() {
		return "notpossible exception.";
	}
}

class company {
	Scanner s = new Scanner(System.in);
	int year;
	company() throws notpossible{
		System.out.println("Enter year of joining: ");
		year = s.nextInt();
		if (year < 2005) {
			throw new notpossible("Year of joining is incorrect ", year);
		}
	}

}
class employee extends company {
	Scanner s = new Scanner(System.in);
	int age;
	public employee() throws notpossible {
		System.out.println("Enter your age: ");
		age = s.nextInt();
		if (age < 18 || age > 60) {
			throw new notpossible("Age cannot be less than 18 or more than 60 ", age);
		}
	}

}

	
