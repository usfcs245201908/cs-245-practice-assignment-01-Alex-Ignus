/**
 * Implements iterative methods in order to find n factorial and n fibonacci sequence
 */
public class Practice01MathIterative implements Practice01Math {
    /**
     * @param n int to find n factorial
     * @return n
     * @throws Exception if n is less than 0
     */
    @Override
    public int fact(int n) throws Exception {
       positiveTest(n);
        if(n<=1){
            return n;
        }else {
            int result = 1;
            for(int i = n; i>0;--i){
                result = i * result;
            }
            return result;
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
        if(n<=1 ){
            return n;
        }else {
            int[] seq = new int[n+1];
            seq[0]=0;
            seq[1]=1;
            for(int i=2; i<n+1; i++){
                seq[i] = seq[i-1] + seq[i-2];
            }
            return seq[n];
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
