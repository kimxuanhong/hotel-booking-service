package com.xhk.hotelbooking.service;

import com.xhk.hotelbooking.model.Person;
import com.xhk.hotelbooking.model.PersonForm;
import com.xhk.hotelbooking.model.SearchCriteria;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Person> addPerson(PersonForm personForm) {
        Person person = new Person();
        BeanUtils.copyProperties(personForm, person);
        persons.add(person);
        return this.getPersons();
    }

    public List<Person> searchByFirstName(PersonForm personForm) {

        return persons.stream().filter(
                x -> x.getFirstName().contains(personForm.getFirstName())
        ).collect(Collectors.toList());
    }

    public List<Person> searchByLastName(PersonForm personForm) {

        return persons.stream().filter(
                x -> x.getLastName().contains(personForm.getLastName())
        ).collect(Collectors.toList());
    }

    public boolean decisionFlow(SearchCriteria criteria) {
        return "firstName".equalsIgnoreCase(criteria.getSearchBy());
    }
}
