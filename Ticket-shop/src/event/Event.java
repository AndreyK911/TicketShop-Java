package event;

import java.time.LocalDate;


public class Event {

    private String name;
    private String location;
    private LocalDate date;
    private int capacity;
    private long id;

    public Event (long id, String name, String location, LocalDate date, int capacity)  {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.capacity = capacity;
    }

    public Event(String name, String location, LocalDate date, int capacity) {
    }

    public String toString() {
        return "ID: " + id + " | " + name + " in " + location +  " on " + date + " with " + capacity + " tickets available.";
    }

    //Gets

    public int getCapacity() {
        return capacity;
    }
    public LocalDate getDate() {
        return date;
    }
    public long getId() {
        return id;
    }

    //Sets
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
}
