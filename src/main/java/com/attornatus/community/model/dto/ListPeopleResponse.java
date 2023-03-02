
package com.attornatus.community.model.dto;

import java.util.List;

public class ListPeopleResponse {
    
    private List<PersonResponse> people;

    public ListPeopleResponse() {
    }

    public ListPeopleResponse(List<PersonResponse> people) {
        this.people = people;
    }

    public List<PersonResponse> getPeople() {
        return people;
    }

    public void setPeople(List<PersonResponse> people) {
        this.people = people;
    }
    
    
}
