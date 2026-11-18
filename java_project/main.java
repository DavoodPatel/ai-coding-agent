// Coding agent ki practice file. Isme bug daalo, phir `uv run main.py` chalao.
// main() har result ke saath expected answer bhi print karta hai,
// taaki output dekh ke turant pata chale kya toota hai.



import java.util.*;

public class main {

    static long sumArray(List<Long> a) {
        // {2, 3, 3} -> 8
        long total = 0;
        for (long num : a) {
            total += num;
        }
        return total;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int findMax(List<Integer> nums) {
        int best = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > best) {
                best = nums.get(i);
            }
        }
        return best;
    }

    static double average(List<Integer> nums) {
        int sum = 0;

        for (int x : nums) {
            sum += x;
        }

        return (double) sum / nums.size();
    }

    static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    static int countVowels(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            c = Character.toLowerCase(c);

            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(72, 95, 60, 88, 45);
        List<Long> a = Arrays.asList(1L, 2L, 3L);

        System.out.println("sumArray result is " + sumArray(a));

        System.out.println("add(2, 3)              = "
                + add(2, 3) + "     (expected 5)");

        System.out.println("factorial(5)           = "
                + factorial(5) + "   (expected 120)");

        System.out.println("isPrime(-7)            = "
                + isPrime(-7) + "     (expected false)");

        System.out.println("isPrime(10)            = "
                + isPrime(10) + "     (expected false)");

        System.out.println("findMax(marks)         = "
                + findMax(marks) + "    (expected 95)");

        System.out.println("average(marks)         = "
                + average(marks) + "    (expected 72.0)");

        System.out.println("reverseString(hello)   = "
                + reverseString("hello") + " (expected olleh)");

        System.out.println("countVowels(Education) = "
                + countVowels("Education") + "     (expected 5)");
    }
}
