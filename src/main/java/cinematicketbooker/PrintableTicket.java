package cinematicketbooker;

public class PrintableTicket {
    public final String content;    // In real life this could be some kind of nicely formatted PDF

    public PrintableTicket(BookingRequest cinemaBookingRequest) {
        this.content = "Ticket for " + cinemaBookingRequest.toString();
    }
}
