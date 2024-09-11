package asem.e_commerce.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street_name")
    private String street_name;
    @JsonProperty("home_number")
    private int home_number;

    public Address() {
    }

    public Address(int id, String city, String street_name, int home_number) {
        this.id = id;
        this.city = city;
        this.street_name = street_name;
        this.home_number = home_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public int getHome_number() {
        return home_number;
    }

    public void setHome_number(int home_number) {
        this.home_number = home_number;
    }
}
