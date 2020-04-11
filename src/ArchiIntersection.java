import java.util.Scanner;

public class ArchiIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inter =0,v=0,h=0,i=0,j=0;
		int[][] ha= new int[100][3];
		int[][] va= new int[100][3];
		
		Scanner scan = new Scanner(System.in);
		v = scan.nextInt();
		h = scan.nextInt();
		scan.nextLine();
		for(i=0;i<v;i++)
		{
			for(j=0;j<3;j++)
			{
				va[i][j]=scan.nextInt();
			}
		}
		scan.nextLine();
		for(i=0;i<h;i++)
		{
			for(j=0;j<3;j++)
			{
				ha[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<h;i++)
		{
			for(j=0;j<v;j++)
			{
				if(ha[i][1]<=va[j][0] && va[j][0]<=ha[i][2] && va[j][1]<=ha[i][0] && ha[i][0]<=va[j][2])
					inter++;
			}
		}
		
		System.out.println(inter);

	}

}
