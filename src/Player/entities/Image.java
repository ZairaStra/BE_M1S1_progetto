package Player.entities;

public class Image extends MultimediaElement implements CanBright {

    //ATTRIBUTI
    private int brightness;

    //COSTRUTTORI

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    //METODI
    public void show() {
        //al momento ho la luminosità in numero, dovrei averla in asterischi
        System.out.println("Titolo: " + title + " , luminosità: " + getBrightness());
    }

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

}
