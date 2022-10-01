
import java.util.*;
public class square{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the lower range : ");
		int a=obj.nextInt();
		System.out.println("enter the upper range : ");
		int b=obj.nextInt();
		int n=b-a;
		if(n<=0)
			System.out.println("invalid.........");
		else{
		int[][] arr;
		arr=new int[10][10];
		for(int i=0;i<n+1 && a<=b;i++){
			for(int j=0;j<1;j++){
				arr[i][j]=a;
				arr[i][j+1]=a*a;
				a++;
			}
		}
		for(int i=0;i<n+1;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		}		
	}
}