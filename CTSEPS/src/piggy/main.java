package piggy;
import java.util.*;
import java.util.regex.*;

public class main {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	  String input = "zyxzbc!";
	 
	  Boolean flag=input.matches("[a-z]+");
	  if(flag) {
		  System.out.println("yes");
		  String ans="";
		  for(int i=0;i<input.length();i++) {
			  ans+=(char)(97+122-(int)input.charAt(i));  
		  }
		  System.out.println(ans);
	  }
	  else {
		  System.out.println("no");
		  
	  }
	  
//      String regex = "[@#$]"; 
//      
//      Pattern pattern = Pattern.compile(regex);
//      Matcher matcher = pattern.matcher(input);
//      
//      if (matcher.find()) {
//          System.out.println("The string contains a character from the range [a-bA-B].");
//      } else {
//          System.out.println("The string does not contain any character from the range [a-bA-B].");
//      }
  }
}
