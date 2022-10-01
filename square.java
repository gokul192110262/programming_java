import java.util.*;

public class square{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a nuumber :");
			float n=lol.nextFloat();
			float sq=n*n;
			float qu=n*n*n;
if(n<=0)
{
System.out.println("invalid input.......");
return;
}
			System.out.println("Square :"+sq);
			System.out.println("Qube :"+qu);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}