package models;

public enum Genre {
    ROCK("ROCK"), TRAP("TRAP"), JAZZ("JAZZ"), HIPHOP("HIP HOP"), POP("POP"), METAL("METAL"), CLASICA("CLASICA");
    private String name;
    private Genre(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
