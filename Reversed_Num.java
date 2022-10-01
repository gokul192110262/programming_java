
import java.util.Scanner;
class Reversed_Num{
public static void main(String args[]){
int num,reversed_Num=0;
Scanner scan=new Scanner(System.in);

System.out.print("Enter the number for find reverse: ");

num=scan.nextInt();
for( ; num!=0;){
reversed_Num=reversed_Num*10;
reversed_Num=reversed_Num+num%10;
num=num/10;
}       ersed_Num);
}
}