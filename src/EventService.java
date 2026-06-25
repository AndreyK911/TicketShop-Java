import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

// Core logic of the system 
public class EventService {

    private ArrayList<Event> events = new ArrayList<>();
    private IDService idService;

    // one Scanner is reused
    private Scanner scanner = new Scanner(System.in);

    public EventService(IDService idService) {
        this.idService = idService;
    }

    // create event
    public void addEvent() {

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter location:");
        String location = scanner.nextLine();

        System.out.println("Enter date (YYYY-MM-DD):");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter capacity:");
        int capacity = Integer.parseInt(scanner.nextLine());

        // small validation 
        if (capacity < 0) {
            System.out.println("Capacity invalid");
            return;
        }

        if (date.isBefore(LocalDate.now())) {
            System.out.println("Date is in the past");
            return;
        }

        long id = idService.generateNewId(1000000);

        Event event = new Event(id, name, location, date, capacity);
        events.add(event);

        System.out.println("Event created with ID: " + id);
    }

    // find event
    public void getEventById() {

        System.out.println("Enter ID:");
        long id = Long.parseLong(scanner.nextLine());

        for (Event e : events) {
            if (e.getId() == id) {
                System.out.println(e);
                return;
            }
        }

        System.out.println("Event not found");
    }

    // update event
    public void updateEvent() {

        System.out.println("Enter ID:");
        long id = Long.parseLong(scanner.nextLine());

        for (Event e : events) {
            if (e.getId() == id) {

                System.out.println("New name:");
                e.setName(scanner.nextLine());

                System.out.println("New location:");
                e.setLocation(scanner.nextLine());

                System.out.println("New date:");
                e.setDate(LocalDate.parse(scanner.nextLine()));

                System.out.println("New capacity:");
                e.setCapacity(Integer.parseInt(scanner.nextLine()));

                System.out.println("Updated");
                return;
            }
        }

        System.out.println("Event not found");
    }

    // delete one event
    public void deleteEvent() {

        System.out.println("Enter ID:");
        long id = Long.parseLong(scanner.nextLine());

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
            System.out.println("Deleted");
        } else {
            System.out.println("Not found");
        }
    }

    // delete all
    public void deleteAll() {

        for (Event e : events) {
            idService.removeID(e.getId());
        }

        events.clear();
        System.out.println("All events deleted");
    }

    // print all
    public void getAllEvents() {

        if (events.isEmpty()) {
            System.out.println("No events");
            return;
        }

        for (Event e : events) {
            System.out.println(e);
        }
    }
}