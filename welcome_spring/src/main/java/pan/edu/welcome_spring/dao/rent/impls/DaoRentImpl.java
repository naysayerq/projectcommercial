package pan.edu.welcome_spring.dao.rent.impls;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.dao.rent.interfaces.IDaoRent;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.model.Rent;

import java.util.List;

@Repository
public class DaoRentImpl implements IDaoRent {

    @Autowired
    DataFake dataFake;

    @Override
    public Rent create(Rent rent) {
        return null;
    }

    @Override
    public Rent get(String id) {
        return null;
    }

    @Override
    public Rent delete(String id) {
        return null;
    }

    @Override
    public Rent update(Rent rent) {
        return null;
    }

    @Override
    public List<Rent> getAll() {
        return null;
    }
}
