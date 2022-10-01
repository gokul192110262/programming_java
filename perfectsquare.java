import java.util.*;
import java.lang.*;
public class perfectsquare{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);

System.out.print("enter the start: ");
int a=obj.nextInt();

System.out.print("enter the end: ");
int b=obj.nextInt();

int s;
if(a<0 || b<0 || a>b)
System.out.println("invalid.");
else{
for(int i=a;i<=b;i++){
s=i*i;
s=s;
int rem,sum=0;
while(s!=0){
rem=s%=10;


sum+=rem;
s/=10;
}
if(sum<10 && s<b)
System.out.println(i*i);
}
}
}
}
