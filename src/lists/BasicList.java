package lists;

import interfaces.Play;
import models.Song;
import java.util.Stack;

public class BasicList extends List implements Play{

    private String name;
    private Stack<Song> myList;

    public BasicList(String name, Stack<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    public BasicList() {
    }

    @Override
    public void play(){
        Song primerCancion = myList.pop();
        Stack<Song> aux = new Stack<>();
        while (!myList.isEmpty()){
            aux.add(myList.pop());
        }
        myList.add(primerCancion);
        while(!aux.isEmpty()){
            myList.add(aux.pop());
        }
        System.out.println("Reproduciendo: " + primerCancion.getName());
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
        for(Song s : myList){
            System.out.println(s.toString());
        }
    }
}
