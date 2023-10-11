public class App {
    public static void main(String[] args) throws Exception {
        fizzbuzz(100);
    }

    static void fizzbuzz(int max) {
        for (int i = 1; i <= max; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 3?
            {
                System.out.println("fizzbuzz");
            } else if ((i % 5) == 0) // Is it a multiple of 5?
            {
                System.out.println("fizz");
            } else if ((i % 3) == 0) // Is it a multiple of 3?
            {
                System.out.println("buzz");
            } else {
                System.out.println(i); // Not a multiple of 5 or 3
            }
        }
    }
}
