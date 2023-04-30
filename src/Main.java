import lists.BasicList;
import lists.PremiumList;
import models.*;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Led Zeppelin", "70", "England");
        Artist artist2 = new Artist("The Doors", "70", "United States");
        Artist artist3 = new Artist("Pink Floyd", "70", "England");
        Album album1 = new Album("1979", "Led Zeppelin III", artist1);
        Album album2 = new Album("1968", "The Doors", artist2);
        Album album3 = new Album("1969", "Dark Side Of The Moon", artist3);
        Song song1 = new Song("Breathe (In the Air)", 250, Genre.ROCK.getName(), album3, null);
        Song song2 = new Song("Break on Through (To the Other Side)", 226, Genre.ROCK.getName(), album2, null);
        Song song3 = new Song("Immigrant Song", 234, Genre.ROCK.getName(), album1, null);

        Integer i = 0;
        Scanner sc = new Scanner(System.in);
        Menu m;

        while (!i.equals(3)){
            System.out.println("Seleccione su tipo de Cuenta: 1) Básica - 2) Premium - 3) Salir");
            i = sc.nextInt();
            switch (i){
                case 1:
                    m = new Menu(new BasicList("Lista Básica", new Stack<>()));
                    m.getMyList().addSong(song1);
                    m.getMyList().addSong(song2);
                    m.getMyList().addSong(song3);
                    m.runBasicList();
                    break;
                case 2:
                    m = new Menu(new PremiumList("Lista Premium", new LinkedList<>()));
                    m.getMyList().addSong(song1);
                    m.getMyList().addSong(song2);
                    m.getMyList().addSong(song3);
                    m.runPremiumList();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Seleccione una opción válida!");
                    break;
            }
        }
    }
}