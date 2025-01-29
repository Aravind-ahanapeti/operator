public class Operator {
    public static void main(String[] args) {
        // Arithmetic Operators
        int num1 = 10;
        int num2 = 3;

        System.out.println("Arithmetic Operations:");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        // Relational Operators
        System.out.println("\nRelational Operations:");
        System.out.println("num1 == num2 = " + (num1 == num2));
        System.out.println("num1 != num2 = " + (num1 != num2));
        System.out.println("num1 > num2 = " + (num1 > num2));
        System.out.println("num1 < num2 = " + (num1 < num2));
        System.out.println("num1 >= num2 = " + (num1 >= num2));
        System.out.println("num1 <= num2 = " + (num1 <= num2));

        // Logical Operators
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("\nLogical Operations:");
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));
        System.out.println("bool1 || bool2 = " + (bool1 || bool2));
        System.out.println("!bool1 = " + (!bool1));
    }
}
