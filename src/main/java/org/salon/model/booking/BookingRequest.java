package org.salon.model.booking;

import java.io.Serializable;
import lombok.Data;

@Data
public class BookingRequest implements Serializable {
    public String idempotency_key;
    public Booking booking;
}
