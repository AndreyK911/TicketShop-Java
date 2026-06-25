import java.time.LocalDate;
import java.util.Scanner;



public class Client {
    private Scanner scan = new Scanner(System.in);
    private EventService eventService;

    public Client(EventService eventService) {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add new Event");
            System.out.println("2. Change event by ID");
            System.out.println("3. Display event by ID");
            System.out.println("4. Display all events");
            System.out.println("5.Delete event by ID");
            System.out.println("6. Delete all events");
            System.out.println("0. Exit");
            System.out.println("Selection: ");

            int choise = Integer.parseInt(scan.nextLine());

            switch (choise) {
                case 1: eventService.addEvent(); break;
                case 2: eventService.updateEvent(); break;
                case 3: eventService.getEventById(); break;
                case 4: eventService.getAllEvents(); break;
                case 5: eventService.deleteEvent(); break;
                case 6: eventService.deleteAllEvents(); break;
                case 0: System.out.println("Programm terminated."); break;
                default: System.out.println("Invalid input");
            }
        }
    }


}
