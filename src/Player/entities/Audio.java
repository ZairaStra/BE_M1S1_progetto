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
        String stamp = "Titolo: " + title + " , volume: " + getVolume();
        switch (duration) {
            case 1 -> System.out.println(stamp);
            case 2 -> {
                System.out.println(stamp);
                System.out.println(stamp);
            }
            case 3 -> {
                System.out.println(stamp);
                System.out.println(stamp);
                System.out.println(stamp);
            }
            case 4 -> {
                System.out.println(stamp);
                System.out.println(stamp);
                System.out.println(stamp);
                System.out.println(stamp);
            }
            case 5 -> {
                System.out.println(stamp);
                System.out.println(stamp);
                System.out.println(stamp);
                System.out.println(stamp);
                System.out.println(stamp);
            }
            default -> System.out.println("Durata non valida");
        }
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
