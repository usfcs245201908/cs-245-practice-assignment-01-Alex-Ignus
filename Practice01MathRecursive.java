/**
 * Implements recursive methods in order to find n factorial and n fibonacci sequence
 */
public class Practice01MathRecursive implements Practice01Math {
    /**
     * @param n int to find factorial
     * @return n
     * @throws Exception if n is less than 0
     */
    @Override
    public int fact(int n) throws Exception {
       positiveTest(n);
        if(n <=1 ) {
            return n;
        }
        else{
            return n * fact(n-1);
        }
    }

    /**
     * @param n int to find Fibonacci sequence
     * @return n
     * @throws Exception if n is less than 0
     */
    @Override
    public int fib(int n) throws Exception {
        positiveTest(n);
        if(n<=1){
            return n;
        }else{
            return (fib(n-1) + fib(n-2));
        }
    }

    /**
     * @param n int to test if positive
     */
    @Override
    public void positiveTest(int n) {
        if(n < 0) throw new ArithmeticException();
    }
}
