public class SecretAgentEncryption {

    public static void main(String[] args) {
        int number = 321;
        int encrypted = encryptNumber(number);
        System.out.println("Encrypted code: " + encrypted);  // Output: 149
    }

    public static int encryptNumber(int n) {
        int result = 0;
        int multiplier = 1;

        while (n > 0) {
            int digit = n % 10;          // Get last digit
            int square = digit * digit;  // Square of the digit

            // Add square to the result with correct placement
            int temp = square;
            int tempMultiplier = 1;

            // Count how many digits are in square
            while (temp > 0) {
                tempMultiplier *= 10;
                temp /= 10;
            }

            result = result * tempMultiplier + square;

            n /= 10; // Remove last digit
        }

        return result;
    }
}
