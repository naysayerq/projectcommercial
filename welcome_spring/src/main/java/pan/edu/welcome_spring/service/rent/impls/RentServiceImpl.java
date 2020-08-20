package pan.edu.welcome_spring.service.rent.impls;

/*
 * @author Andrii Skryp
 *
 * @date 18.08.2020
 *
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.model.Rent;
import pan.edu.welcome_spring.repository.RentRepository;
import pan.edu.welcome_spring.repository.SpaceRepository;
import pan.edu.welcome_spring.service.rent.interfaces.IRentService;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class RentServiceImpl implements IRentService {

    @Autowired
    RentRepository rentRepository;

    @Override
    public Rent create(Rent rent) {
        rent.setCreatedAt(LocalDateTime.now());
        rent.setUpdatedAt(LocalDateTime.now());
        return rentRepository.save(rent);
    }

    @Override
    public Rent get(String id) {
        return rentRepository.findById(id).orElse(null);
    }

    @Override
    public Rent delete(String id) {
        Rent rent = this.get(id);
        rentRepository.deleteById(rent.getId());
        return rent;
    }


    @Override
    public Rent update(Rent rent) {
        rent.setUpdatedAt(LocalDateTime.now());
        return rentRepository.save(rent);
    }

    @Override
    public List<Rent> getAll() {
        return rentRepository.findAll();
    }
}
