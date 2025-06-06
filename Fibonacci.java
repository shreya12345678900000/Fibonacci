public class Fibonacci {

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci <number_of_terms>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        generateFibonacci(n);
    }
}
