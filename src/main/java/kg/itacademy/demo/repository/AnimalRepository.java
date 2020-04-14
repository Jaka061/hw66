package kg.itacademy.demo.repository;


import kg.itacademy.demo.entity.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Long >{
// отвечает за хранение и полученияФтшьфдыСщт
}


