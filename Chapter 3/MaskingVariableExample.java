public class MaskingVariableExample {
    
    // Method to demonstrate variable masking
    public static void firstMethod(int aNumber) {
        aNumber = 77;  // This modifies the local copy of aNumber
        System.out.println("In firstMethod(), aNumber is " + aNumber);
    }

    public static void secondMethod(int aNumber) {
        System.out.println("In secondMethod(), at first aNumber is " + aNumber);
        aNumber = 862;  // This modifies the local copy of aNumber
        System.out.println("In secondMethod(), after an assignment aNumber is " + aNumber);
    }

    public static void main(String[] args) {
        int aNumber = 10;  // Original variable
        System.out.println("In main(), aNumber is " + aNumber);
        
        firstMethod(aNumber);  // Call to firstMethod
        System.out.println("Back in main(), aNumber is " + aNumber);
        
        secondMethod(aNumber);  // Call to secondMethod
        System.out.println("Back in main() again, aNumber is " + aNumber);
    }
}