import event.Event;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        IDService idService = new IDService();
        EventService eventService = new EventService(idService);
        Client client;
        client = new Client(eventService);


//        eventService.addEvent("Metallica", "Berlin", LocalDate.of(2025, 9, 12), 5000);
//        eventService.addEvent("Inception", "Leipzig", LocalDate.of(2025, 8, 5), 150);
//        eventService.addEvent("Gamecom", "Cologne", LocalDate.of(2025, 11, 1), 10000);



//        System.out.println("All events:");
//        for (Event e : eventService.getAllEvents()) {
//            System.out.println(e);
//        }
//
//        long idToFind = eventService.getAllEvents().get(0).getId();s
//
//        Event found = eventService.getEventById(idToFind);
//        System.out.println("Event with ID " + idToFind + ":");
//        System.out.println(found);
//
//        System.out.println("Event update:");
//        eventService.updateEvent(idToFind, "Metallica", "Munich", LocalDate.of(2025, 10, 1), 5000);
//        System.out.println(eventService.getEventById(idToFind));
//
//        System.out.println("Event delete:");
//        System.out.println(eventService.getEventById(idToFind));
//        boolean deleted = eventService.deleteEvent(idToFind);
//        System.out.println("Deleted:" + deleted);
//
//        System.out.println("All events:");
//        for (Event e : eventService.getAllEvents()) {
//            System.out.println(e);
//        }
//
//        idService.printAllIds();

    }
}