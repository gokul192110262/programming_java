
import java.util.*;
public class upper{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		char s;
		int n,u=0,l=0;
		for(int i=0;;i++){
			System.out.println("enter the character : ");
			s=obj.next().charAt(0);
			n=s;
			if(n>=65 && n<=90)
				u++;
			else if(n>=97 && n<=122)
				l++;
			else if(n>=32 && n<=57 && s!='*'|| n==64 )
				System.out.println("invalid......");
			else
				break;
		}
		System.out.println("no of upper case : "+u);
		System.out.println("no of lower case : "+l);
	}
}