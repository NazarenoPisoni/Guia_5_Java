package lists;
import models.Song;
import java.util.ArrayList;
import interfaces.Play;

public abstract class List implements Play{
    private String name;
    private ArrayList<Song> myList = new ArrayList<>();

    public List() {
    }

    public List(String name, ArrayList<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    @Override
    public void play() {

    }

    @Override
    public void addSong(Song s) {

    }

    @Override
    public void deleteSong() {

    }

    @Override
    public void viewList() {
        Integer i = myList.size();
        for(int x=0 ; x<i; x++){
            Song s = myList.get(x);
            System.out.println(x + " - " + s.getAlbum().getArtist().getName() + " , " + s.getName());
        }
    }

    public ArrayList<Song> getMyList() {
        return myList;
    }
}
