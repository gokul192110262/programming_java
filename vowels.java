import java.util.*;
public class vowels{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int co=0;
		System.out.print("Enter a number : ");
		s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			char c;
			c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				System.out.println("Vowels are "+c);
				co++;
			}
			
		}
		System.out.print("No. of Vowels are "+co);
	}
}