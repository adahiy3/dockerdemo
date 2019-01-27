package com.example.docker.dockerdemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by adahiy3 on 23/01/19.
 */
@RestController
public class DockerdemoController {

    @RequestMapping(value = "/ContractRosterProducer", method = RequestMethod.GET)
    public String gatewayPayload() {
       return "hello docker";
    }


}
