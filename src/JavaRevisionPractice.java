public class JavaRevisionPractice {
    public static void main(String[] args) {

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
        String b = (age >= 18) ? "Adult" : "Minor";

        // instanceof Operator
        Object value = "Sreya";
        System.out.println(value instanceof String);
        System.out.println(value instanceof Integer);

        //modern switch
        // automatically prevents fall-through

        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default -> "Invalid day";
        };

        System.out.println(dayName);
    }

}
