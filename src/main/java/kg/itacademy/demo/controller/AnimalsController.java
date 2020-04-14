package kg.itacademy.demo.controller;

import kg.itacademy.demo.entity.Animals;
import kg.itacademy.demo.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {
    @Autowired
    private AnimalsService animalsService;

    @GetMapping
    public List<Animals> getAll (){
        return animalsService.getAll();
    }

    @GetMapping("/{id}")
    public Animals getById(@PathVariable Long id){  //переменные пути
         return animalsService.getById(id);
    }
    @PostMapping
    public Animals create(@RequestBody Animals animals){
        return animalsService.create(animals);
    }
    @PutMapping
    public Animals update(@RequestBody Animals animals){
        return animalsService.create(animals);
    }
    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){
        animalsService.deleteById(id);
    }


}
