import Player.entities.*;
import Player.entities.enums.MultimediaType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MultimediaElement[] element = new MultimediaElement[5];

        //provo prima con l'inserimento manuale
//        element[0] = new Audio("Record1", 4, 3.2);
//        element[1] = new Video("Funny dogs", 2, 7, 2.1);
//        element[2] = new Image("Sunrise", 5);
//        element[3] = new Image("Seaside", 2);
//        element[4] = new Video("Surfing parrots", 4, 5, 7.4);


        //versione con lo scanner
        for (int i = 0; i < element.length; i++) {
            System.out.println("Inserisci il formato dell'elemento multimediale: 1.IMAGE, 2.AUDIO, 3.VIDEO");
            int selectedEnum = Integer.parseInt(scanner.nextLine());

            //setto il tipo a nullo per accedere
            MultimediaType type = null;

            //lo riempio con lo switch
            switch (selectedEnum) {
                case 1 -> type = MultimediaType.IMAGE;
                case 2 -> type = MultimediaType.AUDIO;
                case 3 -> type = MultimediaType.VIDEO;
                default -> {
                    System.out.println("Numero non valido");
                    i--;
                    //se non uso il continue si rompe tutto, passa direttamente al blocco successivo
                    continue;
                }
            }

            System.out.println("Inserisci il titolo del file");
            String title = scanner.nextLine();

            //faccio uno switch case per ricevere i dati corretti per ogni tipo
            switch (type) {
                case IMAGE -> {
                    System.out.println("Inserisci un numero da 1 a 5 per definire la luminosità");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    element[i] = new Image(title, brightness);
                }
                case AUDIO -> {
                    System.out.println("Inserisci un numero da 1 a 5 per definire il volume");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci un numero da 1 a 5 per definire la durata");
                    int duration = Integer.parseInt(scanner.nextLine());
                    element[i] = new Audio(title, volume, duration);
                }
                case VIDEO -> {
                    System.out.println("Inserisci un numero da 1 a 5 per definire la luminosità");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci un numero da 1 a 5 per definire il volume");
                    int volume = Integer.parseInt(scanner.nextLine());
                    //cambiare tipo di duration da double a int in tutti i file per accettare solo numeri interi
                    System.out.println("Inserisci un numero da 1 a 5 per definire la durata in minuti");
                    int duration = Integer.parseInt(scanner.nextLine());
                    element[i] = new Video(title, brightness, volume, duration);
                }
            }
        }

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
                    if (elements instanceof CanPlay) {
                        CanPlay player = (CanPlay) elements;
                        player.play();
                    }
                    //mentre per Image:
                    if (elements instanceof Image) {
                        Image bright = (Image) elements;
                        bright.show();
                    }
                }
                case 0 -> System.out.println("Programma terminato");
                default -> System.out.println("Numero non valido");
            }

        } while (elementNumber != 0);

        scanner.close();
    }

    //dove uso i metodi per alzare/abbassare il volume, aumentare/diminuire luminosità e get/set durata?
}