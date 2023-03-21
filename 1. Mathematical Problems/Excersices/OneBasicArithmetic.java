public class OneBasicArithmetic {
    public static void main(String[] args) {
        System.out.println(calc(6, 7)); // Return 0
        System.out.println(calc(3, 4)); // Return 6
        System.out.println(calc(5, 5)); // Return 5
    }
    public static int calc(int m, int n) {
        return (((m*n) / 2) % 7); // Same as: ( (n * m / 2) % 7 )
    }
}