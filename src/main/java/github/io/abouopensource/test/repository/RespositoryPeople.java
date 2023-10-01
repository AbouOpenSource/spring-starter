package github.io.abouopensource.test.repository;

import github.io.abouopensource.test.models.People;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class RespositoryPeople {
    List<People> peoples = new ArrayList<>();
    public RespositoryPeople(){
        peoples.add(new People(0,"Abou","SANOU", LocalDate.now()));
        peoples.add(new People(1,"Rihab","Adel", LocalDate.now()));
        peoples.add(new People(2,"Anna","SANOU", LocalDate.now()));
        peoples.add(new People(3,"Alex","SANOU", LocalDate.now()));
        peoples.add(new People(4,"Missa","SANOU", LocalDate.now()));
        peoples.add(new People(5,"Soso","SANOU", LocalDate.now()));

    }
    public People findByID(int id){

        return peoples.get(id);
    }

    public List<People> getAll(){

        return peoples;
    }

    public void save(People people){
        peoples.add(people);

    }
}
