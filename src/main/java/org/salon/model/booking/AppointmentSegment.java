package org.salon.model.booking;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class AppointmentSegment implements Serializable {

    @Max(value = 1500)
    private int duration_minutes;

    @Size(max = 36)
    private String service_variation_id;

    @Size(min = 1)
    @Size(max = 32)
    @NotBlank
    @NotEmpty
    private String team_member_id;

    private int service_variation_version;

    private int intermission_minutes;

    private boolean any_team_member;

    private String[] resource_ids;



}
