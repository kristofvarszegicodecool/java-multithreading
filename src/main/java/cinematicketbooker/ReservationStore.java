package cinematicketbooker;

import java.util.ArrayList;
import java.util.List;

public class ReservationStore {
    public List<ReservationData> reservations;
        // This should be private and the store class implement Iterable<T> but let's focus not on the multithreading

    public ReservationStore() {
        reservations = new ArrayList<>();
    }

    public void add(ReservationData reservationData) {
        // TODO
    }
}
