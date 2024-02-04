/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldCities;

/**
 *
 * @author RamazanFırat
 */
public class City {
    private int id;
    private String name;
    private int countryId;
    private String lastUpdate;

    public City(int id, String name, int countryId, String lastUpdate) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.lastUpdate = lastUpdate;
    }
    
     public City() {
    }

     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
}
