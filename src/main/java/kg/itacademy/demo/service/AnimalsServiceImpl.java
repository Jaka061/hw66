package kg.itacademy.demo.service;

import kg.itacademy.demo.entity.Animals;
import kg.itacademy.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//бизнес логика
@Service
public class AnimalsServiceImpl implements AnimalsService {
    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public List<Animals> getAll() {
        return animalRepository.findAll();
    }

    @Override
    public Animals getById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    @Override
    public Animals create(Animals animals) {
        return animalRepository.save(animals);
    }

    @Override
    public Animals update(Animals animals) {
        return animalRepository.save(animals);
    }

    @Override
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }
}
