import java.util.HashSet;
import java.util.Set;

// Service that guarantees unique IDs
public class IDService {

    private Set<Long> usedIds = new HashSet<>();
    private PrimeNumberGenerator generator = new PrimeNumberGenerator();

    // creates new unique prime ID
    public long generateNewId(long lowerLimit) {

        long id = generator.getNextPrime(lowerLimit);

        // avoid duplicates (rare but still checked)
        while (usedIds.contains(id)) {
            id = generator.getNextPrime(id);
        }

        usedIds.add(id);
        return id;
    }

    // remove ID from registry
    public boolean removeID(long id) {
        return usedIds.remove(id);
    }

    // small debug helper (you used it in practice)
    public void printAllIds() {
        for (Long id : usedIds) {
            System.out.println(id);
        }
    }
}