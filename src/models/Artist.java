package models;

public class Artist {
    private String name;
    private String age;
    private String country;

    public Artist(String name, String age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }
}
