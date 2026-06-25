import event.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventService {
    private ArrayList<Event> events = new ArrayList<>();
    private IDService idService = new IDService();

    public EventService(IDService idService) {
        this.idService = idService;
    }

    public void addEvent() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scan.nextLine();

        System.out.println("Enter location:");
        String location = scan.nextLine();

        System.out.println("Enter date (year-month-day):");
        String dateString = scan.nextLine();
        LocalDate date;
        date = LocalDate.parse(dateString);

        System.out.println("Enter capacity:");
        int capacity = Integer.parseInt(scan.nextLine());


        long newId = idService.generateNewId(1000000000l);
        Event event = new Event(newId, name, location, date, capacity);

        if (event.getCapacity() < 0) {
            System.out.println("Capacity cannot be negative");
        }
        if (event.getDate().isBefore(LocalDate.now())) {
            System.out.println("Date must be in tne future");
        }

        events.add(event);
        System.out.println("Event successfully added.");
    }

    public Event getEventById() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID of event: ");
        long id = Long.parseLong(scan.nextLine());

        for (Event e : events) {
            if (e.getId() == id) {
                System.out.println(e);
            }

        }
        return null;
    }

    public void updateEvent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID of event to update: ");
        long id = Long.parseLong(scan.nextLine());

        Event eventToUpdate = null;
        for (Event e : events) {
            if (e.getId() == id) {
                eventToUpdate = e;
                break;

            }
        }
        if (eventToUpdate == null) {
            System.out.println("Event with ID " + id + "not found.");
            return;
        }

        System.out.println("Enter new name:");
        String name = scan.nextLine();

        System.out.println("Enter new location:");
        String location = scan.nextLine();

        System.out.println("Enter new date (year mouth day):");
        String dateString = scan.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        System.out.println("Enter new capacity:");
        int capacity = Integer.parseInt(scan.nextLine());

        if (capacity < 0) {
            System.out.println("Capacity cannot be negative");
        }
        if (date.isBefore(LocalDate.now())) {
            System.out.println("Date must be in tne future");
        }

        for (Event e : events) {
            if (e.getId() == id) {
                e.setName(name);
                e.setLocation(location);
                e.setDate(date);
                e.setCapacity(capacity);
                }
            }
        }

    public boolean deleteEvent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID of event to update: ");
        long id = Long.parseLong(scan.nextLine());

        Event toRemove = null;
        for (Event e : events) {
            if (e.getId() == id) {
                toRemove = e;
                break;
            }
        }
        if (toRemove != null) {
            events.remove(toRemove);
            idService.removeID(id);
           System.out.println("Event deleted.");
        } else {
         System.out.println("Event with ID " + id + "not found");
        }
        return false;
    }

    public boolean deleteAllEvents() {
        for (Event e : events) {
            idService.removeID(e.getId());
        }
        events.clear();
        System.out.println("All events deleted.");
        return false;
    }

    public ArrayList<Event> getAllEvents() {
        if (events.isEmpty()) {
            System.out.println("No events found.");

        }
        for (Event e : events) {
            System.out.println(e);
        }

        return null;
    }
}
