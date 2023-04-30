package models;

public class Artist {
    private String name;
    private String age;
    private String nationality;

    //region Constructores
    public Artist(String name, String age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Artist() {
    }
    //endregion

    //region Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
    //endregion

}
