package models;

public class Song {
    private String name;
    private Integer duration;
    private String genre;
    private Album album;
    private Artist guestArtist;

    //region Constructores

    public Song(String name, Integer duration, String genre, Album album, Artist guestArtist) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.guestArtist = guestArtist;
    }

    public Song() {
    }

    //endregion

    //region Getters y Setters


    public String getName() {
        return name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getGuestArtist() {
        return guestArtist;
    }

    public void setGuestArtist(Artist guestArtist) {
        this.guestArtist = guestArtist;
    }

    //endregion

    @Override
    public String toString() {
        return "Song{" +
                "Name='" + name + '\'' +
                ", Duration=" + duration +
                ", Genre='" + genre + '\'' +
                ", Album=" + album +
                ", GuestArtist=" + guestArtist +
                '}';
    }
}
