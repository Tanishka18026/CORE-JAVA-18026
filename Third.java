import java.util.Scanner;
class Third {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input values from the user for byte and short variables
        System.out.print("Enter a value for byteVar: ");
        byte byteVar = scanner.nextByte();

        System.out.print("Enter a value for shortVar: ");
        short shortVar = scanner.nextShort();

        // Arithmetic operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition (+): " + (byteVar + shortVar));
        System.out.println("Subtraction (-): " + (byteVar - shortVar));
        System.out.println("Multiplication (*): " + (byteVar * shortVar));
        System.out.println("Division (/): " + (byteVar / shortVar));
        System.out.println("Modulus (%): " + (byteVar % shortVar));

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("Greater than (>): " + (byteVar > shortVar));
        System.out.println("Greater than or equal to (>=): " + (byteVar >= shortVar));
        System.out.println("Less than (<): " + (byteVar < shortVar));
        System.out.println("Less than or equal to (<=): " + (byteVar <= shortVar));
        System.out.println("Not equal to (<> or !=): " + (byteVar != shortVar));

        // Bitwise operators
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND (&): " + (byteVar & shortVar));
        System.out.println("Bitwise OR (|): " + (byteVar | shortVar));

        // Logical operators
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND (&&): " + (byteVar > 0 && shortVar > 0));
        System.out.println("Logical OR (||): " + (byteVar > 0 || shortVar > 0));

        // Shift operators
        System.out.println("\nShift Operators:");
        System.out.println("Right shift (>>): " + (byteVar >> 1));
        System.out.println("Left shift (<<): " + (shortVar << 1));
        System.out.println("Unsigned right shift (>>>): " + (byteVar >>> 1));

        scanner.close();
    }
}

