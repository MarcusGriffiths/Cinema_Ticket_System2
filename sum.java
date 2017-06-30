package cinema;

import java.util.*;

public class sum {
	
		static Scanner scan = new Scanner(System.in);
		static int quant = Cinema_menu.QuantityAndTicket;
		int standard, oap, student, child;
		
		
		public void sumMethod(){
			System.out.println("What type of tickets do you require:\nStandard - £8.00\nOPA - £6.00\nStudent - £6.00\nChild - £4.00");
			
			
			int totalprice = 0;
			
			
			Calendar c = Calendar.getInstance();
			int day = c.get(Calendar.DAY_OF_WEEK);
			
			
			if(day == 4)
			{
				standard = 6;
				oap = 4;
				student = 4;
				child = 2;
				
			}else{
				
				standard = 8;
				oap = 6;
				student = 6;
				child = 4;
				
				
			}
			
			
				
			while(quant > 0){
				
				
				
				switch(scan.next())
				{
				case "1":
					
					totalprice = totalprice + standard;
					quant = quant-1;
					System.out.println("You still have " + quant + " tickets to choose!");
					break;
				case "2":
					totalprice = totalprice + oap;
					quant = quant-1;
					System.out.println("You still have " + quant + " tickets to choose!");
					break;
				case "3":
					totalprice = totalprice + student;
					quant = quant-1;
					System.out.println("You still have " + quant + " tickets to choose!");
					break;
				case "4":
					totalprice = totalprice + child;
					quant = quant-1;
					System.out.println("You still have " + quant + " tickets to choose!");
					break;
				
				}
				
				System.out.println("total price is: £" + totalprice);
			}	
		
		
		
		}
		
		
}
