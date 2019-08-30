public interface Practice01Math {
	/**
	 * @param n int to find factorial
	 * @return n
	 * @throws Exception throws exception for invalid value
	 */
	int fact(int n) throws Exception;
	/**
	 * @param n int to find Fibonacci sequence
	 * @return n
	 */
	int fib(int n) throws Exception;

	/**
	 * @param n int to test if positive
	 */
	void positiveTest(int n);
}
