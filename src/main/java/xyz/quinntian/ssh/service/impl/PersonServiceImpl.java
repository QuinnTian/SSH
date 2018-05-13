package xyz.quinntian.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.quinntian.ssh.entity.Person;
import xyz.quinntian.ssh.repository.PersonRepository;
import xyz.quinntian.ssh.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Long savePerson() {
        Person person = new Person();
        person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");
        return personRepository.save(person);
    }

  
}
