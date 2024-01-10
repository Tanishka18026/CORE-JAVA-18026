class First {
    public static void main(String args[]) {
        // Integer data types
        byte byteVar = 127;          // 8-bit signed integer
        short shortVar = 32767;      // 16-bit signed integer
        int intVar = 2147483647;     // 32-bit signed integer
        long longVar = 9223372036854775807L;  // 64-bit signed integer

        // Floating-point data types
        float floatVar = 123.45f;     // 32-bit floating-point
        double doubleVar = 123.456;   // 64-bit floating-point

        // Character data type
        char charVar = 'A';           // 16-bit Unicode character

        // Boolean data type
        boolean boolVar = true;       // Represents true or false

        // Displaying the values
        System.out.println("Integer data types:");
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);

        System.out.println("\nFloating-point data types:");
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);

        System.out.println("\nCharacter data type:");
        System.out.println("charVar: " + charVar);

        System.out.println("\nBoolean data type:");
        System.out.println("boolVar: " + boolVar);
    }
}
