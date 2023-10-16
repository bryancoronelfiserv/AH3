package AH3;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public static void fizzBuzzRecursive(int current, int n) {
        if (current > n) return;

        if (current % 3 == 0 && current % 5 == 0) 
            System.out.println("FizzBuzz");
        else if (current % 3 == 0)
            System.out.println("Fizz");
        else if (current % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(current);

        fizzBuzzRecursive(current + 1, n);
    }

    public static void main(String[] args) {
        int n = 100; // Change
        // fizzBuzz(n);
        fizzBuzzRecursive(1, n);
    }

}