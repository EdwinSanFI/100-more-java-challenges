public class TwoDeterminingNumberDigits {
    public static void main(String[] args) {
        System.out.println(determineNumberOfDigits(123)); // 3
        System.out.println(determineNumberOfDigits(123456789)); // 9
    }
    /**
     * Determines the number of digits in a decimanl number (base 10).
     * @param number The number to determine the number of digits for.
     */
    public static int determineNumberOfDigits(int number) {
        int numberOfDigits = 0;
        while(number > 0) {
            number = number / 10; // 123 / 10 = 12 ; 12 / 10 = 1  ;  1 / 10 = 0
            numberOfDigits++;    //   0 + 1 = 1   ;   1 + 1 = 2   ;  2 + 1 = 3
        }
        return numberOfDigits;
    }
}
