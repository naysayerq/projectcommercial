package pan.edu.welcome_spring.dao.group.interfaces;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import pan.edu.welcome_spring.model.Client;

import java.util.List;

public interface IDaoClient {
    Client create(Client client);
    Client get(String id);
    Client delete(String id);
    Client update(Client client);
    List<Client> getAll();
}
