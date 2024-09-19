package javaQualifier;
import java.util.*;

public class DashingDeliveryMain {
	public Map<String,String> mp=new HashMap<>();
	public int countIds(String Deliverytype) {
		int count=0;
		for(String value:mp.values()) {
			if(value.equals(Deliverytype)) {
				count +=1;
			}
		}
		return count;
	}
	
	public List<String> fetchIds(String type){
		List<String> lst=new ArrayList<>();
		for(Map.Entry<String,String> value:mp.entrySet()) {
			if(value.getValue().equalsIgnoreCase(type)) {
				lst.add(value.getKey());
			}
		}
		return lst;
	}
	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 DashingDeliveryMain obj=new DashingDeliveryMain();
		 System.out.println("Enter no of details:");
		 int n=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter details:");
		 
		 for(int i=0;i<n;i++) {
			 String s=sc.nextLine();
			 String[] deliveryArr=s.split(":");
			 if(deliveryArr.length ==2) {
				 obj.mp.put( deliveryArr[0],  deliveryArr[1]);
			 }
			 else {
				 System.out.println("invalid input");
				 System.exit(0);
			 }
			 Arrays.fill(deliveryArr,null);
		 }
		 
		 System.out.println("Enter value you want to search");
		 String type=sc.nextLine();
		 System.out.println(obj.countIds(type));
		 for(String value:obj.fetchIds(type)) {
			 System.out.println(value);
		 }
	}
	
}
