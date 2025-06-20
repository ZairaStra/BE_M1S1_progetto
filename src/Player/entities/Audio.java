package Player.entities;

public class Audio extends MultimediaElement implements CanPlay {

    //ATTRIBUTI
    private int volume;

    private int duration;

    //COSTRUTTORI
    public Audio(String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }

    //METODI
    public void play() {
        System.out.println("Titolo: " + title + " , volume: " + getVolume());
    }


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

}
