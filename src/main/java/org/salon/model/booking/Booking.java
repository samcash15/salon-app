package org.salon.model.booking;

import java.io.Serializable;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Booking implements Serializable {
    @Size(max = 36)
    private String id;

    private int version;

    private String status;

    private String created_at;

    private String updated_at;

    private String start_at;

    @Size(max = 32)
    private String location_id;

    @Size(max = 192)
    private String customer_id;

    @Size(max = 4096)
    private String customer_note;

    @Size(max = 4096)
    private String seller_note;

    private AppointmentSegment appointment_segments;

    private int transition_time_minutes;

    private boolean all_day;

    private String location_type;

    private BookingCreatorDetails creator_details;

    private String source;
}
