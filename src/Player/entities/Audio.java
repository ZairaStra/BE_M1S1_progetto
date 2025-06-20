package Player.entities;

public class Audio extends MultimediaElement implements CanPlay {

    //ATTRIBUTI
    private int volume;

    private double duration;

    //COSTRUTTORI
    public Audio(String title, int volume, double duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }

    //METODI
    public void play() {
        System.out.println("Titolo: " + title + " , volume: " + getVolume());
    }


    @Override
    public int getVolume() {
        return volume;
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
    public double getDuration() {
        return duration;
    }

    @Override
    public void setDuration(double duration) {
        this.duration = duration;
    }

}
