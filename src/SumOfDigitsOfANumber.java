import java.util.Scanner;

public class SumOfDigitsOfANumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0;

        while(num>0){
            int reminder = num%10;
            sum = sum+reminder;
            num = num/10;
        }

        System.out.println("Sum of Digits of a Number: "+sum);

        sc.close();
    }
}