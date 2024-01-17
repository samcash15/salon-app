package org.salon.model.booking;

import java.io.Serializable;
import lombok.Data;

@Data
public class BookingResponse implements Serializable {
    private Booking booking;
    private Error[] errors;
}
