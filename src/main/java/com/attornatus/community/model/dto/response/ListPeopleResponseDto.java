
package com.attornatus.community.model.dto.response;

import java.util.List;

public class ListPeopleResponseDto {
    
    private List<PersonResponseDetailsDto> listPeople;

    public ListPeopleResponseDto() {
    }

    public ListPeopleResponseDto(List<PersonResponseDetailsDto> listPeople) {
        this.listPeople = listPeople;
    }

    public List<PersonResponseDetailsDto> getListPeople() {
        return listPeople;
    }

    public void setListPeople(List<PersonResponseDetailsDto> listPeople) {
        this.listPeople = listPeople;
    }

    
    
    
}
