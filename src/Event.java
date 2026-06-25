
import java.time.LocalDate;

// Simple model class for an event
public class Event {

    private long id;
    private String name;
    private String location;
    private LocalDate date;
    private int capacity;

    // full constructor (used when ID already exists)
    public Event(long id, String name, String location, LocalDate date, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.capacity = capacity;
    }

    // getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getCapacity() {
        return capacity;
    }

    // setters (simple, no validation here)
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // debug output
    @Override
    public String toString() {
        return "ID: " + id +
                " | " + name +
                " | " + location +
                " | " + date +
                " | capacity: " + capacity;
    }
}