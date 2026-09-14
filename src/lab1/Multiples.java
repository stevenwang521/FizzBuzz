package lab1;

public class Multiples {
    public static void main() {
        System.out.println(multiples(16, 5, 3));
    }

    static int multiples(int n, int a, int b) {
        int mults = 0;
        int i = 1;

        while (i < n) {
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                System.out.println(i);
                mults++;
            }

            i++;
        }

        return(mults);
    }
}
