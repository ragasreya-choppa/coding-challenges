import java.util.*;
public class LargestNumber{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int largestNumber;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>=b && a>=c)
        {
            largestNumber=a;
        }
        else if(b>=a && b>=c)
        {
            largestNumber=b;
        }
        else{
            largestNumber=c;
        }

        System.out.println("Largest number = "+ largestNumber);

    }
}