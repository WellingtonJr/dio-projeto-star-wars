package com.wellington.starwars.model;

// import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personagem {

    @Id
    private Long id;

    private String name;
    private String height;
    private String mass;
    // private String hairColor;
    // private String skinColor;
    // private String eyeColor;
    // private String birthYear;
    // private String gender;
    // private String homeworld;
    // // private List<String> films = null;
    // // private List<Object> species = null;
    // // private List<String> vehicles = null;
    // // private List<String> starships = null;
    // private String created;
    // private String edited;
    // private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    // public String getHairColor() {
    //     return hairColor;
    // }

    // public void setHairColor(String hairColor) {
    //     this.hairColor = hairColor;
    // }

    // public String getSkinColor() {
    //     return skinColor;
    // }

    // public void setSkinColor(String skinColor) {
    //     this.skinColor = skinColor;
    // }

    // public String getEyeColor() {
    //     return eyeColor;
    // }

    // public void setEyeColor(String eyeColor) {
    //     this.eyeColor = eyeColor;
    // }

    // public String getBirthYear() {
    //     return birthYear;
    // }

    // public void setBirthYear(String birthYear) {
    //     this.birthYear = birthYear;
    // }

    // public String getGender() {
    //     return gender;
    // }

    // public void setGender(String gender) {
    //     this.gender = gender;
    // }

    // public String getHomeworld() {
    //     return homeworld;
    // }

    // public void setHomeworld(String homeworld) {
    //     this.homeworld = homeworld;
    // }

    // public List<String> getFilms() {
    //     return films;
    // }

    // public void setFilms(List<String> films) {
    //     this.films = films;
    // }

    // public List<Object> getSpecies() {
    //     return species;
    // }

    // public void setSpecies(List<Object> species) {
    //     this.species = species;
    // }

    // public List<String> getVehicles() {
    //     return vehicles;
    // }

    // public void setVehicles(List<String> vehicles) {
    //     this.vehicles = vehicles;
    // }

    // public List<String> getStarships() {
    //     return starships;
    // }

    // public void setStarships(List<String> starships) {
    //     this.starships = starships;
    // }

    // public String getCreated() {
    //     return created;
    // }

    // public void setCreated(String created) {
    //     this.created = created;
    // }

    // public String getEdited() {
    //     return edited;
    // }

    // public void setEdited(String edited) {
    //     this.edited = edited;
    // }

    // public String getUrl() {
    //     return url;
    // }

    // public void setUrl(String url) {
    //     this.url = url;
    // }

    // @Override
    // public String toString() {
    //     return "[birthYear=" + birthYear + ", created=" + created + ", edited=" + edited + ", eyeColor="
    //             + eyeColor + ", gender=" + gender + ", hairColor=" + hairColor + ", height=" + height + ", homeworld="
    //             + homeworld + ", id=" + id + ", mass=" + mass + ", name=" + name + ", skinColor=" + skinColor + ", url="
    //             + url + "]";
    // }

  
    

}