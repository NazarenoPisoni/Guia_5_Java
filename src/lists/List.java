package lists;
import interfaces.Play;
import models.Song;
import java.util.Stack;

public abstract class List<Song> {
    private String name;
    private List<Song> myList;


    public List(String name, List<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    public List<Song> getMyList() {
        return myList;
    }
}
