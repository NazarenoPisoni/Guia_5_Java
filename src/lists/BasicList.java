package lists;

import interfaces.Play;
import models.Song;
import java.util.Stack;

public class BasicList implements Play {

    private String name;
    private Stack<Song> myList;

    public BasicList(String name, Stack<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    @Override
    public void play(){

    }

    @Override
    public void addSong(Song s){
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void deleteSong(){
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void viewList(){

    }
}
