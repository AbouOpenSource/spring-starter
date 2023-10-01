package github.io.abouopensource.test.controllers;


import github.io.abouopensource.test.models.People;
import github.io.abouopensource.test.service.ServicePeople;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// define method [POST, GET, PUT, DELETE, PATCH]
// Le chemin ou endpoint

@RestController
public class TestController {
    @GetMapping("/people")
    public List<People> index() {
        ServicePeople servicePeople = new ServicePeople();
        return servicePeople.getAlls();
    }

    @PostMapping("/people")
    public void create(@RequestBody People people) {
        System.out.println(people);
        ServicePeople servicePeople = new ServicePeople();
        servicePeople.save(people);
    }

    @PutMapping ("/people")
    public void edit(@RequestBody People people) {
        System.out.println(people);
        ServicePeople servicePeople = new ServicePeople();
        servicePeople.save(people);
    }
}

