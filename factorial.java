
import java.util.*;
public class factorial{
	public static void main(String args[]){
		try{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=obj.nextInt();
		if(n<0)
			System.out.println("invalid .............");
		else{
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		System.out.println("factorial of number : "+f);
		}
		}
		catch(Exception s){
			System.out.println("invalid..........");
		}
	}
}