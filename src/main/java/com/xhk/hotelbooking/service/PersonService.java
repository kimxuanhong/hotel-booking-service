package com.xhk.hotelbooking.service;

import com.xhk.hotelbooking.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("personService")
public class PersonService {
    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    public List<Person> getPersons() {
        return persons;
    }
}
