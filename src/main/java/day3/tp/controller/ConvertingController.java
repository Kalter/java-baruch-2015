package day3.tp.controller;

import day3.tp.domain.Guest;
import org.apache.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/convert")
public class ConvertingController {


    @RequestMapping(value = "/guest", method = RequestMethod.POST)
    public RequestEntity<String> createGuest(RequestEntity<Guest> guestRequestEntity) {

        RequestEntity<String> response = new RequestEntity<>("Creation OK", HttpStatus.SC_OK);
        response.getHeaders().add("Location", "/guests");
        return response;
    }
}
