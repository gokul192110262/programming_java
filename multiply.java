import java.util.*;
public class multiply
{
public static  void main(String[] args)
{
int table,times,i,result;
Scanner sc=new Scanner(System.in);

System.out.println("enter the table:");
table=sc.nextInt();

System.out.println("enter the times:");
times=sc.nextInt();
if(table<=0||times<=0)
{
System.out.println("invalid input");
return;
}


System.out.print("the output is:\n");
for(i=1;i<=times;i++)
{
result=table*i;
System.out.println(table+"*"+i+"="+result);
}
}
} 