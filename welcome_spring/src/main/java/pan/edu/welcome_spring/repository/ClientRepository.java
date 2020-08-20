package pan.edu.welcome_spring.repository;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {
}
