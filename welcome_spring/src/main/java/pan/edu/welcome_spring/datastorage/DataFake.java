package pan.edu.welcome_spring.datastorage;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.model.Rent;
import pan.edu.welcome_spring.model.Space;
import pan.edu.welcome_spring.repository.ClientRepository;
import pan.edu.welcome_spring.repository.RentRepository;
import pan.edu.welcome_spring.repository.SpaceRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {
    @Autowired
    SpaceRepository spaceRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    RentRepository rentRepository;


    private List<Space> spaces = new LinkedList<>(Arrays.asList(
            new Space("123", 5, 345, true, 250),
            new Space("234", 7, 288, false, 180),
            new Space("345", 6, 250, true, 200)
    ));

    private List<Client> clients = new LinkedList<>(Arrays.asList(
            new Client("Random", "Rekvizit1","Streett11", 0501432321, "Random"),
            new Client("Random2", "Rekvizit2", "Street345", 120410525, "Random2"),
            new Client("Random3", "Rekvizit3", "Street33", 15159510, "Random33")
    ));

    private List<Rent> rents = new LinkedList<>(Arrays.asList(
            new Rent("345q", spaces.get(0), clients.get(0), LocalDateTime.now(), LocalDateTime.now()),
            new Rent("345q", spaces.get(0), clients.get(0), LocalDateTime.now(), LocalDateTime.now()),
            new Rent("345q", spaces.get(0), clients.get(0), LocalDateTime.now(), LocalDateTime.now())

    ));


    @PostConstruct
    public void init(){
        spaceRepository.deleteAll();
        spaceRepository.saveAll(spaces);
        clientRepository.deleteAll();
        clientRepository.saveAll(clients);
        rentRepository.deleteAll();
        rentRepository.saveAll(rents);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Space> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<Space> spaces) {
        this.spaces = spaces;
    }
}
