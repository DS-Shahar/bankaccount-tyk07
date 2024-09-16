package Snorlax054;
import java.util.*;
public class Main {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		Bank acct1 = new Bank("Lisa", 1000, -1000);
		Bank acct2 = new Bank("Bob", 1000, -1000);
		acct2.transfer(acct1, 500);
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		acct1.transfer(acct2, 1600);
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		acct2.transfer(acct1, 3500);
		
	}

}
