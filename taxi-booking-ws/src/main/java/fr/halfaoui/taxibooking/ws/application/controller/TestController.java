package fr.halfaoui.taxibooking.ws.application.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amirouche
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = GET)
    @PreAuthorize("#oauth2.clientHasRole('ROLE_TRUSTED_CLIENT') or hasRole('ROLE_USER')")
    public String test() {
        return "Hello World";
    }

}
