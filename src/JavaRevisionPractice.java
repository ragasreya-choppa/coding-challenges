public class JavaRevisionPractice{
    public static void main(String []args){

        // parsing
        int a = 25;
        String result = String.valueOf(25);

        String i = "25";
        int r = Integer.parseInt(i);

        String s = "99.0";
        double d = Double.parseDouble(s);



        // ternary operator
        // condition ? expressionIfTrue : expressionIfFalse;
        int age = 20;
        String b = (age>=18)? "Adult" : "Minor";

        // instanceof Operator
        Object value = "Sreya";
        System.out.println(value instanceof String);
        System.out.println(value instanceof Integer);
    }
}
