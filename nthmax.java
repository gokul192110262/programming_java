import java.util.*;


public class nthmax{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try
        {
            int o = obj.nextInt();
            if(o>0)
            {
                int[] arr = new int[o];
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Enter the value" + i + ":");
                    arr[i] = obj.nextInt();
                }
                Arrays.sort(arr);
                int m, n;
                System.out.println("Enter the M value :");
                m = obj.nextInt();
                if (m < o && m > 0) {
                    System.out.println(m + "th Max :" + arr[o - m]);
                } else {
                    System.out.println("Invalid Input...");
                }

                obj.close();    
            }
            else
            {
                System.out.println("Invalid Input...");
            }   
        }
        catch(InputMismatchException v)
        {
            System.out.print("Invalid Input!!!");
        }
        
        
    }
}

