import event.Event;


public class PrimeNumberGenerator {

    public static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        }
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= num; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long getNextPrime(long lowerLimit) {

        long nextPrime = lowerLimit + 1;

        while (true) {
            if (isPrime(nextPrime)) {
                return nextPrime;
            }
            nextPrime++;
        }

    }

}
