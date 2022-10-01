import java.util.*;
public class special{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s=obj.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=32 && s.charAt(i)<=47 || s.charAt(i)==64){
			System.out.print(s.charAt(i)+" ");
			c++;
			}
		}
		System.out.println("\nno of special characters : "+c);
	}
}