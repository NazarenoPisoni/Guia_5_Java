package models;
import lists.List;
import java.util.Scanner;

public class Menu {
    private List myList;

    public Menu(List myList) {
        this.myList = myList;
    }

    public List getMyList() {
        return myList;
    }

    public void runBasicList(){
        Integer i = 0;
        Scanner sc = new Scanner(System.in);
        while (!i.equals(4)) {
            myList.viewList();
            System.out.println("Seleccione Opción: 1) Reproducir - 2) Borrar Canción - 3) Lista de Canciones - 4) Salir.");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    getMyList().play();
                    break;
                case 2:
                    getMyList().deleteSong();
                    break;
                case 3:
                    getMyList().viewList();
                case 4:
                    break;
                default:
                    System.out.println("Opción no Válida!");
                    break;
            }
        }
    }

    public void runPremiumList(){
        Integer i = 0;
        Scanner sc = new Scanner(System.in);
        while (!i.equals(4)) {
            System.out.println("Seleccione Opción: 1) Reproducir - 2) Borrar Canción - 3) Lista de Canciones - 4) Salir.");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    getMyList().play();
                    break;
                case 2:
                    getMyList().deleteSong();
                    break;
                case 3:
                    getMyList().viewList();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no Válida!");
                    break;
            }
        }
    }
}
