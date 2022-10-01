import java.util.*;
import java.lang.*;
public class sorting{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
String t="";
Scanner o2=new Scanner(System.in);
String[] s=new String [10];
System.out.print("enter the no of words: ");
int n=obj.nextInt();
for(int i=0;i<n;i++){
System.out.print("enter the string"+(i+1)+": ");
s[i]=o2.nextLine();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(s[i].compareTo(s[j])>0)
{

t=s[i];
s[i]=s[j];
s[j]=t;
}
}
}
System.out.print("1.ascending\n2.descending\nenter your choice:");
int c=obj.nextInt();
if(c==1){
for(int i=0;i<n;i++)
System.out.println(s[i]);
}
else{
for(int i=n-1;i>=0;i--)
System.out.println(s[i]);
}
}
}