public class Eratosthenes {
	private static final int PRIMES_UP_TO = 100;
	private static final int MAGIC_NUMBER = -1; // gerade kein schlauer Name eingefallen.

	public static void main(String[] args) {

		int[] sieve = fillSieve();
		for(int i = 0; i < sieve.length; i++) {
			int primeNumber = sieve[i];
			remove(sieve, primeNumber);
		}
		print(sieve);
	}

	private static boolean isRemoved(int primeNumber) {
		return primeNumber == MAGIC_NUMBER;
	}

	private static void remove(int[] sieve, int primeNumber){
		if(isRemoved(primeNumber)) {
			return;
		}
		int numberToCross = primeNumber * 2;
		while(numberToCross <= PRIMES_UP_TO) {
			// Since the numbers and indices differ
			// by two, we have to calculate the index:
			int indexToCross = numberToCross - 2;
			// An int[] always needs to contain a valid
			// int, we can't really cross an item, but
			// instead set a special value:
			sieve[indexToCross] = MAGIC_NUMBER;
			// And we continue with the next number:
			numberToCross += primeNumber;
		}
	}

	private static void print(int[] sieve){
		for(int i = 0; i < sieve.length; i++) {
			int primeNumber = sieve[i];
			if(isRemoved(primeNumber)) {
				continue;
			}
			if (i == 0){
				System.out.print(primeNumber);
			} else {
				System.out.print(", " + primeNumber);
			}
		}
	}

	private static int[] fillSieve() {
		int[] sieve = new int[PRIMES_UP_TO - 1];
		for(int i = 0; i < sieve.length; i++) {
			sieve[i] = i + 2;
		}
		return sieve;
	}
}
