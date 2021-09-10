package com.xhk.hotelbooking.service;

import com.xhk.hotelbooking.model.Person;
import com.xhk.hotelbooking.model.PersonForm;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("personService")
public class PersonService {
    private static final List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Person> addPerson(PersonForm personForm){
        Person person = new Person();
        BeanUtils.copyProperties(personForm, person);
        persons.add(person);
        return this.getPersons();
    }
}
