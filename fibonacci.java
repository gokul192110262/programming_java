import java.util.*;
public class fibonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=-1,next=a+b,n,a1=0,b1=1,next1=a1+b1;
		n=sc.nextInt();
		System.out.print(b1+"  ");
                for(int i=3;i<=n;i++)
		{
			System.out.print(next1+"  ");
			a1=b1;
			b1=next1;
			next1=a1+b1;
			
		}
		System.out.print(a+"  ");
		System.out.print(b+"  ");
		for(int i=3;i<=n;i++)
		{
			System.out.print(next+"  ");
			a=b;
			b=next;
			next=a+b;
		}
	}
}