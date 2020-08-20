package pan.edu.welcome_spring.controller.rest;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pan.edu.welcome_spring.model.Rent;
import pan.edu.welcome_spring.service.rent.impls.RentServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/rent")
public class RentRestController {

    @Autowired
    RentServiceImpl rentService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Rent Controller</h1>";
    }

    @RequestMapping(value = "get/list",method = RequestMethod.GET)
    List<Rent> getRentList(){ return rentService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Rent getRent(@PathVariable("id") String id){
        return rentService.get(id);
    }
}
