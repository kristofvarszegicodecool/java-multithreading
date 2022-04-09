package cinematicketbooker;

import java.util.ArrayList;
import java.util.List;

public class TicketBooker {

    private ReservationStore reservationStore;
    private List<Thread> threads;

    public TicketBooker() {
        reservationStore = new ReservationStore();
        threads = new ArrayList<>();
    }

    public void process(BookingRequest cinemaBookingRequest) {
        Thread thread = new Thread(new BookingRequestProcessorRunnable(cinemaBookingRequest, reservationStore));
        thread.start();
        threads.add(thread);
    }

    public void waitUntilAllRequestsProcessed() {
        for (final Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printReservations() {
        System.out.println("\nReservations:");
        for (int i = 0; i < reservationStore.reservations.size(); i++) {
            System.out.println((i + 1) + " " + reservationStore.reservations.get(i));
        }
        System.out.println("\n" + reservationStore.reservations.size() + " reservations stored");
    }
}
