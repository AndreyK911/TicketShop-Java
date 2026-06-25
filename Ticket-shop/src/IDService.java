import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IDService {

    Set<Long> ids = new HashSet<>();

    private PrimeNumberGenerator generator = new PrimeNumberGenerator();

    public long generateNewId(long lowerLimit) {
        long newId = generator.getNextPrime(lowerLimit);
            while (ids.contains(newId)) {
                newId  = generator.getNextPrime(newId + 1);
            }
            ids.add(newId);
            return newId;

    }

    public boolean removeID(long id) {
        return ids.remove(id);
    }

    public void printAllIds() {
        for (long newId : ids) {
            System.out.println(newId);
        }
    }
}
