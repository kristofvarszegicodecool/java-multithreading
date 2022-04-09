package cinematicketbooker;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ReservationStore {
    public List<ReservationData> reservations;
        // This should be private and the store class implement Iterable<T> but let's focus not on the multithreading

    public ReservationStore() {
        reservations = new Vector<>();
    }

    public void add(ReservationData reservationData) {
        reservations.add(reservationData);
    }
}
