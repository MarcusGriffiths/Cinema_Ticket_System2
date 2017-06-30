package cinema;

import java.util.Scanner;

public class Cinema_menu {
	
	//Scanner is how the user inputs text onto the screen.
	//object is called scan, what ever gets typed on screen gets stored in variable.
	//what ever gets put in can be accessed by using the scan method.
	static Scanner scan = new Scanner(System.in);
	
	//variables
	static String name;
	static String[] movielist = {"1. Fifty Shades Darker","2. Transformers 5","3. WonderWoman","4. Baywatch","5. The Mummy" };
	static int QuantityAndTicket;
	static int number;
	
	public static void getName()
	{
		System.out.println("Enter First Name");
		name = scan.nextLine();
		System.out.println("Hello " +name+"\nPlease choose your required film");
		getMovie();
		

	}
	
	private static void getMovie() {
		
		for (int i=0;i<movielist.length;i++)
		{
			System.out.println(movielist[i]);
		}
		number = scan.nextInt();
		System.out.println("You have selected "+movielist[number-1].substring(3, movielist[number-1].length()));
		getQuantityAndTicket();
	}
	
	public static void getFilm()
	{
		System.out.println("Select A Film");
		String name = scan.nextLine();
		System.out.println(name);
		

	}
	
	public static void getPrice()
	{
		sum s = new sum(); 
		System.out.println("Select A Film");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println("Total cost = " + s);
	
	}
	
	public static void getQuantityAndTicket()
	{
		
		
		System.out.println("Select how many tickets you require, and choose the type of ticket you wish to purchase");
		QuantityAndTicket = Integer.parseInt(scan.next());
		
		
		System.out.println("ThankYou\nYou have selected " +QuantityAndTicket+ " ticket(s) for "+movielist[number-1].substring(3, movielist[number-1].length()));

		sum sum = new sum();
		sum.sumMethod();
		
	}
	
	
	//Main method - heart of the programme when run system looks for main method.
	public static void main(String [] args){
		getName();
		
		
	}
		// TODO Auto-generated method stub

	}


