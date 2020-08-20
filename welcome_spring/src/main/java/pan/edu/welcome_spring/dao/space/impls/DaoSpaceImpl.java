package pan.edu.welcome_spring.dao.space.impls;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.dao.space.interfaces.IDaoSpace;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Space;

import java.util.List;

@Repository
public class DaoSpaceImpl implements IDaoSpace {

    @Autowired
    DataFake dataFake;

    @Override
    public Space create(Space cafedra) {
        return null;
    }

    @Override
    public Space get(String id) {
        return null;
    }

    @Override
    public Space delete(String id) {
        return null;
    }

    @Override
    public Space update(Space cafedra) {
        return null;
    }

    @Override
    public List<Space> getAll() {
        return dataFake.getSpaces();
    }
}
