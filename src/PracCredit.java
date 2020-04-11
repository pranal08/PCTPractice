import java.util.Scanner;

public class PracCredit {
	//int totalsum=0, sume=0, sumo=0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		
		
		isValid(number);
		
	}
	

	public static void isValid(long number) {
		String n = number + "";
		int totalsum = sumOdd(n)+ sumEven(n);
		
		if(totalsum%10==0)
		{
			System.out.println("VALID");
		}
		else {	System.out.println("INVALID");}
	}

	private static int sumEven(String n) {
		// TODO Auto-generated method stub
		int sume=0;
		for(int i=n.length()-2;i>=0;i-=2)
		{
			sume+=getDigit(Integer.parseInt(n.charAt(i)+"")*2);
		}

		return sume;
	}

	private static int sumOdd(String n) {
		// TODO Auto-generated method stub
		int sumo=0;
		for(int i= n.length()-1;i>=0;i-=2)
		{
			sumo+=Integer.parseInt(n.charAt(i)+"");
		}
	
		return sumo;
	}
	
	private static int getDigit(int n) {
		int d=0;
		if(n<9) {return n;}
		return n/10 + n%10;
	}

}
