package pan.edu.welcome_spring.dao.group.impls;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.dao.group.interfaces.IDaoClient;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Client;

import java.util.List;

@Repository
public class DaoClientImpl implements IDaoClient {

    @Autowired
    DataFake dataFake;

    @Override
    public Client create(Client client) {
        return null;
    }

    @Override
    public Client get(String id) {
        return null;
    }

    @Override
    public Client delete(String id) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return dataFake.getClients();
    }
}
