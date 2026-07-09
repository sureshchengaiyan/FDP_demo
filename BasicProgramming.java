public class BasicProgramming {
    public static void main(String[] args) {
        int num = 10;

        // 1. IF-ELSE statement
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // 2. FOR loop
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Operators
        int a = 5, b = 3;
        int sum = a + b;
        int diff = a - b;
        boolean result = (a > b) && (a != 0); // logical AND + relational

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Is a > b and a != 0? " + result);
    }
}
