package cinematicketbooker;

import java.util.UUID;

public class ReservationData {
    private final UUID id;
    private final BookingRequest bookingRequest;
    public final PrintableTicket printableTicket;

    public ReservationData(BookingRequest bookingRequest) {
        this.id = UUID.randomUUID();
        this.bookingRequest = bookingRequest;
        this.printableTicket = new PrintableTicket(bookingRequest);
    }

    @Override
    public String toString() {
        return bookingRequest.toString() + " (" + id + ")";
    }
}
