package stdlib;

/*
 Calculate fatoriel from a number with recursion.
 How would that work ?
 */
import java.util.Stack;

public class Facts {

    private static final int N = 6;


    public static void main(String[] args) {
        func(1, 1);
    }

    /**
     * This one is 0(n) time complexity but O(n) space complexity
     * @param n
     */
    public static void fact(int n) {

        if (n==0) {
            System.out.print("Res: 1");
        }
        double prod = 1;
        Stack<Double> results = new Stack<>();
        for (int i=1; i <= n; i++) {
            prod = prod * i;
            results.push(prod);
        }

        while (!results.empty()) {
            System.out.print(results.pop() + " ");
        }
    }

    public static void func(int n, double prod) {
        prod = n * prod;
        System.out.print(prod + " ");
        if (n < N) {
            n++;
            func(n, prod);
        }
    }

}
