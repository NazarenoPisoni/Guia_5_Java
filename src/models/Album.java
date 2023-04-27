package models;

public class Album {
    private String year;
    private String title;
    private Artist artist;

    public Album(String year, String title, Artist artist) {
        this.year = year;
        this.title = title;
        this.artist = artist;
    }
}
