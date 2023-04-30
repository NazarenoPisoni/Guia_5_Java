package models;

public class Album {
    private String year;
    private String title;
    private Artist artist;

    //region Constructores
    public Album(String year, String title, Artist artist) {
        this.year = year;
        this.title = title;
        this.artist = artist;
    }

    public Album() {
    }
    //endregion

    //region Getters y Setters

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    //endregion

    @Override
    public String toString() {
        return "Album{" +
                "year='" + year + '\'' +
                ", title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
