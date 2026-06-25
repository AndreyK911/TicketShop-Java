// Generates prime numbers for ID system

public class PrimeNumberGenerator {

    // check if number is prime
    public boolean isPrime(long num) {
        if (num < 2) return false;

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // returns next prime after lowerLimit
    public long getNextPrime(long lowerLimit) {
        long candidate = lowerLimit + 1;

        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }
}