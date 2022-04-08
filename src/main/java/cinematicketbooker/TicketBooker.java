package cinematicketbooker;

import java.util.List;

public class TicketBooker {

    private ReservationStore reservationStore;
    private List<Thread> threads;

    public TicketBooker() {
        // TODO
    }

    public void process(BookingRequest cinemaBookingRequest) {
        // TODO, Use the runnable class
    }

    public void waitUntilAllRequestsProcessed() {
        // TODO
    }

    public void printReservations() {
        System.out.println("\nReservations:");
        for (int i = 0; i < reservationStore.reservations.size(); i++) {
            System.out.println((i + 1) + " " + reservationStore.reservations.get(i));
        }
        System.out.println("\n" + reservationStore.reservations.size() + " reservations stored");
    }
}
