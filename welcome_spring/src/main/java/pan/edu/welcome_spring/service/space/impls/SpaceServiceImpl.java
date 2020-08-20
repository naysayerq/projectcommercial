package pan.edu.welcome_spring.service.space.impls;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.model.Space;
import pan.edu.welcome_spring.repository.SpaceRepository;
import pan.edu.welcome_spring.service.space.interfaces.ISpaceService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SpaceServiceImpl implements ISpaceService {

    @Autowired
    SpaceRepository spaceRepository;

    @Override
    public Space create(Space space) {
        space.setCreatedAt(LocalDateTime.now());
        space.setUpdatedAt(LocalDateTime.now());
        return spaceRepository.save(space);
    }

    @Override
    public Space get(String id) {
        return spaceRepository.findById(id).orElse(null);
    }

    @Override
    public Space delete(String id) {
        Space space = this.get(id);
        spaceRepository.deleteById(space.getId());
        return space;
    }

    @Override
    public Space update(Space space) {
        space.setUpdatedAt(LocalDateTime.now());
        return spaceRepository.save(space);
    }

    @Override
    public List<Space> getAll() {
        return spaceRepository.findAll();
    }
}
