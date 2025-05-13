public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; 

        int first = 0, second = 1, next;

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}

