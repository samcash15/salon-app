package org.salon.model.booking;

import java.io.Serializable;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class BookingCreatorDetails implements Serializable {
    private String creator_type;

    @Size(max = 32)
    private String team_member_id;

    @Size(max = 192)
    private String customer_id;
}
