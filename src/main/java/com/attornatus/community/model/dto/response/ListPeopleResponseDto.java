
package com.attornatus.community.model.dto.response;

import java.util.List;

public class ListPeopleResponseDto {
    
    private List<PersonResponseHomeDto> listPeople;

    public ListPeopleResponseDto() {
    }

    public ListPeopleResponseDto(List<PersonResponseHomeDto> listPeople) {
        this.listPeople = listPeople;
    }

    public List<PersonResponseHomeDto> getListPeople() {
        return listPeople;
    }

    public void setListPeople(List<PersonResponseHomeDto> listPeople) {
        this.listPeople = listPeople;
    }

    public void setPeople(List<PersonResponseDetailsDto> map) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
