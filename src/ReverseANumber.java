import java.util.Scanner;

public class ReverseANumber
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rem;

        while(num>0){
            rem = num%10;
            System.out.print(rem);
            num=num/10;
        }

        sc.close();

    }
}
