class Second {
        public static void main(String args[]) {
            // Assigning a byte value to short and int variables
            byte byteValue = 120;
            short shortVar = byteValue; // Implicit casting from byte to short
            int intVar = byteValue;     // Implicit casting from byte to int
    
            System.out.println("Assigning byte value to short and int:");
            System.out.println("byteValue: " + byteValue);
            System.out.println("shortVar: " + shortVar);
            System.out.println("intVar: " + intVar);
    
            // Assigning an int value to short and byte variables
            int intValue = 300;
            short shortVar2 = (short) intValue; // Explicit casting from int to short
            byte byteVar = (byte) intValue;     // Explicit casting from int to byte
    
            System.out.println("\nAssigning int value to short and byte:");
            System.out.println("intValue: " + intValue);
            System.out.println("shortVar2: " + shortVar2);
            System.out.println("byteVar: " + byteVar);
        }
    }
    
