package lab1;

public class Multiples {
    public static void main() {
        System.out.println(multiples(1000, 3, 5));
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

    static int multiples() {
        int mults = 0;
        int i = 1;

        while (i < 1000) {
            boolean divisibleByA = i % 3 == 0;
            boolean divisibleByB = i % 5 == 0;

            if (divisibleByA || divisibleByB) {
                System.out.println(i);
                mults++;
            }

            i++;
        }

        return(mults);
    }
}
