package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }

        int j = 0;

        while (j <= 100) {
            j = doFizzBuzz(j);
        }

    }

    public static int doFizzBuzz(int j) {
        boolean divisibleBy3 = j % 3 == 0;
        boolean divisibleBy5 = j % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {
            System.out.println("Fizz");

        } else if (divisibleBy5) {
            System.out.println("Buzz");

        } else {
            System.out.println(j);

        }

        j++;
        return j;
    }
}
