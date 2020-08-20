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
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;

import java.util.List;


@RequestMapping("/api/client")
@RestController
public class ClientRestController {

    @Autowired
    ClientServiceImpl clientService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Client Controller</h1>";
    }

    @RequestMapping(value = "get/list",method = RequestMethod.GET)
    List<Client> getClientList(){
        return clientService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Client getClient(@PathVariable("id") String id){
        return clientService.get(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    Client deleteClients(@PathVariable("id") String id){
        return clientService.delete(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Client createClients(@RequestBody Client client){
        return clientService.create(client);
    }

}
