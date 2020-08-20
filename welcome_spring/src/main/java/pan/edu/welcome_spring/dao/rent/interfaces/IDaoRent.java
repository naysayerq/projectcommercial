package pan.edu.welcome_spring.dao.rent.interfaces;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import pan.edu.welcome_spring.model.Rent;

import java.util.List;

public interface IDaoRent {
    Rent create(Rent rent);
    Rent get(String id);
    Rent delete(String id);
    Rent update(Rent rent);
    List<Rent> getAll();
}
