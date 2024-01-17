package org.salon.model.booking;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Error implements Serializable {

    @NotEmpty
    @NotBlank
    private String category;

    @NotEmpty
    @NotBlank
    private String code;

    private String detail;

    private String field;

}
