public class OneExtractionOfDigits {
    public static void main(String[] args) {
        extractDigits(123); // 3 2 1
        // extractDigits(123456789); // 9 8 7 6 5 4 3 2 1
    }
    /**
     * Extracts the digits of a given number and prints them in reverse order.
     * @param startValue The number to extract the digits from.
     */
    public static void extractDigits(final int startValue){
        int remainingValue = startValue;
        while(remainingValue > 0){
            final int digit = remainingValue % 10; // 123 % 10 = 3 ; 12 % 10 = 2 ; 1 % 10 = 1
            System.out.println(digit + " ");
            remainingValue = remainingValue / 10; // 123 / 10 = 12 ; 12 / 10 = 1 ; 1 / 10 = 0
        }
        System.out.println();
    }
}
