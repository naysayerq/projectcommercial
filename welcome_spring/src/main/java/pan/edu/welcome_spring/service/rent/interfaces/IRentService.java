package pan.edu.welcome_spring.service.rent.interfaces;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import pan.edu.welcome_spring.model.Rent;
import pan.edu.welcome_spring.model.Space;

import java.util.List;

public interface IRentService {
    Rent create(Rent rent);
    Rent get(String id);
    Rent delete(String id);
    Rent update(Rent rent);
    List<Rent> getAll();
}
