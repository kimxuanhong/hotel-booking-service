package com.xhk.hotelbooking.model;

import java.io.Serializable;

public class SearchCriteria implements Serializable {

    public SearchCriteria() {
        this.personForm = new PersonForm();
    }

    private String searchBy;
    private PersonForm personForm;

    public String getSearchBy() {
        return searchBy;
    }

    public void setSearchBy(String searchBy) {
        this.searchBy = searchBy;
    }

    public PersonForm getPersonForm() {
        return personForm;
    }

    public void setPersonForm(PersonForm personForm) {
        this.personForm = personForm;
    }
}
