import Player.entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MultimediaElement[] element = new MultimediaElement[5];

        //provo prima con l'inserimento manuale
        element[0] = new Audio("Record1", 4, 3.2);
        element[1] = new Video("Funny dogs", 2, 7, 2.1);
        element[2] = new Image("Sunrise", 5);
        element[3] = new Image("Seaside", 2);
        element[4] = new Video("Surfing parrots", 4, 5, 7.4);

        int elementNumber;

        do {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire il file, 0 per terminare");
            elementNumber = Integer.parseInt(scanner.nextLine());

            switch (elementNumber) {
                case 1, 2, 3, 4, 5 -> {
                    MultimediaElement elements = element[elementNumber - 1];
                    //devo inserire un controllo per capire quale tipo di oggetto è
                    //e usare il metodo giusto per stampare in console
                    //if else annidato???
                    //il metodo show() è solo di Image perchè in Video l'ho costruito dentro play()
                    //per cui basta CanPlay per far fare entrambe le cose a Video e la riproduzione audio a Audio
                    if (elements instanceof CanPlay player) {
                        player.play();
                    }

                    if (elements instanceof Image bright) {
                        bright.show();
                    }
                }
                case 0 -> System.out.println("Programma terminato.");
                default -> System.out.println("Numero non valido.");
            }

        } while (elementNumber != 0);

        scanner.close();
    }

    //dove dovrei usare i getter e i setter per luminosità, volume e durata???
}