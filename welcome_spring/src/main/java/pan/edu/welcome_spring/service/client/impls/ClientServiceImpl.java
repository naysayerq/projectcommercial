package pan.edu.welcome_spring.service.client.impls;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.repository.ClientRepository;
import pan.edu.welcome_spring.service.client.interfaces.IClientService;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Client create(Client client) {
        client.setCreatedAt(LocalDate.now());
        client.setUpdatedAt(LocalDate.now());
        return clientRepository.save(client);
    }

    @Override
    public Client get(String id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client delete(String id) {
        Client client = this.get(id);
        clientRepository.deleteById(client.getId());
        return client;
    }


    @Override
    public Client update(Client client) {
        client.setUpdatedAt(LocalDate.now());
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public void reloadDataBase()
    {
        dataFake.init();
    }
}