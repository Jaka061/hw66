package kg.itacademy.demo.service;

import kg.itacademy.demo.entity.Animals;

import java.util.List;

public interface AnimalsService {
    List<Animals> getAll();
    Animals getById(Long id);
    Animals create(Animals animals);
    Animals update(Animals animals);
    void deleteById(Long id);


}
