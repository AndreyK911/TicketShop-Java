import java.util.Scanner;

// Console menu (very simple client)
public class Client {

    private EventService service;
    private Scanner scanner = new Scanner(System.in);

    public Client(EventService service) {
        this.service = service;
    }

    public void start() {

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 Add event");
            System.out.println("2 Find event");
            System.out.println("3 Update event");
            System.out.println("4 Show all");
            System.out.println("5 Delete event");
            System.out.println("6 Delete all");
            System.out.println("0 Exit");

            System.out.print("Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> service.addEvent();
                case 2 -> service.getEventById();
                case 3 -> service.updateEvent();
                case 4 -> service.getAllEvents();
                case 5 -> service.deleteEvent();
                case 6 -> service.deleteAll();
                case 0 -> {
                    System.out.println("Bye");
                    return;
                }
                default -> System.out.println("Wrong input");
            }
        }
    }
}