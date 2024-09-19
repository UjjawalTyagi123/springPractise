package javaQualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
  
 public static MovieTicket extractInfo(String info){ 
	 String[] infoArr=info.split(":");
	 String movieName=infoArr[0];
	 String screenNumber=infoArr[1];  
	 int noOfTicket=Integer.parseInt(infoArr[2]);   
	 String mobileNumber=infoArr[3];
	 String time=infoArr[4];   
	 String modeOfPayment=infoArr[5];                                            
	 MovieTicket obj=new MovieTicket();   
	 obj.setMovieName(movieName);   
	 obj.setscreenNumber(screenNumber);
	 obj.setnoOfTicket(noOfTicket);
	 obj.setmobileNumber(mobileNumber);
     obj.settime(time);
     obj.setmodeOfPayment(modeOfPayment);
	 return obj;
 }
	
  public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter MovieTicket details");
	 String s=sc.nextLine();
	 MovieTicket obj1=new MovieTicket();
	 UserInterface obj2=new UserInterface();
	 obj1=obj2.extractInfo(s);
	
	 System.out.println("Movie details");
	 System.out.println("Movie name: "+obj1.getMovieName());
	 System.out.println("screen number: "+obj1.getscreenNumber());
	 System.out.println("Number of tickets: "+obj1.getnoOfTicket());
	 System.out.println("show timing: "+obj1.gettime());
	 System.out.println("Ticket cost: "+obj1.calculatePrice());
	 System.out.println("Ticketid: "+obj1.generateTicketId());
  }
}