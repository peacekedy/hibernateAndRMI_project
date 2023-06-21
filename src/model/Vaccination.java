/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author IT MODERN
 */
public class Vaccination {
    private Integer Id;
    private String vaccination_brand;
    private String vaccination_date;
    private String citizen_fk;

    public Vaccination() {
    }

    public Vaccination(Integer Id) {
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Vaccination(Integer Id, String vaccination_brand, String vaccination_date, String citizen_fk) {
        this.Id = Id;
        this.vaccination_brand = vaccination_brand;
        this.vaccination_date = vaccination_date;
        this.citizen_fk = citizen_fk;
    }
    
    

    public String getVaccination_brand() {
        return vaccination_brand;
    }

    public void setVaccination_brand(String vaccination_brand) {
        this.vaccination_brand = vaccination_brand;
    }

    public String getVaccination_date() {
        return vaccination_date;
    }

    public void setVaccination_date(String vaccination_date) {
        this.vaccination_date = vaccination_date;
    }

    public String getCitizen_fk() {
        return citizen_fk;
    }

    public void setCitizen_fk(String citizen_fk) {
        this.citizen_fk = citizen_fk;
    }
    
    
    
}
