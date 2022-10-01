
import java.util.*;
public class leap{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the day : ");
		int d=obj.nextInt();
		System.out.print("enter the month : ");
		int m=obj.nextInt();
		System.out.print("enter the year : ");
		float y1=obj.nextFloat();
		int y=(int)y1;
		if(d<=0 || d>31 || m<=0 || m>12 || y<=0 || y1!=y)
			System.out.println("invalid..........");
		else{
			if(y%4==0 && y%100!=0 || y%400==0)
				System.out.println("given year is leap year ............");
		}
			
	}
}