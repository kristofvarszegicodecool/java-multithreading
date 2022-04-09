package cinematicketbooker;

import java.util.UUID;

public class App {

    private static final int BOOKING_COUNT = 1000;

    public static void main(String[] args) {
        System.out.println("Starting Cinema Ticket Booker App...");

        TicketBooker ticketBooker = new TicketBooker();

        // This is just simulating that N booking requests arrive
        for (int i = 0; i < BOOKING_COUNT; i++) {
            UUID bookerId = UUID.randomUUID();
            UUID movieScreeningId = UUID.randomUUID();
            byte seatCount = (byte) (Math.random() * 10);

            BookingRequest cinemaBookingRequest = new BookingRequest(bookerId, movieScreeningId, seatCount);
            ticketBooker.process(cinemaBookingRequest);
        }

        // Wait until all the threads finish, then check what we got in the store
        ticketBooker.waitUntilAllRequestsProcessed();
        ticketBooker.printReservations();
    }
}
