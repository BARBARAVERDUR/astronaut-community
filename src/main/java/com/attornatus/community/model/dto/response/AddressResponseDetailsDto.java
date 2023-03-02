
package com.attornatus.community.model.dto.response;


public class AddressResponseDetailsDto{
    
    private Long id; 
    private String street;
    private String CEP;
    private String number;
    private String city;
    private Boolean favorite;

    public AddressResponseDetailsDto() {
    }

    
    public AddressResponseDetailsDto(Long id, String street, String CEP, String number, String city, Boolean favorite) {
        this.id = id;
        this.street = street;
        this.CEP = CEP;
        this.number = number;
        this.city = city;
        this.favorite = favorite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
    
    


}
