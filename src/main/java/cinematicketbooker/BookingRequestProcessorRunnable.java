package cinematicketbooker;

public class BookingRequestProcessorRunnable implements Runnable {
    private final BookingRequest bookingRequest;
    private final ReservationStore reservationStore;

    public void run() {
        processBookingRequest();
    }

    public BookingRequestProcessorRunnable(BookingRequest bookingRequest, ReservationStore reservationStore) {
        this.bookingRequest = bookingRequest;
        this.reservationStore = reservationStore;
    }

    public void processBookingRequest() {
        System.out.println("Processing booking request: " + this.bookingRequest);

        // Reserve the ticket at the given cinema/theatre/etc.
        reserveAtTargetCinema(bookingRequest);

        // Create the reservation data including the printable ticket
        ReservationData reservationData = new ReservationData(bookingRequest);

        // Store the printable ticket in memory just in case (e.g. we need to repeat the email)

        reservationStore.add(reservationData);
        //synchronized (reservationStore) {
        //    reservationStore.add(reservationData);
        //}

        // Send the printable tickets in email to the booker
        sendPrintableTicketInEmail(reservationData);
    }

    private static void reserveAtTargetCinema(BookingRequest bookingRequest) {
        System.out.println("Reserving tickets for " + bookingRequest + "...");
        // No need to implement this, just imagine that this connects to the given cinema's system and makes a reservation there
    }

    private static void sendPrintableTicketInEmail(ReservationData reservationData) {
        System.out.println("Sending printable ticket in email: " + reservationData.printableTicket.content);
        // No need to implement this, just imagine that this sends the printable ticket in email
    }
}
