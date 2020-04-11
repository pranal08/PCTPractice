import java.util.Scanner;

public class FamilyTree {

	public class Node{
		String name;
		Node left,right;
		
		public void Node(String name)
		{
			this.name=name;
			left=right=null;
		}
		
		Node root;
		public void FamilyTree() {
			root = null;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int n =Integer.parseInt(input);
		
		for(int i=0;i<n;i++)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		{
			
			String name = scan.nextLine();
			String[] temp = name.split(" ");
			
			//System.out.println(temp[0]);
			//search
			//insert
		}
		
		}
}
