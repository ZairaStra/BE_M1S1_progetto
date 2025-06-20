package Player.entities;

public class Video extends MultimediaElement implements CanBright, CanPlay {

    //ATTRIBUTI
    private int brightness;
    private int volume;
    private int duration;

    //COSTRUTTORI
    public Video(String title, int brightness, int volume, int duration) {
        super(title);
        this.brightness = brightness;
        this.volume = volume;
        this.duration = duration;
    }

    //METODI
//    public void show() {
//        //al momento ho la luminosità in numero, dovrei averla in asterischi
//        System.out.println("Titolo: " + title + " , luminosità: " + getBrightness());
//    }


    //CanBright
    @Override
//    public int getBrightness() {
//        return brightness;
//    }
    public String getBrightness() {
        return switch (brightness) {
            case 1 -> "*";
            case 2 -> "**";
            case 3 -> "***";
            case 4 -> "****";
            case 5 -> "*****";
            default -> "";
        };
    }

    @Override
    public void addBrightness() {
        brightness++;
    }

    @Override
    public void removeBrightness() {
        if (brightness > 0) brightness--;
    }
//
//    public void play() {
//        System.out.println("Titolo: " + title + " , volume: " + getVolume());
//    }

    //CanPlay

    @Override
//    public int getVolume() {
//        return volume;
//    }
    public String getVolume() {
        return switch (volume) {
            case 1 -> "!";
            case 2 -> "!!";
            case 3 -> "!!!";
            case 4 -> "!!!!";
            case 5 -> "!!!!!";
            default -> "";
        };
    }

    @Override
    public void addVolume() {
        volume++;
    }

    @Override
    public void removeVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //show() e play() in Video devono essere un unico metodo play che stampa anche la luminosità
    public void play() {
        System.out.println("Titolo: " + title + " , luminosità: " + getBrightness() + " , volume: " + getVolume());
    }
}

