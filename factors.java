import java.util.*;

public class factors{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a number to find the Factors :");
			int n=lol.nextInt(),count=0;
if(n<=0)
{
 System.out.println("invalid input");
return;
}

			for(int i=1;i<=n;i++){
				if(n%i==0){
					
					count++;
				}
			}
			System.out.println("Total number of factors :"+count);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}