package org.salon.controller;


import java.util.logging.Logger;
import javax.validation.Valid;
import org.salon.model.booking.BookingRequest;
import org.salon.model.booking.BookingResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    private static final Logger LOGGER = Logger.getLogger(BookingController.class.getName());

    @PostMapping(path = "/v2/bookings", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BookingResponse> createBooking(@Valid @RequestBody BookingRequest request, BindingResult bindingResult) {
        // TODO: implement service logic to call Square API Bookings. We will need the account information of the seller.
        BookingResponse response = new BookingResponse();

        if (bindingResult.hasErrors()) {
            LOGGER.warning("Binding errors occurred: " + bindingResult.getAllErrors());
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(response);
    }

}
