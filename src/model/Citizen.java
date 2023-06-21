
package model;

import java.io.Serializable;


/**
 *
 * @author IT MODERN
 */
public class Citizen implements Serializable{
    
    private String citizen_id;
    private String fullnames;
    private String phone_number;
    private boolean is_vaccinated;

    public Citizen() {
    }

    public Citizen(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public String getCitizen_id() {
        return citizen_id;
    }

    public Citizen(String citizen_id, String fullnames, String phone_number, boolean is_vaccinated) {
        this.citizen_id = citizen_id;
        this.fullnames = fullnames;
        this.phone_number = phone_number;
        this.is_vaccinated = is_vaccinated;
    }

   

    public boolean isIs_vaccinated() {
        return is_vaccinated;
    }

    public void setIs_vaccinated(boolean is_vaccinated) {
        this.is_vaccinated = is_vaccinated;
    }

   
    public void setCitizen_id(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
    
}
