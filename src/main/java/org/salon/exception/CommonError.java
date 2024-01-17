package org.salon.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CommonError {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<InnerCommonError> errors = new ArrayList<>();

    public void addCommonError(InnerCommonError error) {
        errors.add(error);
    }
}