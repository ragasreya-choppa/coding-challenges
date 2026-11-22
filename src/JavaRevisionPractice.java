public class JavaRevisionPractice {
    public static void main(String[] args) {
//
//        // parsing
//        int a = 25;
//        String result = String.valueOf(25);
//
//        String i = "25";
//        int r = Integer.parseInt(i);
//
//        String s = "99.0";
//        double d = Double.parseDouble(s);
//
//
//        // ternary operator
//        // condition ? expressionIfTrue : expressionIfFalse;
//        int age = 20;
//        String b = (age >= 18) ? "Adult" : "Minor";
//
//        // instanceof Operator
//        Object value = "Sreya";
//        System.out.println(value instanceof String);
//        System.out.println(value instanceof Integer);
//
//        //modern switch
//        // automatically prevents fall-through
//
//        int day = 3;
//
//        String dayName = switch (day) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            default -> "Invalid day";
//        };
//
//        System.out.println(dayName);
//
//
//
//        // loops
//
//        for(int l =1;l<=5;l++)
//        {
//            System.out.println(l);
//        }
//
//        // print numbers in reverse
//
//        for(int rev = 5; rev >=1; rev--)
//        {
//            System.out.println(rev);
//        }

        // sum of numbers from 1 to 5
        int sum = 0;
        for(int i =1;i<=5;i++)
        {
            sum = sum+i;
            //System.out.println(sum);
        }
        System.out.println("sum is: "+sum);


        //while-loop
        int j=1;
        while(j<=5){
            System.out.println(j);
            j++;
        }

        // do-while loop
        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while(k<=5);

        // for-each loop practice
        int[] marks={10,20,30,40};
        for(int mark:marks){
            System.out.println(mark);
        }
    }

}
