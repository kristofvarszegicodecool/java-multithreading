package cinematicketbooker;

import java.util.UUID;

public class BookingRequest {
    private final UUID id;
    private final UUID bookerId;
    private final UUID movieScreeningId;
    private final byte seatCount;

    public BookingRequest(UUID bookerId, UUID movieScreeningId, byte seatCount) {
        id = UUID.randomUUID();
        this.bookerId = bookerId;
        this.movieScreeningId = movieScreeningId;
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return bookerId + " " + movieScreeningId + " " + seatCount;
    }
}
