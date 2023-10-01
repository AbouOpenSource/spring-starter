package github.io.abouopensource.test.service;

import github.io.abouopensource.test.models.People;
import github.io.abouopensource.test.repository.RespositoryPeople;

import java.util.List;

public class ServicePeople {
    RespositoryPeople respositoryPeople ;
            public ServicePeople() {
                respositoryPeople = new RespositoryPeople();
            }

            public List<People> getAlls(){
                return respositoryPeople.getAll();
            }

            public void save(People people){
                respositoryPeople.save(people);
            }
}
