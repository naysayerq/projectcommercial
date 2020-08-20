package pan.edu.welcome_spring.service.space.interfaces;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import pan.edu.welcome_spring.model.Space;

import java.util.List;

public interface ISpaceService {
    Space create(Space space);
    Space get(String id);
    Space delete(String id);
    Space update(Space space);
    List<Space> getAll();
}
