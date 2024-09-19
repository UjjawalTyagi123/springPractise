package piggy;
import java.util.*;

public class PiggyBank {
	private Map<Integer,Integer>moneyMap=new HashMap<>();
	
	
	public double calculateMoneyAvailable() {
		double total=0;
		for(Map.Entry<Integer,Integer> money:moneyMap.entrySet()) {
			total+=(double) money.getKey()* (double) money.getValue();
		}
		return total;
	}
	
    public List<Integer> retrieveCurrencyDenominations(){
    	Set<Integer> moneyset=moneyMap.keySet();
    	List<Integer>denoList=new ArrayList<>(moneyset);
    	return denoList;
    }
    
    public double calculateMoneyBasedOnDenomination(int denomination) {
    	double total=0;
    	for(Map.Entry<Integer,Integer>money:moneyMap.entrySet()) {
    		if(money.getKey()==denomination) {
    			total+=(double) money.getValue() * (double) money.getKey();
    		}
    	}
    	return total;
    }
    
    
	
	public static void main(String[] args) {
		PiggyBank pg=new PiggyBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of money to add");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			String[] strArr=s.split(":");
			pg.moneyMap.put(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]));
			
		}
		System.out.println("Total money of piggy:"+pg.calculateMoneyAvailable());
		System.out.println("Enter the denomination you want to get the total");
		int deno=sc.nextInt();
		System.out.println("Total money of denomination "+deno+" is  "+pg.calculateMoneyBasedOnDenomination(deno));
		List<Integer>lst;
		lst=pg.retrieveCurrencyDenominations();
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}
}
