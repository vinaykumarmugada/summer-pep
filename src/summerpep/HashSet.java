package summerpep;



import java.util.*;
import java.util.Scanner;
public class HashSet {

	public class HashSet {
	    public static void main(String[] args) {
	        HashSet<String> fruits = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a fruit to add: ");
	        String fruit1 = scanner.nextLine();
	        if (fruits.add(fruit1)) {
	            System.out.println(fruit1 + " added successfully.");
	        } else {
	            System.out.println(fruit1 + " is already in the set.");
	        }

	        System.out.print("Enter another fruit to add: ");
	        String fruit2 = scanner.nextLine();
	        if (fruits.add(fruit2)) {
	            System.out.println(fruit2 + " added successfully.");
	        } else {
	            System.out.println(fruit2 + " is already in the set.");
	        }

	       
	        System.out.print("Enter a fruit to check: ");
	        String fruitToCheck = scanner.nextLine();
	        if (fruits.contains(fruitToCheck)) {
	            System.out.println(fruitToCheck + " is present in the set.");
	        } else {
	            System.out.println(fruitToCheck + " is NOT present in the set.");
	        }

	       
	        fruits.clear();
	        System.out.println("All fruits have been cleared.");

	        scanner.close();
	    }
	}

}
