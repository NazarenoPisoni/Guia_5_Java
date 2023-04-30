package lists;
import interfaces.Play;
import models.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PremiumList extends List implements Play{

    private String name;
    private LinkedList<Song> myList = new LinkedList<>();

    public PremiumList(String name, LinkedList<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    public PremiumList(String name, ArrayList<Song> listaDeCanciones, String name1, LinkedList<Song> myList) {
        super(name, listaDeCanciones);
        this.name = name1;
        this.myList = myList;
    }

    @Override
    public void play() {
        viewList();
        if(!myList.isEmpty()) {
            System.out.println("Seleccione la canción que desea escuchar: ");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            while (opcion < 0 || opcion > myList.size()) {
                System.out.println("Por favor seleccione una opción válida: ");
                opcion = sc.nextInt();
            }
            Song s = myList.get(opcion);
            System.out.println("Reproduciendo: " + s.getName() + " , " + s.getAlbum().getArtist().getName());
        }
    }

    @Override
    public void addSong(Song s) {
        myList.add(s);
    }

    @Override
    public void deleteSong() {
        viewList();
        if(!myList.isEmpty()){
            System.out.println("Seleccione la canción que desea borrar: ");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            while (opcion < 0 || opcion > myList.size()) {
                System.out.println("Por favor seleccione una opción válida: ");
                opcion = sc.nextInt();
            }
            Song s = myList.remove(opcion);
            System.out.println("Se ha eliminado la siguiente canción de la lista: " + s.getName() + " , " +
                    s.getAlbum().getArtist().getName());
        }
    }

    @Override
    public void viewList() {
        Integer i = myList.size();
        for(int x=0 ; x<i; x++){
            Song s = myList.get(x);
            System.out.println(x + " - " + s.getAlbum().getArtist().getName() + " , " + s.getName());
        }
    }
}
