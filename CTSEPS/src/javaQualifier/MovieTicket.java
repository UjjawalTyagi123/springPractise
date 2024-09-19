package javaQualifier;

public class MovieTicket {
private String movieName;
private String  screenNumber;
private int noOfTicket;
private String mobileNumber;
private String time;
private String modeOfPayment;

public void setMovieName(String movieName) {
	this.movieName=movieName;
}

public String getMovieName() {
	return movieName;
}

public void setscreenNumber(String screenNumber) {
	this.screenNumber=screenNumber;
}

public String getscreenNumber() {
	return screenNumber;
}

public void setnoOfTicket(int noOfTicket) {
	this.noOfTicket=noOfTicket;
}

public int getnoOfTicket() {
	return noOfTicket;
}

public void setmobileNumber(String mobileNumber) {
	this.mobileNumber=mobileNumber;
}

public String getmobileNumber() {
	return mobileNumber;
}

public void settime(String time) {
	this.time=time;
}

public String gettime() {
	return time;
}

public void setmodeOfPayment(String modeOfPayment) {
	this.modeOfPayment=modeOfPayment;
}

public String getmodeOfPayment() {
	return modeOfPayment;
}

public double calculatePrice() {
	if(getscreenNumber().equals("s1") || getscreenNumber().equals("s2") || getscreenNumber().equals("s3") 
			||getscreenNumber().equals("s4") ||getscreenNumber().equals("s5") ) {
		if(getnoOfTicket()>0) {
			double total=0;
			if(getscreenNumber().equals("s1")) {
				total=getnoOfTicket()*280 + 35;
			}
			else if(getscreenNumber().equals("s2")) {
				total=getnoOfTicket()*250 + 35;
			}
			else if(getscreenNumber().equals("s3")) {
				total=getnoOfTicket()*520 + 35;
			}
			else if(getscreenNumber().equals("s4")) {
				total=getnoOfTicket()*400 + 35;
			}
			else if(getscreenNumber().equals("s5")) {
				total=getnoOfTicket()*180;
			}
			return total;
		}
		else {
			return 0;
		}
	}
	else {
		return 0;
	}
}
//frozen:s5:7:12345:2.00pm:paytm
public String generateTicketId() {
	String invalid="invalid movie details";
	 String ticId="";
	
	if(getscreenNumber().equals("s1") || getscreenNumber().equals("s2") || getscreenNumber().equals("s3") 
			||getscreenNumber().equals("s4") ||getscreenNumber().equals("s5") ) {
		if(getnoOfTicket()>0) {
			 
         int i=0,count=0;
         while(true) {
        	
        	 if(getMovieName().charAt(i)=='a' || getMovieName().charAt(i)=='e' || getMovieName().charAt(i)=='i'
        			 || getMovieName().charAt(i)=='o' || getMovieName().charAt(i)=='u') {
        		 int z=0;
        	 }
        	 else {
        		 if(count>1) {
        			 break;
        		 }
        		 else {
        			 ticId+=getMovieName().charAt(i);
        			 count+=1;
        			 
        		 }
        		 
        	 }
        	 i++;
        	 
         }
         
         ticId+=getscreenNumber();
         ticId+='N';
         ticId+=Integer.toString(getnoOfTicket());
         return ticId;
		}
		else {
			return invalid;
		}
	}
	else {
		return invalid;
	}
}

}
