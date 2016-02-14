package fr.halfaoui.taxibooking.ws.application.controller;

import org.springframework.context.annotation.Role;
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
    
    public String test() {
        return "Hello World";
    }

}
